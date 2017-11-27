package me.grp24;

import me.grp24.BLL.ACQ.GUI;
import me.grp24.BLL.ACQ.Business;
import me.grp24.BLL.BusinessFacade;
import me.grp24.UI.ConsoleView;
import me.grp24.UI.JavaFX;

public class Main {

    public static void main(String[] args) {
        Business business = new BusinessFacade();
        GUI gui = new JavaFX();
	    gui.injectBusiness(business);
	    gui.startApplication();
    }
}
