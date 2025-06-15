import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final String type = "fire";
    private final String enemy;

    List<String> attacks = Arrays.asList("fireLeash", "flameThrower", "pyroBall", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    public void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name + " attacks " + enemy + " with surf." );
    }

    public void flameThrower(Pokemon name, Pokemon enemy){

    }

    public void pyroBall(Pokemon name, Pokemon enemy){

    }

    public void inferno(Pokemon name, Pokemon enemy){

    }

    //    getter
    List<String> getAttacks() {
        return attacks;
    }


}
