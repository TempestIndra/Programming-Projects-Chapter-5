public class PP5_2Coin {
    private final String HEADS = "head";

    private String face;

    public PP5_2Coin(){
        flip();
    }

    public void flip(){
        if(Math.random() > 0.5){
            face = "head";
        }else{
            face = "tail";
        }
    }

    public boolean isHeads(){
        return face.equals(HEADS);
    }

    public String toString(){
        return face.equals(HEADS) ? "Heads" : "Tails";
    }
}

/*
* Repeat Programming Project 5.1, representing the state of the
* coin using a character string
*/
