package com.iteso.nintendo.power.impl;

import com.iteso.nintendo.power.iPower;
import com.iteso.nintendo.power.iSlideSpecialPower;

public class AttackPower implements iPower, iSlideSpecialPower {

	public String getAction() {
		return "slice";
	}

	public String getSpeed() {
		return "fast";
	}

	public String getPowerName() {
		return "attack";
	}

	public String getSpecialAction() {
		return "kill";
	}

}
