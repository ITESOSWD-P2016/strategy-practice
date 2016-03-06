package com.iteso.nintendo.power.impl;

import com.iteso.nintendo.power.iPower;

public class FlowerPower implements iPower {

	public String getAction() {
		return "fireball";
	}

	public String getSpeed() {
		return "normal";
	}

	public String getPowerName() {
		return "fire";
	}

	public String getSpecialAction() {
		return "throw fireballs";
	}

}
