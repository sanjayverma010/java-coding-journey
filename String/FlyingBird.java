import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FlyingBird extends JPanel implements ActionListener {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private ArrayList<Bird> birds;
    private Timer timer;
    private Random random;
    private float time = 0;

    public FlyingBird() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(new Color(135, 206, 235));
        random = new Random();

        // Create one beautiful bird
        birds = new ArrayList<>();
        birds.add(new Bird(100, 300));

        timer = new Timer(16, this); // ~60 FPS
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        time += 0.02f;
        for (Bird bird : birds) {
            bird.update();
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw gradient sky
        for (int y = 0; y < HEIGHT; y++) {
            float ratio = (float) y / HEIGHT;
            int r = 135 - (int) (ratio * 50);
            int gVal = 206 - (int) (ratio * 50);
            int b = 235 - (int) (ratio * 70);
            g2d.setColor(new Color(Math.max(0, r), Math.max(0, gVal), Math.max(0, b)));
            g2d.drawLine(0, y, WIDTH, y);
        }

        // Draw sun
        drawSun(g2d);

        // Draw clouds
        drawCloud(g2d, 100, 100, 60);
        drawCloud(g2d, 350, 80, 80);
        drawCloud(g2d, 600, 120, 70);
        drawCloud(g2d, 50, 300, 65);
        drawCloud(g2d, 450, 350, 55);

        // Draw ground
        g2d.setColor(new Color(34, 139, 34));
        g2d.fillRect(0, HEIGHT - 50, WIDTH, 50);

        // Draw grass
        drawGrass(g2d);

        // Draw all birds
        for (Bird bird : birds) {
            bird.draw(g2d);
        }

        // Draw floating particles
        if (random.nextInt(10) == 0) {
            g2d.setColor(new Color(255, 255, 200));
            g2d.fillOval(random.nextInt(WIDTH), random.nextInt(HEIGHT - 100), 3, 3);
        }
    }

    private void drawSun(Graphics2D g2d) {
        int sunX = WIDTH - 80;
        int sunY = 80;

        // Sun rays
        g2d.setColor(Color.YELLOW);
        for (int angle = 0; angle < 360; angle += 30) {
            double rad = Math.toRadians(angle);
            int x1 = sunX + (int) (Math.cos(rad) * 45);
            int y1 = sunY + (int) (Math.sin(rad) * 45);
            int x2 = sunX + (int) (Math.cos(rad) * 60);
            int y2 = sunY + (int) (Math.sin(rad) * 60);
            g2d.drawLine(x1, y1, x2, y2);
        }

        // Sun body
        g2d.setColor(new Color(255, 255, 100));
        g2d.fillOval(sunX - 40, sunY - 40, 80, 80);
    }

    private void drawCloud(Graphics2D g2d, int x, int y, int size) {
        g2d.setColor(new Color(255, 255, 255, 220));
        g2d.fillOval(x, y, size, size / 2);
        g2d.fillOval(x - size / 3, y + size / 4, size, size / 2);
        g2d.fillOval(x + size / 3, y + size / 4, size, size / 2);
    }

    private void drawGrass(Graphics2D g2d) {
        g2d.setColor(new Color(0, 150, 0));
        for (int x = 0; x < WIDTH; x += 10) {
            int height = random.nextInt(15) + 5;
            g2d.fillRect(x, HEIGHT - height, 3, height);
        }
    }

    class Bird {
        float x, y;
        float angle;
        float wingAngle;
        float colorIndex;
        Color[] colors = {
                Color.RED, new Color(255, 165, 0), Color.YELLOW,
                Color.GREEN, Color.CYAN, Color.MAGENTA,
                new Color(255, 192, 203), new Color(128, 0, 128)
        };

        Bird(float x, float y) {
            this.x = x;
            this.y = y;
            this.angle = 0;
            this.wingAngle = 0;
            this.colorIndex = 0;
        }

        void update() {
            angle += 0.02f;
            x += 2;
            y = 300 + (float) Math.sin(angle) * 100;
            wingAngle += 0.2f;
            colorIndex += 0.01f;

            if (x > WIDTH + 50) {
                x = -50;
                y = random.nextInt(400) + 100;
            }
        }

        void draw(Graphics2D g2d) {
            int colorIdx = (int) colorIndex % colors.length;
            Color currentColor = colors[colorIdx];
            Color wingColor = new Color(
                    Math.min(255, currentColor.getRed() + 50),
                    Math.min(255, currentColor.getGreen() + 50),
                    Math.min(255, currentColor.getBlue() + 50));

            // Glow effect
            g2d.setColor(new Color(currentColor.getRed(), currentColor.getGreen(), currentColor.getBlue(), 50));
            int glowSize = 60 + (int) (Math.sin(angle * 2) * 10);
            g2d.fillOval((int) x - glowSize / 2, (int) y - glowSize / 2, glowSize, glowSize);

            // Bird body
            g2d.setColor(currentColor);
            g2d.fillOval((int) x - 20, (int) y - 15, 40, 30);

            // Head
            g2d.fillOval((int) x + 15, (int) y - 10, 25, 25);

            // Eye
            g2d.setColor(Color.WHITE);
            g2d.fillOval((int) x + 25, (int) y - 8, 8, 8);
            g2d.setColor(Color.BLACK);
            g2d.fillOval((int) x + 27, (int) y - 7, 4, 4);

            // Beak
            g2d.setColor(Color.ORANGE);
            int[] beakX = { (int) x + 35, (int) x + 48, (int) x + 35 };
            int[] beakY = { (int) y - 7, (int) y - 4, (int) y - 1 };
            g2d.fillPolygon(beakX, beakY, 3);

            // Wings
            float wingOffset = (float) Math.sin(wingAngle) * 15;
            g2d.setColor(wingColor);

            // Top wing
            int[] wingTopX = { (int) x - 10, (int) x - 30, (int) x - 5 };
            int[] wingTopY = { (int) y - 10, (int) (y - 20 - wingOffset), (int) y - 5 };
            g2d.fillPolygon(wingTopX, wingTopY, 3);

            // Bottom wing
            int[] wingBottomX = { (int) x - 10, (int) x - 30, (int) x - 5 };
            int[] wingBottomY = { (int) y + 5, (int) (y + 15 + wingOffset), (int) y + 2 };
            g2d.fillPolygon(wingBottomX, wingBottomY, 3);

            // Tail
            int[] tailX = { (int) x - 15, (int) x - 40, (int) x - 40 };
            int[] tailY = { (int) y, (int) y - 12, (int) y + 12 };
            g2d.fillPolygon(tailX, tailY, 3);

            // Draw "panchhi" above the bird
            g2d.setColor(Color.BLACK);
            g2d.setFont(new Font("Arial", Font.BOLD, 16));
            g2d.drawString("panchhi", (int) x - 20, (int) y - 40);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flying Bird in Sky");
        FlyingBird panel = new FlyingBird();
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}