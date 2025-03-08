import java.util.Random;

public class Mage extends Character {
    private int mana;
    private double criticalChance;

    public Mage() {
        super();
        this.mana = 10;
    }
    public Mage(String name, double hitPoint, String gender) {
        super(name, hitPoint, gender);
        this.mana=10;
        this.criticalChance = 0.1;

    }
    private void drinkPotion() {
        mana += 10;
        System.out.println("New mana is: " + mana);
    }
    public double calculateDamage(){
        double damage=getHitPoint()*0.8;
        Random random = new Random();
        double chance=random.nextDouble();

        if(chance<criticalChance){
            damage *= 2;
            System.out.println("Critical hit!Damage doubled.");
        }
        return damage;
    }

    public void attack(){
        if(mana<5){
            System.out.println("Not enough mana.Drink potion...");
            drinkPotion();

        }else{
            mana-=5;
            super.attack();
            System.out.println("Remaining mana is "+mana);
        }
    }
    public void regeneratePower(){
        drinkPotion();

    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Mana: " + mana);
        System.out.println("Critical Chance: " + (criticalChance * 100) + "%");
    }

}
