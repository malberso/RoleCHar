package RoleCharacter.Job;

import RoleCharacter.Stat.Stat;
import RoleCharacter.Stats;

public class Paladin extends Job{
    private static final int STRENGTH = 2;
    private static final int CONSTITUTION = 0;
    private static final int INTELLIGENCE = 2;
    private static final int DEXTERITY = 1;
    private static Stats stats = new Stats(STRENGTH,CONSTITUTION,INTELLIGENCE,DEXTERITY);
    public int modifier(Stat stat) {
        return stats.modifier(stat);
    }
}
