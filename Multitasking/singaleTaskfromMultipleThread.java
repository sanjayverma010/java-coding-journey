// PERFORM singale Task from MultipleThread
public class singaleTaskfromMultipleThread extends Thread {
    public void run() {
        System.out.println("this is the task ");
    }

    public static void main(String[] args) {
        singaleTaskfromMultipleThread st = new singaleTaskfromMultipleThread();
        st.start();
        singaleTaskfromMultipleThread st2 = new singaleTaskfromMultipleThread();
        st2.start();

    }
}
