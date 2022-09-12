public class MerkleManager {
    public static volatile String userEnteredWord; //value of variable must never be cached
    public static String expectedMerkleRoot;
    public static String actualMerkleRoot = null;
    public static int iStrikes = 0;


    public void manage() {
        Util util1 = new Util();

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

        String sQuestion0 = "Enter expected merkle root (use https://xorbin.com/tools/sha256-hash-calculator): ";
        expectedMerkleRoot = util1.promptUser(sQuestion0);

        while (true) {

            MerkleManager.userEnteredWord = util1.promptUser("Enter the word: "); //need prompt user method in Util
        }
    }

    public static synchronized String grabWord() {


        String temp = userEnteredWord;
        userEnteredWord = null; //means user entered word is set to string
        // temp which == null

        return temp; //returns string

    }
}
