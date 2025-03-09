import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private String password;
    private ArrayList<Character>characters;

    public Player(){
        this.name="Unknown";
        this.password="Unknown";
        this.characters=new ArrayList<>();
    }

    public Player(String name, String password, ArrayList<Character> characters) {
        this.name = name;
        this.password = password;
        this.characters = characters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }
    public double getTotalPower(){
        double totalDamage=0;
        for(Character character:characters){
            totalDamage +=character.calculateDamage();
        }
        return totalDamage;
    }

    private void printPlayerInfo(){
        System.out.println("Player Name: " + name);
        System.out.println("Password: " + password);
        System.out.println("Characters: ");
        for(Character character: characters){
            character.printInfo();
        }

    }
    public static class Achievement{

        private List<String>unlockedAchievements;

        public Achievement(){
            unlockedAchievements=new ArrayList<>();
        }
        public void addAchievement(String achievement){
            unlockedAchievements.add(achievement);
        }
        public void printAchievements(){
            System.out.println("Achievements unlocked: ");
            for(String achievement:unlockedAchievements){
                System.out.println(achievement);
            }
        }
    }
    public Achievement getAchievement(){
        return new Achievement();
    }

}
