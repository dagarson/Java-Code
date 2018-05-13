public class deadLock {

static {
    System.out.println("startup deadlock code");
    try {
        Thread t = new Thread(new Runnable(){

            @Override
            public void run() {
                deadLock.initialize();
            }

        });
        t.start();
        t.join();
    } catch (InterruptedException ex) {
        System.out.println("won't see this code");
    }
}

public static void main(String[] args) {
    System.out.println("Java is Fun");
}

public static void initialize(){
    System.out.println("Initializing");
}

}
