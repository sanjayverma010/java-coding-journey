public class Perceptron {

    public static void main(String[] args) {
        double eta = 1.0;
        int[][] X = {
            {1, 0, 0, 0},
            {1, 0, 0, 1},
            {1, 0, 1, 0},
            {1, 0, 1, 1},
            {1, 1, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 1, 0},
            {1, 1, 1, 1}
        };

        int[] d = {0, 0, 0, 0, 1, 1, 1, 1};
        double[] W = {-5, 3, -2, -1};

        int updated = 1;
        int epoch = 0;

        while (updated == 1) {
            epoch++;
            updated = 0;
            int[] update = new int[8];

            for (int k = 0; k < 8; k++) {
                double y = 0;
                for (int i = 0; i < 4; i++) {
                    y += W[i] * X[k][i];
                }
                if (y >= 0 && d[k] == 0) {
                    for (int i = 0; i < 4; i++) {
                        W[i] -= eta * X[k][i];
                    }
                    update[k] = 1;

                } else if (y <= 0 && d[k] == 1) {
                    for (int i = 0; i < 4; i++) {
                        W[i] += eta * X[k][i];
                    }
                    update[k] = 1;
                }
            }
        }
            
    }
}
  