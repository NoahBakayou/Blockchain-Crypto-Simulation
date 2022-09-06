public class MonitorThread implements Runnable {

    public String grabWord;

    @Override
    public void run() {
        while (true) {

            if (merkleManager.sMerkleRoot != null) {
                if (merkleManager.sMerkleRoot == merkleManager.userEnteredExpectedMerkleRoot) {
                    System.out.println("You win" + merkleManager.sMerkleRoot);
                    System.exit(0);

                } else if (merkleManager.sMerkleRoot != merkleManager.userEnteredExpectedMerkleRoot) {
                    System.out.println("You Lose");
                    System.exit(0);

                } else if (merkleManager.iStrikes == 3) {
                    System.out.println("3 strikes: you lost!");
                    System.exit(0);
                }
            }
            try {
                Thread.sleep(iSeconds * 1000);
            } catch (Exception ex) {
            }
        }
    }
}
