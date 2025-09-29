package characters;
import kickstrategy.ElfKickStrategy;

public class Elf extends Character{

    public Elf(){
        super("Elf", 10, 10, new ElfKickStrategy());
    }
}