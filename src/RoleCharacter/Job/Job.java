package RoleCharacter.Job;

import RoleCharacter.Stat.*;

public abstract class Job {
    //Devuelve el modificador de la profesión segun el stat
    public abstract int modifier(Stat stat);
    public boolean equals(Object obj){
        return this.getClass() == obj.getClass();
    }
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
