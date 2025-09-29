package characters;
import kickstrategy.HobbitKickStrategy;

public class Hobbit extends Character{

    public Hobbit(){
        super("Hobbit", 0, 3, new HobbitKickStrategy());
    }

}