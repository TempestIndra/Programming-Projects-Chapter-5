public class PP5_3Coin {
    private enum possible{
        TAIL,HEAD
    }

    private possible face;


    public PP5_3Coin(){
        flip();
    }

    public void flip(){
        if(Math.random() > 0.5) {
            face = possible.TAIL;
        }
        else{
            face = possible.HEAD;
        }
    }

    public boolean isHeads(){
        return face.equals(possible.HEAD);
    }

    public String toString(){
        return face.equals(possible.HEAD) ? "Heads" : "Tails";
    }
}
