import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final String type = "fire";
    private final List<String> attacks = Arrays.asList("fireLeash", "flameThrower", "pyroBall", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with fireLash." );

        switch (gymPokemon.getType()){
            case "grass":
                System.out.println(gymPokemon.getName() + " loses 30 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 30);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "water":
                System.out.println(gymPokemon.getName() + " loses 20 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "electric":
                System.out.println(gymPokemon.getName() + " loses 10 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 10);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " loses 5 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 5);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
        }
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with flameThrower." );

        switch (gymPokemon.getType()){
            case "grass":
                System.out.println(gymPokemon.getName() + " loses 50 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 50);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "water":
                System.out.println(gymPokemon.getName() + " loses 35 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 35);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "electric":
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

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with pyroBall." );

        switch (gymPokemon.getType()){
            case "grass":
                System.out.println(gymPokemon.getName() + " loses 55 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 55);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "water":
                System.out.println(gymPokemon.getName() + " loses 40 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 40);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "electric":
                System.out.println(gymPokemon.getName() + " loses 25 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 25);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " loses 15 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 15);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
        }
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno." );

        switch (gymPokemon.getType()){
            case "grass":
                System.out.println(gymPokemon.getName() + " loses 70 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 70);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "water":
                System.out.println(gymPokemon.getName() + " loses 50 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 50);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "electric":
                System.out.println(gymPokemon.getName() + " loses 40 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 40);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " loses 20 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
        }
    }

    //    getters
    List<String> getAttacks() {
        return attacks;
    }

    @Override
    public String getType() {
        return type;
    }
}
