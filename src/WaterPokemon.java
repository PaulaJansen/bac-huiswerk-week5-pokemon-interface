import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private final String type = "water";

    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");


    public WaterPokemon(String name, int level, int hp, String food, String sound){
        super(name,level, hp, food, sound);
    }

    public void surf(Pokemon name, Pokemon enemy){

        System.out.println(name + " attacks " + enemy + " with surf." );

        switch (enemy){
            case "fire" -> {
                fire = new FirePokemon(pokemon.getName(), pokemon.getLevel(), pokemon.getHp(), pokemon.getFood(), pokemon.getSound());

        }
    }
    public void hydroPump(Pokemon name, Pokemon enemy){

    }
    public void hydroCanon(Pokemon name, Pokemon enemy){

    }
    public void rainDance(Pokemon name, Pokemon enemy){

    }

//    getter
       List<String> getAttacks() {
        return attacks;
    }



}
