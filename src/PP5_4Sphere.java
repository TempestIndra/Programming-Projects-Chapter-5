public class PP5_4Sphere {

    public int diameter;

    public PP5_4Sphere(int d){
        diameter = d;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int d){
        diameter = d;
    }

    public double getVolume(){
        return (4*Math.PI *Math.pow((diameter/2),3))/3;
    }

    public double getSurfacearea(){
        return 4 * Math.PI * Math.pow((diameter/2),2);
    }

    public String toString(){
        return "Circle have Diameter of " + diameter + "\nTotal volume " + getVolume();
    }
}
