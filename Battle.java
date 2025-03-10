import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Battle {
    private Party party1;
    private Party party2;

    public Battle(Party party1, Party party2) {
        this.party1 = party1;
        this.party2 = party2;
    }
    public void formTeams(){
        Collections.shuffle(party1.getMembers());
        Collections.shuffle(party2.getMembers());

    }
    public void startBattle() {
        ArrayList<Character> team1 = new ArrayList<>(party1.getMembers().subList(0, 3));
        ArrayList<Character> team2 = new ArrayList<>(party2.getMembers().subList(0, 3));

        Random random = new Random();

        while (!team1.isEmpty() && !team2.isEmpty()) {

            boolean attackingTeamIsParty1 = random.nextBoolean();

            if (attackingTeamIsParty1) {
                Character attacker = team1.get(random.nextInt(team1.size()));
                Character defender= team2.get(random.nextInt(team2.size()));
                attack(attacker, defender);

            }else{
                Character attacker = team2.get(random.nextInt(team2.size()));
                Character defender = team1.get(random.nextInt(team1.size()));
                attack(attacker, defender);

            }

            for(int i=0;i<team1.size();i++){
                Character character = team1.get(i);
                if(character.getHitPoint()<=0){
                    team1.remove(i);
                    i--;
                }
            }
            for(int i=0;i<team2.size();i++){
                Character character = team2.get(i);
                if(character.getHitPoint()<=0){
                    team2.remove(i);
                    i--;
                }
            }

        }
        declareWinner(team1,team2);
    }
        private void attack(Character attacker, Character defender) {
            double damage = attacker.calculateDamage();
            defender.setHitPoint(defender.getHitPoint()-damage);
            System.out.println(attacker.getName() +"attacks"+defender.getName() +" for " + damage + " damage!");
            if (defender.getHitPoint() <= 0) {
                System.out.println(defender.getName() + " has fallen!");
            }


        }
        private void declareWinner(ArrayList<Character> team1, ArrayList<Character> team2) {
            if (team1.isEmpty()) {
                System.out.println("Party 2 wins!");
            } else {
                System.out.println("Party 1 wins!");
            }
        }

}
