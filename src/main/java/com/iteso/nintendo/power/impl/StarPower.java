package com.iteso.nintendo.power.impl;

import com.iteso.nintendo.power.iPower;

public class StarPower implements iPower{

	public String getAction() {
		return "dash";
	}

	public String getSpeed() {
		return "fast";
	}

	public String getPowerName() {
		return "invincibility";
	}


}
