import characters.Character;

public class GameManager{

    public void fight(Character first, Character second){
        System.out.println(first.getName() + "vs" + second.getName());
        while(first.isAlive() && second.isAlive()){
            first.kick(second);
            int first_health_before = first.getHp();
            int second_health_before = second.getHp();
            System.out.println(first.getName() + "kicked" + second.getName() + "and dealed" + (second_health_before-second.getHp()) + "point of damage");
            System.out.println(second.getName() + "has" + second.getHp() + "hp left");
            if(!second.isAlive()){
                break;
            }
            second.kick(first);
            System.out.println(second.getName() + "kicked" + first.getName() + "and dealed" + (first_health_before-first.getHp()) + "point of damage");
            System.out.println(first.getName() + "has" + first.getHp() + "hp left");
        }
        System.out.println("Winner: " + (first.isAlive() ? first.getName() : second.getName()));
    }

}