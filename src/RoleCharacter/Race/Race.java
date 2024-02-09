package RoleCharacter.Race;

import RoleCharacter.Stat.*;

public abstract class Race {
    public  abstract  int modifier(Stat stat);
    public boolean equals(Object obj){
        //return this.toString().equals(obj.getClass().getSimpleName().toString());
        //return this.getClass().isInstance(obj);
        return this.getClass() == obj.getClass();
    }
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
