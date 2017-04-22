package de.fzj.jungle.calibration;

public interface Calibration<T> {

	public T getNormalizationFactor(int[] coord);
}
