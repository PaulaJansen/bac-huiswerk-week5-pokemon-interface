import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    private String town;

    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons){
        super(name, pokemons);
        this.town = town;
    }

//    getter
      public String getTown(){
        return town;
    }

//    setter
       public void setTown(String town){
        this.town = town;
    }


}
