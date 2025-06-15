import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final String type = "electric";
    private final String enemy;

    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "voltTackle", "thunder");

    public ElectricPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name + " attacks " + enemy + " with surf." );
    }

    void electroBall(Pokemon name, Pokemon enemy){

    }

    void voltTackle(Pokemon name, Pokemon enemy){

    }

    void thunder(Pokemon name, Pokemon enemy){

    }

    //    getter
    List<String> getAttacks() {
        return attacks;
    }


}
