import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final String type;
    private final String enemy;

    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leaveBlade", "leechSeed");

    public GrassPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name + " attacks " + enemy + " with surf." );
    }

    public void solarBeam(Pokemon name, Pokemon enemy){

    }

    public void leaveBlade(Pokemon name, Pokemon enemy){

    }

    public void leechSeed(Pokemon name, Pokemon enemy){

    }

    //    getter
    List<String> getAttacks() {
        return attacks;
    }


}
