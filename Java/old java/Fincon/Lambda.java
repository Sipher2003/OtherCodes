public class Lambda {
    public static void main(String[] args) {
        Runnable r=()->System.out.println("hello");
        new Thread(r).start();
    }
}
