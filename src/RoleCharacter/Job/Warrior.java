package RoleCharacter.Job;

import RoleCharacter.Stat.Stat;
import RoleCharacter.Stats;

public class Warrior extends Job{
    private static final int STRENGTH = 3;
    private static final int CONSTITUTION = 2;
    private static final int INTELLIGENCE = 0;
    private static final int DEXTERITY = 0;
    private static Stats stats = new Stats(STRENGTH,CONSTITUTION,INTELLIGENCE,DEXTERITY);
    public int modifier(Stat stat) {
        return stats.modifier(stat);
    }
}
