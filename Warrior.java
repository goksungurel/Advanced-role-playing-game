public class Warrior extends Character{
    private int energy;
    private int defense;

    public Warrior() {
        super();
        this.energy = 20;
        this.defense = 5;
    }
    public Warrior(String name,double hitPoint, String gender){
        super(name,hitPoint,gender);
        this.energy =20;
        this.defense = 5;

    }
    private void rest(){
        energy+=20;
        System.out.println("Energy after rest: "+energy);
    }
    public double calculateDamage(){
       return getHitPoint()*1.2;

    }
    public void attack(){

        if(energy<10){
            System.out.println("Not enough energy.Get rest...");
            rest();

        }else {
            energy -= 10;
            super.attack();
            System.out.println("Remaining energy: " + energy);
        }

    }
    public void regeneratePower(){
       rest();
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Energy: " + energy);
        System.out.println("Defense: " + defense);
    }

}
