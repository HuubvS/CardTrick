public class TestingTimer {

    public void run() throws InterruptedException {
        Thread.sleep(4500);
        System.out.println("My message");
        run();

        // tbc
    }
}
