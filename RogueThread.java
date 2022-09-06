public class RogueThread implements Runnable{

    String threadName;

    public void run() {
        Util oUtil = new Util();
        MerkleManager oMerkleManager = new MerkleManager();
        while(true) {
            oUtil.sleepRandomTime(threadName);
            String sNewWord = MerkleManager.grabWord();
            if(sNewWord != null) {
                MerkleManager.iStrikes++;
                System.out.println("STRIKE! " + MerkleManager.iStrikes);
            }
        }
    }
}

