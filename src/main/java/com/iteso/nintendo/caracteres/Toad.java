package com.iteso.nintendo.caracteres;


import com.iteso.nintendo.powers.impl.NormalPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Toad extends NintendoCharacter {

    public static void main (String[] args){
        NintendoCharacter peach = new Toad();
        System.out.println(peach.getCurrentPower());
    }

    public Toad(){
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
        return this.getAAction();
    }

    @Override
    public String performBButtonAction() {
        return this.getBAction();
    }
}