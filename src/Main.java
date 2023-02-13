import person.Builder;
import person.Driver;
import person.Programmer;

public class Main {
    public static void main(String[] args) {
        Programmer programmer=new Programmer();
        System.out.println("Name"+programmer.getName());
        Programmer.setAge(18);
        System.out.println("Age"+ Programmer.getAge());
        programmer.working();

        Driver driver=new Driver();
        System.out.println("Name: "+driver.getName());
        Driver.setAge(23);
        System.out.println("Age"+Programmer.getAge());
        driver.working();

        Builder builder=new Builder();
        System.out.println("name"+programmer.getName());
        Builder.setAge(45);
        System.out.println("Age"+Builder.getAge());
        builder.working();
   }
}