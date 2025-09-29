package characters;
import kickstrategy.RangeKickStrategy;


public class Knight extends RangeCharacter{

    public Knight(){
        super("Knight", 2, 12, 2, 12, new RangeKickStrategy());
    }
}