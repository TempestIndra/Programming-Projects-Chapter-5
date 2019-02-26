public class PP5_9Bulb {
    public boolean state;

    public PP5_9Bulb(){
        state = false;
    }

    public void turnOn(){
        state = true;
    }

    public boolean getState(){
        return state;
    }

}

