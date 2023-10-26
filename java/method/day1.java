class Animal {
    String name;
    int legs;
    String eats;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLegs(int legas) {
        this.legs = legas;
    }

    public int getLegs() {
        return legs;
    }

    public void setEat(String eats) {
        this.eats = eats;
    }

    public String getEat() {
        return eats;
    }

    class Dog extends Animal {
        String barks;
        String Speed;

        public Dog(String barks, String speed) {
            this.barks = barks;
            this.Speed = speed;
        }
    }
}

public class day1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setName("Doggy");
        System.out.println(a.getName());
        a.setLegs(4);
        System.out.println(a.getLegs());
        a.setEat("The Doggy Eat All Type Of meet");
        System.out.println(a.getEat());

        Animal n=new Animal();
        n.setName("Puppy");
        System.out.println(n.getName());
        n.setLegs(2);
        System.out.println(n.getLegs());
        n.setEat("The Cheetah of found is fond of Eating Deers");
        System.out.println(n.getEat());

    }
}