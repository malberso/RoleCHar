package RoleCharacter.Race;

import RoleCharacter.Stat.*;
import RoleCharacter.Stats;

public class Orc extends Race{
    private static final int STRENGTH = 5;
    private static final int CONSTITUTION = 3;
    private static final int INTELLIGENCE = -3;
    private static final int DEXTERITY = 0;
    private static Stats stats = new Stats(STRENGTH,CONSTITUTION,INTELLIGENCE,DEXTERITY);
    public int modifier(Stat stat) {
        return stats.modifier(stat);
    }
}
