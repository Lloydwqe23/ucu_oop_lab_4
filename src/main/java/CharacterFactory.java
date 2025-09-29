import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

import characters.Character;
public class CharacterFactory{
    Random character_randomizer = new Random();

    Character createCharacter() throws Exception{
        Reflections reflections = new Reflections("characters");
        Set<Class<? extends Character>> setOfTypes = reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> subTypes = new ArrayList<>();
        subTypes.addAll(setOfTypes);
        return subTypes.get(new Random().nextInt(subTypes.size())).getDeclaredConstructor().newInstance();

    }
}