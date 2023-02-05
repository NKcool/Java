package local.pack;

public class Human {

    String name ;
    int age;
    int sallary;
    Boolean married;

    static int population;
    public Human(String name, int age, int sallary, boolean married) {
        this.name = name;
        this.age = age;
        this.sallary = sallary;
        this.married = married;
        Human.population += 1;
    }
}
