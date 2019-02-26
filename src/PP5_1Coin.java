public class PP5_1Coin {
    private final boolean HEADS = true;

    private boolean face;

    public PP5_1Coin(){
        flip();
    }

    public void flip(){
        face = Math.random() > 0.5;
    }


    public boolean isHeads(){
        return (face == HEADS);
    }

    public String toString(){
        return (face == HEADS) ? "Heads" : "Tails";
    }
}

/*
* Revise the Coin class such that its state is represented internally
* using a boolean variable. Test the new versions of the class as
* part of the CountFlips and FlipRace program
*/
