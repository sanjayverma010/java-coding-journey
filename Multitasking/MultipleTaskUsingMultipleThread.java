// Multiple Task Using Multiple Thread

public class MultipleTaskUsingMultipleThread extends Thread{
    public void run() {
        System.out.println("this is first tak ");
    }
}

class task2 extends Thread {
    public void run() {
        System.out.println("this is second task");
    }
}

class running {
    public static void main(String[] args) {

        MultipleTaskUsingMultipleThread t1 = new MultipleTaskUsingMultipleThread();
        t1.start();

        task2 t2 = new task2();
        t2.start();
    }

}
