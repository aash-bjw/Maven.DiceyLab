public class Dice {


    public Dice(){}


    public Integer rollDie(Integer numOfDice) {

        Integer result = 0;

        for (int i = 0; i < numOfDice; i++) {

           result += (int) (1 + (Math.random() * 6));

        } return result;
    }
}


