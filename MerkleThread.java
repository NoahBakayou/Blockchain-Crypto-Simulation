import java.util.ArrayList;

public class MerkleThread implements Runnable{

    // Instance Variables
    public static volatile ArrayList<String> lstWords;
    private int iMerkleTreeInputs = 4;


    public void run(){
        lstWords = new ArrayList();

        while(true){
            Util oUtil = new Util();
            oUtil.sleepRandomTime(MerkleThread);
            String sNewWord = MerkleManager.grabWord();
            if(sNewWord!=null)
            {
                System.out.println("Merkle grabbed a word!");
                lstWords.add(sNewWord);

                if(lstWords.size() == iMerkleTreeInputs)
                {
                    MerkleManager.sMerkleRoot = oUtil.getMerkleRoot(lstWords);
                }
            }


        }


    }
}
