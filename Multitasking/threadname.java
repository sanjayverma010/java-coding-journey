class threadname extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }
    public static void main(String []args)
    {
        threadname td = new threadname();
        td.start();
        threadname td1 = new threadname();
        td1.start();

        System.out.println(td.isAlive());
    }
}