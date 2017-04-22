package de.fzj.jungle.calibration;

import java.util.List;

import net.imagej.Dataset;
import net.imagej.legacy.LegacyService;
import net.imagej.overlay.CompositeOverlay;
import net.imagej.overlay.Overlay;

import org.scijava.ItemIO;
import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

@Plugin(type = Command.class, headless = true, menuPath = "Plugins>JuNGLE>Calibrate")
public class CalibrationPlugin implements Command {
	
	@Parameter
	private LegacyService legacyService;
	
	@Parameter
	private Dataset dataset;
	
	@Parameter(type = ItemIO.OUTPUT)
	private List<Overlay> overlayList;
	
	@Parameter(type = ItemIO.OUTPUT)
	private CompositeOverlay compositeOverlay;

	@Override
	public void run() {		
//		// execute asynchronously using the command service
//		final Future<Module> future = ij.command().run(
//				"imagej.core.commands.io.OpenFile", "inputFile",
//				new File("sample-image.fake"));
//		// wait for the execution thread to complete
//		final Module module = ij.module().waitFor(future);
//		// return the desired output parameter value
//		return (Dataset) module.getOutput("data");
		
		// Threshold?
		legacyService.runLegacyCommand("Analyze Particles...", null);
		
		// AnalyzeParticles?
		legacyService.runLegacyCommand("Analyze Particles...", null);
		
		// Get Distribution of Values??
		legacyService.runLegacyCommand("Analyze Particles...", null);
	}

}
