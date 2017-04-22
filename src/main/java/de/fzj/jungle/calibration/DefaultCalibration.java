package de.fzj.jungle.calibration;

public class DefaultCalibration implements Calibration<Double> {

	@Override
	public Double getNormalizationFactor(int[] coord) {
		return 1d;
	}

}
