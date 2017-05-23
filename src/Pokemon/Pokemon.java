package Pokemon;

//FILE::Pokemon.Pokemon.java
//AUTHOR::Kevin.P.Barnett
//DATE::May.23.2017

import Item.Item;

public class Pokemon
{
    private PokeStats baseStats;
    private PokeStats baseIVs;
    private PokeStats currnentEVs;
    private PokeStats rewardEVs;

    private String speciesName;
    private String nickName;
    private String nature;

    private int happiness;
    private int level;
    private int experience;
    private int health;


    private int MAX_HEALTH;

    private boolean shiny;
    private boolean gender;

    private String heldItem;

    private String[] moveSet;
}