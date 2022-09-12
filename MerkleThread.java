import java.util.ArrayList;

public class MerkleThread implements Runnable{

    // Instance Variables
    public static volatile ArrayList<String> lstWords;
    private int iMerkleTreeInputs = 4;


    public void run(){
        Util oUtil = new Util();
        lstWords = new ArrayList<>();

        while(true){
            oUtil.sleepRandomTime("Merkle Thread");
            String sNewWord = MerkleManager.grabWord();
            if(sNewWord!=null)
            {
                System.out.println("Merkle grabbed a word!");
                lstWords.add(sNewWord);

                if(lstWords.size() == iMerkleTreeInputs)
                {
                    MerkleManager.actualMerkleRoot = oUtil.getMerkleRoot(lstWords);
                }
            }


        }


    }
}
