package lesson4;

public class Test {

    final static Object mon = new Object();

    public static void main(String[] args) {

        new Thread(() -> {

            synchronized (mon) {
                for (int i = 0; i < 5; i++) {
                    System.out.print("A");
                    try {
                        mon.wait();
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    mon.notifyAll();
                }

            }

        }).start();

        new Thread(() -> {
            synchronized (mon) {

                for (int i = 0; i < 5; i++) {

                    System.out.print("B");
                    try {
                        mon.wait();
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                mon.notifyAll();
            }
        }).start();

        new Thread(() -> {
            synchronized (mon) {
                for (int i = 0; i < 5; i++) {
                    mon.notify();
                    System.out.print("C");
                    try {
                        mon.wait();
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                mon.notifyAll();
            }
        }).start();
    }
}
