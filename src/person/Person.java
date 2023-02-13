package person;

public class Person {

    private final String name = "Abduamlik";
    public static int age;



    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    @Override
    public String toString() {
        return
                "name='" + name ;

    }

    public void working(){
        System.out.println();
    }

}