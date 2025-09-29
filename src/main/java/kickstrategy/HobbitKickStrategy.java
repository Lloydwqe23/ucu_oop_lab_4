package kickstrategy;
import characters.Character;

public class HobbitKickStrategy implements KickStrategy{
    @Override
    public void kick(Character attacker, Character other){
        toCry(attacker);
    }
    public void toCry(Character cryer){
        System.out.println(cryer.getName() + " cries");
    }
}