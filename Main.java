import se.GroupAnimal.*;

public class Main {
    public static void main(String[] args){
        Animal Cat= new Cat("Måns",12,"banan",true,30000,"Robert");
        Animal Elphant= new Elefant("yo");
        Person p1=new Personne("Anders",20);
        Insurable in= new Insurrance(2,"890000","Zack",100);

        speed(Cat);
        speed(Elphant);
        greetings(p1);
        pay(in);
    }
    public static void pay(Insurable in){
        in.calculateMonthlyPayment();
    }
    public static void speed(Animal a){
        a.run();
    }
    public static void greetings(Person p1){
        p1.greet();
    }
}
