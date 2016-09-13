package burns.chris.InitializationLab2;

/**
 * Created by christopherburns on 9/12/16.
 */
public class People {
    String name;
    int age;


    People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
