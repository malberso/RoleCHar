import RoleCharacter.Job.Assassin;
import RoleCharacter.Job.Job;
import RoleCharacter.Race.Goblin;
import RoleCharacter.Race.Race;
import RoleCharacter.RoleCharacter;

public class Main00 {
    public static void main(String[] args) {
        Race race = new Goblin();
        Job job = new Assassin();
        RoleCharacter myChar = new RoleCharacter("Zen Utter", race , job);
        System.out.println(myChar.toString());
    }
}
