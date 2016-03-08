package com.iteso.nintendo.caracteres;


import com.iteso.nintendo.powers.impl.NormalPower;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Peach extends NintendoCharacter {

    public static void main (String[] args){
        NintendoCharacter peach = new Peach();
        System.out.println(peach.getCurrentPower());
    }

    public Peach(){
        this.setPower(new NormalPower());
        this.setName("Peach");
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