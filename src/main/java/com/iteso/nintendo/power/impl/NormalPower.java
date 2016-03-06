package com.iteso.nintendo.power.impl;

import com.iteso.nintendo.power.iPower;

public class NormalPower implements iPower {

	public String getAction() {
		return "nothing";
	}

	public String getSpeed() {
		return "normal";
	}

	public String getPowerName() {
		return "normal";
	}

	public String getSpecialAction() {
		return "nothing";
	}

}
