package Pokemon;

//FILE::Pokemon.PokemonFactory.java
//AUTHOR::Kevin.P.Barnett, and Dylan.J.Hartfield
//DATE::May.23.2017

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class PokemonFactory {

    HashMap<String,String> pokemonBaseStats;

    public PokemonFactory(){
        this.pullBaseStats();
    }

    private void pullBaseStats(){
        this.pokemonBaseStats = new HashMap<>();
        Scanner file = null;
        try{file = new Scanner(new FileInputStream("src/pokemon/baseStats.csv"));}
        catch(Exception e){
            System.out.println("Error: baseStats.csv not found");
        }
        while(file.hasNext()){
            String t = file.nextLine();
            this.pokemonBaseStats.put(t.split(",")[0],t.substring(t.indexOf(",")+1));
        }
    }

    /**
     * Generate PokeStats object for base stats of given pokemon name
     * @param pokemon name of pokemon you want base stats for
     * @return PokeStats object containing the base stats for pokemon user needs
     */
    public PokeStats getBaseStats(String pokemon){
        String stats = pokemonBaseStats.get(pokemon);
        int hp = Integer.parseInt(stats.split(",")[0]);
        int att = Integer.parseInt(stats.split(",")[0]);
        int def = Integer.parseInt(stats.split(",")[0]);
        int spAtt = Integer.parseInt(stats.split(",")[0]);
        int spDef = Integer.parseInt(stats.split(",")[0]);
        int speed = Integer.parseInt(stats.split(",")[0]);
        return new PokeStats(hp,att,def,spAtt,spDef,speed,1000);
    }
}