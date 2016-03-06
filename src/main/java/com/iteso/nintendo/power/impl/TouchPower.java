package com.iteso.nintendo.power.impl;

import com.iteso.nintendo.power.iHitSpecialPower;
import com.iteso.nintendo.power.iPower;

public class TouchPower implements iPower, iHitSpecialPower {

	public String getAction() {
		return "knock";
	}

	public String getSpeed() {
		return "normal";
	}

	public String getPowerName() {
		return "super strength";
	}

	public String getSpecialAction() {
		return "kill character";
	}

}
