public class PP5_10SnakeEyes {
    public static void main(String [] args){

        final int ROLLS = 500;
        int num1, num2, count = 0;

        PP5_10PairOfDice die1 = new PP5_10PairOfDice();

        for(int roll = 1; roll<= ROLLS; roll++){
            die1.roll();
            num1 = die1.getSide1();
            num2 = die1.getSide2();

            if(num1 == 1 && num2 == 1)
                count++;
        }

        System.out.println("Number of rolls: " + ROLLS);
        System.out.println("Number of snake eyes: " + count);
        System.out.println("Ratio: " + (float)count/ROLLS);
    }
}

