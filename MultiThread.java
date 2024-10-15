class main3 extends Thread
{
    public void run()
    {
        System.out.println("Hi...");
    }
}

public class MultiThread
{
    public static void main(String[] args) throws InterruptedException {
        main3 m = new main3();
        main3 m1 = new main3();
        main3 m2 = new main3();
        m.start();
        Thread.sleep(1000);
        m1.start();
    }
}
