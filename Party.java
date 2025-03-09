import java.util.ArrayList;

public class Party {
    private String partyName;
    private ArrayList<Character> members;
    private int powerBalance;
    private int reputation;

    public Party() {
        this.partyName = "Unnamed Party";
        this.members = new ArrayList<>();
        this.powerBalance = 0;
        this.reputation = 0;
    }

    public Party(String partyName) {
        this.partyName = partyName;
        this.members = new ArrayList<>();
        this.powerBalance = 0;
        this.reputation = 0;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    // Getter and Setter for members
    public ArrayList<Character> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Character> members) {
        this.members = members;
    }

    // Getter and Setter for powerBalance
    public int getPowerBalance() {
        return powerBalance;
    }

    public void setPowerBalance(int powerBalance) {
        this.powerBalance = powerBalance;
    }

    // Getter and Setter for reputation
    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }


    public void addMember(Character character) {
        if (members.size() < 10) {
            members.add(character);
            System.out.println(character.getName() + " has been removed from the party.");
        } else {
            System.out.println("Party is full!");
        }

    }

    public void removeMember(Character character) {
        if (members.contains(character)) {
            members.remove(character);
            System.out.println(character.getName() + " has left the party.");
        } else {
            System.out.println(character.getName() + "is not in the party");
        }
    }

    public void calculatePower() {
        powerBalance = 0;
        for (Character member : members) {
            powerBalance += member.calculateDamage();
        }
    }

    public void calculateReputation() {
        reputation = 0;
        for (Character member : members) {
            reputation += member.getLevel();
        }
    }

    public void printPartyInfo() {
        System.out.println("Party Name: " + partyName);
        System.out.println("Members:");
        for (Character member : members) {
            member.printInfo();
        }
        System.out.println("Power Balance: " + powerBalance);
        System.out.println("Reputation: " + reputation);

    }
}
