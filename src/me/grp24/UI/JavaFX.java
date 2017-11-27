package me.grp24.UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import me.grp24.BLL.ACQ.Business;
import me.grp24.BLL.ACQ.GUI;
import me.grp24.BLL.ACQ.ISensor;
import me.grp24.BLL.ACQ.Sensor;
import me.grp24.BLL.Building;
import me.grp24.BLL.Location;
import me.grp24.BLL.sensor.SelectedSensor;

public class JavaFX extends Application implements GUI{

    private Business business;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("./views/main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    @Override
    public void injectBusiness(Business business) { this.business = business; }

    @Override
    public void startApplication() {
        business.addBuilding("SDU", new Location("Niels Bohrs Alle", "Denmark"));
        business.addBuilding("SDU 2", new Location("Niels Bohrs Alle", "Denmark"));

        SelectedSensor selSensor = new SelectedSensor(Sensor.CO2.getId(), Sensor.CO2.getUnits()[0]);
        business.addSensor("SDU", "CO2 Sensor 1", selSensor);

        for(Building b : business.getBuildings().values()) {
            System.out.println(b.getName());

            for(ISensor sensor : b.getSensors().values()) {
                System.out.println(sensor.getName());
            }
        }

        launch();
    }
}
