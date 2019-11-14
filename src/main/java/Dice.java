public class Dice {

    Integer diceNum;

    public Dice(Integer diceNum) {
        this.diceNum = diceNum;
    }


    public Integer rollDie() {
        Integer result = 0;
        for (int i = 0; i < diceNum; i++) {
            result += (int) (1 + (Math.random() * 6));
        }
        return result;
    }

}


