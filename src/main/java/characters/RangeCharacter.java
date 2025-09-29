package characters;
import java.util.Random;

import kickstrategy.KickStrategy;
public class RangeCharacter extends Character{
    public RangeCharacter(String name, int power_min, int power_max, int hp_min, int hp_max, KickStrategy strategy){
        super(name, new Random().nextInt(power_min, power_max+1), new Random().nextInt(hp_min, hp_max+1), strategy);
    }
}