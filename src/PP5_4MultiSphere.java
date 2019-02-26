public class PP5_4MultiSphere {
    public static void main(String[] args){
        PP5_4Sphere sphere1 = new PP5_4Sphere(1);
        PP5_4Sphere sphere2 = new PP5_4Sphere(2);
        PP5_4Sphere sphere3 = new PP5_4Sphere(3);
        PP5_4Sphere sphere4 = new PP5_4Sphere(4);
        System.out.println(sphere1);
        System.out.println(sphere2.getDiameter());
        System.out.println(sphere3.getSurfacearea());
        System.out.println(sphere4.getVolume());
    }
}

/*
* Design and implement a class called Sphere that contains in-
* stance data that represent that sphere's diameter. Define the
* Sphere constructor to accept and initialize the diameter, and
* include getter and setter methods for the diameter. Include meth-
* ods that calculate and return the volume and surface area of the
* sphere. Include a toString method that returns a one-line description
* of the sphere. Create a driver class called Multisphere, whose main
* method instantiates and updates several Sphere objects
*/
