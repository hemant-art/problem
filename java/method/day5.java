interface Bicycle{
    int a =45;
    void applyBreak(int decreament);
    void speedUp(int increameant);
}
interface HornBicycle{
    int x=45;
    void blowhorn3kg();
    void blowHornHmn();
}
class HemantCycle implements Bicycle,HornBicycle{
    void blowhorn(){
        System.out.println("pee pee poo poo");
    }

    @Override
    public void blowhorn3kg() {
        System.out.println("Kabhi khusi kabhi gum");
      
    }

    @Override
    public void blowHornHmn() {
       System.out.println("Main hua nah");
    }

    @Override
    public void applyBreak(int decreament) {
      System.out.println("Applying Break");
    }

    @Override
    public void speedUp(int increameant) {
        System.out.println("Applying Speed");
    }
    
}
public class day5{
    public static void main(String[] args) {
        HemantCycle cycleHemant=new HemantCycle();
        cycleHemant.applyBreak(1);
        System.out.println(cycleHemant.a);
        System.out.println(cycleHemant.x);
        cycleHemant.blowhorn3kg();
        cycleHemant.blowHornHmn();
    }
}