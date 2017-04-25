package homework;

/**
 * Created by prots on 25.04.2017.
 */
public class Person {
    private String name;
    private int birthYear;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }
    Person(){
        setName("-");
        setBirthYear(1999);
    }
    Person(String name, int birthYear){
        setName(name);
        setBirthYear(birthYear);
    }
    public int age(){
        return 2017-getBirthYear();
    }
    public void input(String name, int birthYear){
        setName(name);
        setBirthYear(birthYear);
    }
    public String output(){
        return getName()+" "+getBirthYear()+": "+age();
    }
    public void changeName(String name){
        setName(name);
    }

    public static void main(String[] args) {
        Person person1, person2, person3, person4, person5;
        person1 = new Person("Anna", 1997);
        person2 = new Person();
        person3 = new Person("Jane", 1987);
        person4 = new Person();
        person5 = new Person();
        person2.input("Helena",1990);
        person5.input("Karla", 1967);

        System.out.println(person1.output()+"\n"+person2.output()+'\n'+person3.output()+'\n'+person4.output()+'\n'+person5.output());

        System.out.println();

        person4.changeName("Leon");

        System.out.println(person1.output()+"\n"+person2.output()+'\n'+person3.output()+'\n'+person4.output()+'\n'+person5.output());
    }
}

