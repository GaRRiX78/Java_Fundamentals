public class NewThreadj {


    static class ExtendThread {
        ExtendThread() {
        }

        public static void main(String[] var0) {
            new NewThreadj();

            try {
                for(int var1 = 5; var1 > 0; --var1) {
                    System.out.println("Main Thread: " + var1);
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException var2) {
                System.out.println("Main thread interrupted.");
            }

            System.out.println("Main thread exiting.");
        }
    }

}
