import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private final String type = "water";
    private final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound){
        super(name,level, hp, food, sound);
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with surf." );

        switch (gymPokemon.getType()){
            case "fire":
                System.out.println(gymPokemon.getName() + " loses 40 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 40);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "electric":
                System.out.println(gymPokemon.getName() + " loses 30 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 30);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "grass":
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
    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroPump." );

        switch (gymPokemon.getType()){
            case "fire":
                System.out.println(gymPokemon.getName() + " loses 50 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 50);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "electric":
                System.out.println(gymPokemon.getName() + " loses 40 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 40);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "grass":
                System.out.println(gymPokemon.getName() + " loses 30 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 30);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " loses 15 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
        }

    }
    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroCanon." );

        switch (gymPokemon.getType()){
            case "fire":
                System.out.println(gymPokemon.getName() + " loses 65 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 65);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "electric":
                System.out.println(gymPokemon.getName() + " loses 55 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 55);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "grass":
                System.out.println(gymPokemon.getName() + " loses 40 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 40);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " loses 15 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
        }

    }
    public void rainDance(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with rainDance." );

        switch (gymPokemon.getType()){
            case "fire":
                System.out.println(gymPokemon.getName() + " loses 20 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "electric":
                System.out.println("rainDance has no effect on " + gymPokemon.getName() + ".");
                System.out.println(gymPokemon.getName() + " still has " + gymPokemon.getHp() + " hp.");
                break;
            case "grass":
                System.out.println(gymPokemon.getName() + " gains 5 hp.");
                gymPokemon.setHp(gymPokemon.getHp() + 5);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " loses 2 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 2);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
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
