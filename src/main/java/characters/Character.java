package characters;
import java.util.Random;

import kickstrategy.KickStrategy;
public class Character{
    private String name;
    private int power;
    private int hp;
    KickStrategy kickstrategy;
    public Random randomizer = new Random();

    public Character(String name, int power, int hp, KickStrategy strategy){
        this.name = name;
        this.power = power;
        this.hp = hp;
        this.kickstrategy = strategy;
    }

    public void kick(Character other){
        kickstrategy.kick(this, other);
    }
    public boolean isAlive(){
        return (this.hp > 0);
    }

    public void setHp(int new_hp){
        if(new_hp < 0){
            this.hp = 0;
        }
        else{
            this.hp = new_hp;
        }
    }

    public int getHp() {
        return hp;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
        
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }


}