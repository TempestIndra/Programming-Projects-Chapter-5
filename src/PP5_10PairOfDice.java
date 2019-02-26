public class PP5_10PairOfDice {

    private final int MAX = 6;

    private int faceValue1;
    private int faceValue2;

    public PP5_10PairOfDice(){
        PP5_10Die die1 = new PP5_10Die();
        PP5_10Die die2 = new PP5_10Die();
    }

    public void roll(){
        faceValue1 = (int) (Math.random() * MAX) + 1;
        faceValue2 = (int) (Math.random() * MAX) + 1;
    }

    public int getSide1(){
        return faceValue1;
    }
    public int getSide2(){
        return faceValue2;
    }
}
