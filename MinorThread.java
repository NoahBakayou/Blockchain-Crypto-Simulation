public class MinorThread implements Runnable {

    public String threadName; //instance variable

    public void run() {
        System.out.println(threadName + " started");

        while (true) {
            //endless loop
            System.out.println(threadName + " has woken up");
            Util oUtil = new Util();
            oUtil.sleepRandomTime(threadName);
        }
    }
}
