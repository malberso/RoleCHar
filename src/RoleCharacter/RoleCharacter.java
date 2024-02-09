package RoleCharacter;

import RoleCharacter.Job.Job;
import RoleCharacter.Race.Race;
import RoleCharacter.Stat.*;



public class RoleCharacter implements IDamageable{
    private String name;
    private Race race;
    private Job job;
    private Stats baseStats;
    private double health;
    public RoleCharacter(String name, Race race, Job job, Stats stats){
        this.name = new String(name);
        this.race = race; //TODO revisar riesgo de colision
        this.job = job; //TODO revisar riesgo de colision
        this.baseStats = new Stats(stats);
        this.health = maxHealth();

    }
    public RoleCharacter(String name, Race race, Job job){
        this(name, race, job, new Stats(5,5,5,5));
    }
    public String getName(){
        return name;
    }
    public Race getRace(){
        return race;
    }
    public Job getJob(){
        return job;
    }
    //(Valor base Dexterity + bonif. raza + bonif.profesion)*2
    public double velocity(){
        Stat dexterity = new Dexterity();
        return (baseStats.getDexterity() + race.modifier(dexterity) + job.modifier(dexterity) )*2;
    }
    //(Valor base Strength + bonif. raza + bonif.profesion)*2
    public double power(){
        Stat strength = new Strength();
        return (baseStats.getStrength() + race.modifier(strength) + job.modifier(strength) )*2;
    }
    //(Valor base Intelligence + bonif. raza + bonif.profesion)*2
    public double magic(){
        Stat intelligence = new Intelligence();
        return (baseStats.getIntelligence() + race.modifier(intelligence) + job.modifier(intelligence));
    }
    //(Valor base Constitution + bonif. raza + bonif.profesion)*25
    public double maxHealth(){
        Stat constitution = new Constitution();
        return (baseStats.getConstitution() + race.modifier(constitution) + job.modifier(constitution))*25;
    }
    //Muestra toda la información de un personaje
    public String toString(){
        String strOut = "My name is " + name + ". I'm a " + race.toString().toLowerCase() + " " +
                job.toString().toLowerCase() + ". My stats are: Strength: " +
                baseStats.getStrength() + " Constitution: " + baseStats.getConstitution() + " Dexterity: " +
                baseStats.getIntelligence() + " Intelligence: " + baseStats.getIntelligence() + " Velocity: " +
                velocity() + " Power: " + power() + " Magic: " + magic() + " Health: " + health + " MaxHealth: "
                + maxHealth();
        return strOut;
    }

    @Override
    public double health() {
        return health;
    }

    @Override
    public boolean isDead() {
        return health<=0;
    }

    @Override
    public void receivesDamage(double amount) {
        if (amount>0) {
            double value = health - amount;
            if (value > 0) {
                health = value;
            } else {
                health = 0;
            }
            System.out.println(name + " received " + amount + " damage. Health: " + health + "/" + maxHealth());//TODO traza de seguimiento
        }
    }

    @Override
    public void heals(double amount) {
        if (amount>0) {
            double value = health + amount;
            if (value < maxHealth()) {
                health = value;
            } else {
                health = maxHealth();
            }
            System.out.println(name + " healed " + amount + " life. Health: " + health + "/" + maxHealth());//TODO traza de seguimiento
        }
    }

}
