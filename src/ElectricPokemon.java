import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final String type = "electric";
    private final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "voltTackle", "thunder");

    public ElectricPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    void thunderPunch(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunderPunch." );

        switch (gymPokemon.getType()){
            case "water":
                System.out.println(gymPokemon.getName() + " loses 50 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 50);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "grass":
                System.out.println(gymPokemon.getName() + " loses 35 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 35);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "fire":
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

    void electroBall(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunderPunch." );

        switch (gymPokemon.getType()){
            case "water":
                System.out.println(gymPokemon.getName() + " loses 55 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 55);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "grass":
                System.out.println(gymPokemon.getName() + " loses 50 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 50);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "fire":
                System.out.println(gymPokemon.getName() + " loses 45 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 45);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " loses 17 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 17);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
        }
    }

    void voltTackle(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunderPunch." );

        switch (gymPokemon.getType()){
            case "water":
                System.out.println(gymPokemon.getName() + " loses 30 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 30);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "grass":
                System.out.println(gymPokemon.getName() + " loses 20 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "fire":
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

    void thunder(Pokemon pokemon, Pokemon gymPokemon){
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunderPunch." );

        switch (gymPokemon.getType()){
            case "water":
                System.out.println(gymPokemon.getName() + " loses 40 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 40);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "grass":
                System.out.println(gymPokemon.getName() + " loses 35 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 35);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            case "fire":
                System.out.println(gymPokemon.getName() + " loses 20 hp.");
                gymPokemon.setHp(gymPokemon.getHp() - 20);
                System.out.println(gymPokemon.getName() + " now has " + gymPokemon.getHp() + " hp.");
                break;
            default:
                System.out.println(gymPokemon.getName() + " gaines 25 hp.");
                gymPokemon.setHp(gymPokemon.getHp() + 25);
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
