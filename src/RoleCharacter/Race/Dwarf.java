package RoleCharacter.Race;

import RoleCharacter.Stat.*;
import RoleCharacter.Stats;

public class Dwarf extends Race{
    private static final int STRENGTH = 1;
    private static final int CONSTITUTION = 2;
    private static final int INTELLIGENCE = 0;
    private static final int DEXTERITY = 2;
    private static Stats stats = new Stats(STRENGTH,CONSTITUTION,INTELLIGENCE,DEXTERITY);
    public int modifier(Stat stat) {
        return stats.modifier(stat);
    }
}
