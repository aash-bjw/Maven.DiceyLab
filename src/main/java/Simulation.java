import java.util.TreeMap;

public class Simulation {


    private Bins bins;
    private Integer numOfTosses;
    private Integer diceNum;
    private Dice dice;
    private Integer numResult;

    StringBuilder sb = new StringBuilder();

    TreeMap<Integer, Integer> binMap = new TreeMap<Integer, Integer>();


    public Simulation(Integer diceNum, Integer numOfTosses) {
        this.diceNum = diceNum;
        this.numOfTosses = numOfTosses;
        dice = new Dice(diceNum);
        bins = new Bins(diceNum, diceNum * 6);

    }

    public void runSim() {
        int counter = 0;
        for (int i = 0; i <= this.numOfTosses; i++) {
            //numResult = dice.rollDie();
            bins.incrementBin(i, dice.rollDie());

        }
    }

    public void printResults() {
        System.out.println("***********************************************");
        System.out.println("Simulation of " + dice.diceNum + " dice tossed for " + numOfTosses + " times.");
        System.out.println("***********************************************\n");
        for (int i = dice.diceNum; i <= 6 * dice.diceNum; i++) {
            Integer currentBin = bins.getBin(i);
            Double percent = (double) currentBin / (double) numOfTosses;
            Integer stars = (int) (percent * 100);
            for (int j = 0; j < stars; j++) {
               sb.append("*");
            }
            System.out.println(String.format("%2d:%9d: %1.2f ", i, currentBin, percent) + sb.toString());
        }
    }


}


