package com.iteso.nintendo.caracteres;
import com.iteso.nintendo.powers.impl.NormalPower;



/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter {

    public static void main (String[] args){
        NintendoCharacter mario = new Mario();
        System.out.println(mario.getCurrentPower());
    }

    public Mario(){
        this.setPower(new NormalPower());
    }

    @Override
    public String performXButtonAction() {
        return null;
    }

    @Override
    public String performYButtonAction() {
        return null;
    }

    @Override
    public String performAButtonAction() {
        return "jump";
    }

    @Override
    public String performBButtonAction() {
        return this.getAction();
    }
}