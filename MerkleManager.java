public class MerkleManager {
    public static volatile String userEnteredWord; //value of variable must never be cached
    public static String userEnteredExpectedMerkleRoot;
    public static String merkleRoot = null;
    public static int strikes = 0;


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


        while (true) {

            MerkleManager.userEnteredWord = util1.promptUser("Enter the word: "); //need prompt user method in Util
        }
    }

    public static synchronized String grabWord() {


        String temp = userEnteredWord = null; //means user entered word is set to string
        // temp which == null

        return temp; //returns string

    }

}
