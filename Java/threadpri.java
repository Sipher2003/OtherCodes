public class threadpri extends Thread {
    public void run() {
        System.out.println("Running thread is " + Thread.currentThread().getName());
        System.out.println("Running thread priority is " + Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        threadpri t1 = new threadpri();
        threadpri t2 = new threadpri();
        threadpri t3 = new threadpri();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
