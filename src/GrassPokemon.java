import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final String type = "grass";
    private final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leaveBlade", "leechSeed");

    public GrassPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leafStorm." );

        switch (gymPokemon.getType()){
            case "electric":
                System.out.println(gymPokemon.getName() + " loses 45 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 45);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "fire":
                System.out.println(gymPokemon.getName() + " loses 35 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 35);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "water":
                System.out.println(gymPokemon.getName() + " loses 20 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " loses 10 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
        }
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with solarBeam." );

        switch (gymPokemon.getType()){
            case "electric":
                System.out.println(gymPokemon.getName() + " loses 60 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 60);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "fire":
                System.out.println(gymPokemon.getName() + " loses 50 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 50);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "water":
                System.out.println(gymPokemon.getName() + " loses 35 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 35);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " loses 15 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
        }
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leaveBlade." );

        switch (gymPokemon.getType()){
            case "electric":
                System.out.println(gymPokemon.getName() + " loses 30 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 30);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "fire":
                System.out.println(gymPokemon.getName() + " loses 25 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 25);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "water":
                System.out.println(gymPokemon.getName() + " loses 20 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " loses 5 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
        }
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leafStorm." );

        switch (gymPokemon.getType()){
            case "electric":
                System.out.println(gymPokemon.getName() + " loses 20 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                System.out.println(pokemon.getName() + " gaines 20 hp.");
                pokemon.setHp(pokemon.getHp() + 20);
                System.out.println(pokemon.getName() + " now has " + pokemon.getHp() + " hp.");
                break;
            case "fire":
                System.out.println(gymPokemon.getName() + " loses 15 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                System.out.println(pokemon.getName() + " gaines 15 hp.");
                pokemon.setHp(pokemon.getHp() + 15);
                System.out.println(pokemon.getName() + " now has " + pokemon.getHp() + " hp.");
                break;
            case "water":
                System.out.println(gymPokemon.getName() + " loses 10 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                System.out.println(pokemon.getName() + " gaines 10 hp.");
                pokemon.setHp(pokemon.getHp() + 10);
                System.out.println(pokemon.getName() + " now has " + pokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " loses 5 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                System.out.println(pokemon.getName() + " gaines 5 hp.");
                pokemon.setHp(pokemon.getHp() + 5);
                System.out.println(pokemon.getName() + " now has " + pokemon.getHp() + " hp.");
        }
    }

    //    getter
    List<String> getAttacks() {
        return attacks;
    }

    @Override
    public String getType() {
        return type;
    }
}
