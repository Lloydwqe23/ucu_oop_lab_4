package kickstrategy;
import characters.Character;

public class RangeKickStrategy implements KickStrategy{
    @Override
    public void kick(Character attacker, Character other){
        int damage = attacker.randomizer.nextInt(attacker.getPower());
        if(other.getHp() - damage > 0){
            other.setHp(other.getHp() - damage);
        }
        else{
            other.setHp(0);
        }
    }
}