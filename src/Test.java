/**
 * Created by christopherburns on 9/8/16.
 */
class Animal {
    String name;
    int age;
//

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Test{
    public static void main(String[] args) {
//
        Animal pet3 = new Animal("kendrick ", 2);
        System.out.println(pet3.name + pet3.age);
    }

}
