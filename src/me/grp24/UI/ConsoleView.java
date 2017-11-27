package me.grp24.UI;

import me.grp24.BLL.ACQ.*;
import me.grp24.BLL.Building;
import me.grp24.BLL.Location;
import me.grp24.BLL.sensor.SelectedSensor;

public class ConsoleView implements GUI {
	private Business business;

	@Override
	public void injectBusiness(Business business) {
		this.business = business;
	}

	@Override
	public void startApplication() {

	}
}
