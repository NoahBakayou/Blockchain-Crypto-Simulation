// Monitor Thread

public class MonitorThread implements Runnable {

    public void run() {
        while (true) {
            if (MerkleManager.actualMerkleRoot != null) {
                if (MerkleManager.expectedMerkleRoot.equals(MerkleManager.actualMerkleRoot)) {
                    System.out.println("**** YOU WIN **** " + MerkleManager.actualMerkleRoot);
                }
                else {
                    System.out.println("**** YOU LOSE **** ");
                    System.out.println("      You entered: " + MerkleManager.expectedMerkleRoot);
                    System.out.println("Correct answer is: " + MerkleManager.actualMerkleRoot);
                }
                System.out.println("\nExiting app...");
                System.exit(0);
            }
            if (MerkleManager.strikeCount == 3) {
                System.out.println("*** THREE STRIKES: *** YOU'RE OUT! ***");
                System.out.println("\nExiting app...");
                System.exit(0);
            }

            Util util = new Util();
            util.sleep(1);
        }
    }
}