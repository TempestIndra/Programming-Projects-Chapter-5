public class PP5_9lights {
    public static void main(String[] arg){
        PP5_9Bulb bulb1 = new PP5_9Bulb();
        System.out.println(bulb1.getState());
        bulb1.turnOn();
        System.out.println(bulb1.getState());
    }
}

/*
 * Design and implement a class called Bulb that represents a light
 * bulb that can be turned on and off. Create a driver class called
 * lights, whose main methods instantiates and turn on some Bulb
 * object
 */
