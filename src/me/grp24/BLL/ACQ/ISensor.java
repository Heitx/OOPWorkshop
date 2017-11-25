package me.grp24.BLL.ACQ;

import me.grp24.BLL.Measurement;

import java.util.List;

public interface ISensor {
	String getName();
	List<Measurement> getMeasurements();
	Measurement getMeasure(double value);
	String getUnit();
}
