import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // *** BEGIN Merkle root test ***
        ArrayList<String> lstTransactions = new ArrayList<>();
        lstTransactions.add("T1");
        lstTransactions.add("T2");
        lstTransactions.add("T3");
        lstTransactions.add("T4");

        Util oUtil = new Util();
        String sMerkleRoot = oUtil.getMerkleRoot(lstTransactions);
        System.out.println(sMerkleRoot);

        // TODO: Multithreading

        MinorThread oMiner1 = new MinorThread();
        oMiner1.threadName = "Thread 1";
        Thread oThread1 = new Thread(oMiner1);
        oThread1.start(); //start eventually calls run

        MinorThread oMiner2 = new MinorThread();
        oMiner1.threadName = "Thread 2";
        Thread oThread2 = new Thread(oMiner2);
        oThread2.start();
        System.out.println("This is the main thread after other threads spawned.");
    }

}

