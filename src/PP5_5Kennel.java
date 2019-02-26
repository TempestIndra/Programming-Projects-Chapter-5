public class PP5_5Kennel {
    public static void main(String[] args){
        PP5_5Dog dog1 = new PP5_5Dog("bob", 20);
        System.out.println(dog1);
        System.out.println(dog1.getName());
        dog1.setAge( 2 );
        dog1.setName("Max");
        System.out.println( dog1.getPersonYear());
    }
}

/*
* Design and implement a class called Dog that contains instance
* data that represent the dog's name and age. Define the Dog con-
* structor to accept and initialize instance data. Include getter and
* setter methods for the name and age. Include a method to com-
* pute and return the age of the dog in "person year" (Seven times
* the dog's age). Include a toString method that returns a one-line
* description of the dog. Create a driver class called Kennel, whose
* main method instantiates and updates several Dog objects
*/