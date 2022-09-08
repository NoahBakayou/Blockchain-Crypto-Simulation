public class MerkleManager {
    public static volatile String userEnteredWord; //value of variable must never be cached
    public static String userEnteredExpectedMerkleRoot;
    public static String merkleRoot = null;
    public static int strikes = 0;


    public void manage() {


        //https://www.w3resource.com/java-tutorial/java-defining-instantiating-and-starting-threads.php
        //instantiate
        MerkleThread instanceMerkle = new MerkleThread();
        RogueThread instanceRogue = new RogueThread();
        MonitorThread instanceMonitor = new MonitorThread();

        // new threads
        Thread merkleThread = new Thread(instanceMerkle);
        Thread rogueThread = new Thread(instanceRogue);
        Thread monitorThread = new Thread(instanceMonitor);

        merkleThread.start();
        rogueThread.start();
        monitorThread.start();

        Util util1 = new Util();

        while (true) {

            MerkleManager.userEnteredWord = Util.promptUser("Enter the word here: "); //need prompt user method in Util
        }
    }

    public static synchronized String grabWord() {


        String temp = userEnteredWord = null; //means user entered word is set to strign temp which == null

        return temp; //returns string

    }

}
