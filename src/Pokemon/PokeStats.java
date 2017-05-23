package Pokemon;
//FILE::PokeStats.java
//AUTHOR::Kevin.P.Barnett
//DATE::May.23.2017

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PokeStats
{
    private int hp;
    private int attack;
    private int defence;
    private int spAttack;
    private int spDefence;
    private int speed;
    private int MAX;


    public PokeStats(int hp, int attack, int defence, int spAttack, int spDefence, int speed, int MAX)
    {
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.spAttack = spAttack;
        this.spDefence = spDefence;
        this.speed = speed;
        this.MAX = MAX;
    }

    public void setHp(int hp)
    {
        if(hp >= this.MAX)
            this.hp = this.MAX;
        else if(hp < 0)
            this.hp = 0;
        else
            this.hp = hp;
    }

    public void setAttack(int attack)
    {
        if(attack >= this.MAX)
            this.attack = this.MAX;
        else if(attack < 0)
            this.attack = 0;
        else
            this.attack = attack;
    }

    public void setDefence(int defence)
    {
        if(defence >= this.MAX)
            this.defence = this.MAX;
        else if(defence < 0)
            this.defence = 0;
        else
            this.defence = defence;
    }

    public void setSpAttack(int spAttack)
    {
        if(spAttack >= this.MAX)
            this.spAttack = this.MAX;
        else if(spAttack < 0)
            this.spAttack = 0;
        else
            this.spAttack = spAttack;
    }

    public void setSpDefence(int spDefence)
    {
        if(spDefence >= this.MAX)
            this.spDefence = this.MAX;
        else if(spDefence < 0)
            this.spDefence = 0;
        else
            this.spDefence = spDefence;
    }

    public void setSpeed(int speed)
    {
        if(speed >= this.MAX)
            this.speed = this.MAX;
        else if(speed < 0)
            this.speed = 0;
        else
            this.speed = speed;
    }

    public final int getHp()
    {
        return hp;
    }

    public final int getAttack()
    {
        return attack;
    }

    public final int getDefence()
    {
        return defence;
    }

    public final int getSpAttack()
    {
        return spAttack;
    }

    public final int getSpDefence()
    {
        return spDefence;
    }

    public final int getSpeed()
    {
        return speed;
    }
}