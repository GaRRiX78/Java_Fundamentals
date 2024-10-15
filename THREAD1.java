class main2 extends Thread{
    int available;
    public void samp(int available){
        this.available=available;
    }
    synchronized public void run() {
        if(available == 1) {
            System.out.println("Available " + available);
            System.out.println("Booked");
            available--;
        }
        else {
            System.out.println("Available " + available);
            System.out.println("Not Booked");
        }
    }
}

public class THREAD1 {
    public static void main(String args[])
    {
        main2 m1 = new main2();
        m1.samp(1);
        m1.start();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        main2 m2 = new main2();
        m2.start();
    }
}