public class PP5_6BoxTest {
    public static void main(String[] args){
        PP5_6Box box1 = new PP5_6Box(2,3,1);
        PP5_6Box box2 = new PP5_6Box(4,5,6);

        System.out.println(box1);
        box1.setDepth( 2 );
        box1.setFull( true );
        System.out.println("box one is full? \n" + box1.getFull());
    }

}

/*
* Design and implement a class called box that contains instance
* data that represent the height, width, and depth of the box. Also
* include a boolean variable called full as instance data that rep-
* resent whether the box is full or not. Define the Box constructor
* to accept and initialize the height, width, and depth of the box.
* Each newly created box is empty (the constructor should initialize
* full to false). Include getter and setter methods for all instance
* data. Include a toString method that returns a one-line descrip-
* tion of the box. Create a driver class called BoxTest, whose main
* method instantiates and updates several Box objects
*/