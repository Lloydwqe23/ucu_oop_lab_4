package kickstrategy;
import characters.Character;

public class ElfKickStrategy implements KickStrategy{
    @Override
    public void kick(Character attacker, Character other){
        if(other.getPower() < attacker.getPower()){
            other.setHp(0);
        }
        else{
            other.setPower(other.getPower()-1);
        }
    }
}