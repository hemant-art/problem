import javax.swing.text.PlainDocument;

class Employee
{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}
class cellPhone
{
    public void ring()
    {
        System.out.println("ringing...");
    }
    public void vibrate()
    {
        System.out.println("vibrating...");
    }
}
class square{
    int side;
    public int area(){
        return side*side;

    }
    public int perimeter(){
        return 4*side;
    }
}
class rectangle{
    int length;
    int breadth;
    int area;
    int perimeter;
    public int calcArea()
    {
        area=length*breadth;
        return area;
    }
    public int clacPerimeter()
    {
        perimeter=2*(length+breadth);
        return perimeter;
    }
}
class Tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("running the enemy");
    }
    public void fire()
    {
        System.out.println("fireing the enemy");
    }
}


public class problem
{
    public static void main(String []args)
    {
        //problem 1
        Employee hemant=new Employee();
        hemant.setName("wellcomehemant");
        hemant.salary=233;
        System.out.println(hemant.getSalary());
        System.out.println(hemant.getName());
        //problem2
        cellPhone poco=new cellPhone();
        poco.ring();
        poco.vibrate();
        //problem 3
        square sq=new square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        //problem 4
        rectangle ra=new rectangle();
        ra.length=2;
        ra.breadth=4;
        System.out.println(ra.calcArea());
        System.out.println(ra.clacPerimeter());
        //problem 5
        Tommy player= new Tommy();
        player.fire();
        player.hit();
        player.run();

    }
}