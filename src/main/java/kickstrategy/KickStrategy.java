package kickstrategy;
import characters.Character;

public interface KickStrategy{
    void kick(Character attacker, Character other);
}