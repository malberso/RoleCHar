package RoleCharacter.Race;

import RoleCharacter.Stat.*;
import RoleCharacter.Stats;

public class Elf extends Race{
    private static final int STRENGTH = 0;
    private static final int CONSTITUTION = -1;
    private static final int INTELLIGENCE = 3;
    private static final int DEXTERITY = 3;
    private static Stats stats = new Stats(STRENGTH,CONSTITUTION,INTELLIGENCE,DEXTERITY);
    public int modifier(Stat stat) {
        return stats.modifier(stat);
    }
}
