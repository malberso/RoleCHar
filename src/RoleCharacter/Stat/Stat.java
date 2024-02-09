package RoleCharacter.Stat;

public abstract class Stat {
    private int value;
    public Stat(int value){
        this.value = value;
    }
    public Stat(){
        this(0);
    }
    public int getValue(){return  value;}
    public void setValue(int value) {
        this.value = value;
    }
    public void increase(){value++;}
    public void decrease(){value--;}
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
