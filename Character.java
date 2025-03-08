public class Character {
private String name;
private double hitPoint;
private String gender;
private int level;
private int experience;

public Character(String name, double hitPoint, String gender) {
    this.setName(name);
    this.setHitPoint(hitPoint);
    this.setGender(gender);
    this.setLevel(1);
    this.setExperience(0);

}
    public double calculateDamage(){
    return hitPoint;
    }

    public void attack(){
        System.out.println("Attacking...Damage is: " +calculateDamage());
        gainExperience(20); 
    }

    public void regeneratePower(){
        System.out.println("Regenerating Power is: " );
    }

    public void gainExperience(int xp){
    experience += xp;
    levelUp();
    }

    public void levelUp(){
    if(experience>=100){
        level++;
        experience = 0;
    }
    }

    public void printInfo(){
            System.out.println("Name: " + name);
            System.out.println("Hit Point: " + hitPoint);
            System.out.println("Gender: " + gender);
            System.out.println("Level: " + level);
            System.out.println("Experience: "+experience);
    }


public String getName() {
    return name;
}
public double getHitPoint() {
    return hitPoint;
}
public String getGender() {
    return gender;
}
public int getLevel() {
    return level;
}
public int getExperience() {
    return experience;
}
public void setLevel(int level) {
    this.level = level;
}
public void setExperience(int experience) {
    this.experience = experience;
}

 public void setName(String name) {
        this.name = name;
    }

 public void setHitPoint(double hitPoint) {
        this.hitPoint = hitPoint;
    }

public void setGender(String gender) {
        this.gender = gender;
    }


}
