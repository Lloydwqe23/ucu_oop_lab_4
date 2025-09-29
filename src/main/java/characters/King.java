package characters;
import kickstrategy.RangeKickStrategy;

public class King extends RangeCharacter{

    public King(){
        super("King", 5, 15, 5, 15, new RangeKickStrategy());
    }
}