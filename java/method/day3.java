class phone{
    public void ShowTime(){
        System.out.println("Time is 6 am");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}
class SmartPhone extends phone{
    public void music(){
        System.out.println("playing music....");
    }
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class day3 {
    public static void main(String[] args) {
            phone obj= new SmartPhone();
            obj.ShowTime();
            obj.on();
    }
    
}
