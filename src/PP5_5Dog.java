public class PP5_5Dog {

    public String name;
    public int age;

    public PP5_5Dog(String n, int a){
        name = n;
        age = a;
    }

    public void setName(String n){
        name = n;
    }

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getPersonYear(){
        return age *7;
    }

    public String toString(){
        return "dog name " + name + " it " + age + " years old";
    }
}
