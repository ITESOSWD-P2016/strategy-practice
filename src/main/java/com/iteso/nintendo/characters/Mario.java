package com.iteso.nintendo.characters;

/**
 * Created by rvillalobos on 3/3/16.
 */
public class Mario extends NintendoCharacter{

    public Mario(){
        setCurrentPower("normal");
        setName("Mario");
        setSpeed("normal");
    }

    @Override
    public String performXButtonAction() {
        return null;
    }

    @Override
    public String performYButtonAction() {
        return null;
    }

 
}