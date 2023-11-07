class circle{
    public int radius;
    circle(){
        System.out.println("I am nonpraram of circle ");
    }
    circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
    public void setRadius(double d) {
    }
    public double getRadius() {
        return null;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r,int h){
        super(r);
        System.out.println("I am cylinder ");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
    public void setHeight(double d) {
    }
    public char[] getHeight() {
        return null;
    }
}
public class day4 {
    public static void main(String[] args) {
        circle obj2=new circle(12);
        double result=obj2.area();
        System.out.println(result);
       cylinder obj=new cylinder(12, 21);
        double result2=obj.volume();
        System.out.println(result2);
        
    }
}
