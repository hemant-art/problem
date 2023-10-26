abstract class pen{
    abstract void write();
    abstract void refil();
}
class fountainPen extends pen{
    void write(){
        System.out.println("Writting....");
    }
    void refil(){
        System.out.println("refil..");
    }
}
class monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Bitting....");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends monkey implements BasicAnimal{
    void Speek(){
        System.out.println("Hello sir!");
    }
    @override
    public void eat(){
        System.out.println("Eating Food!");
    }
    @Override
    public void sleep(){
        System.out.println(" Sleeping...");
    }
}
abstract class Telephone{
    abstract void with();
    abstract void lift();
    abstract void disconnected();
}
class SmartTelephone extends Telephone{

    @Override
    void with() {
        System.out.println("With you");
    }

    @Override
    void lift() {
        System.out.println("lift.");
    }

    @Override
    void disconnected() {
        System.out.println("Network Disconnected");
    }
    void openGps(){
        System.out.println("opening Gps");
    }
    
}
interface Tvremote{
    void change();
    
}
interface smartTvremote extends Tvremote{
    void volumeUp();
    void volumeDown();
}
class Tv implements smartTvremote{
    public void change(){
        System.out.println(" Change the Channel");
    }
    public void volumeUp(){
        System.out.println("volume up....");
    }
    public void volumeDown()
    {
        System.out.println("volume down...");
    }
}
public class day6 {
    public static void main(String[] args) {
        fountainPen s= new fountainPen();
        s.write();
        s.refil();
        //Q3
        Human Hemant=new Human();
        Hemant.Speek();
        //Q5
        monkey m1= new Human();
        m1.bite();
        m1.jump();
        BasicAnimal lovesh=new Human();
        lovesh.eat();
        lovesh.sleep();
        // q4
        Telephone t=new SmartTelephone();
        t.disconnected();
        // Q6,7
        Tv my=new Tv();
        my.change();
        my.volumeDown();
        my.volumeUp();
    }
}
