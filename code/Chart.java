package code;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Chart extends JFrame {
	private static DefaultCategoryDataset dataSet;

	public Chart(String frameTitle, String chartTitle, Vector<Integer> vector) {
		super(frameTitle);

		dataSet = new DefaultCategoryDataset();
		populateDataSet(vector);

		JFreeChart chart = ChartFactory.createBarChart(chartTitle, "x", "y",
				dataSet, PlotOrientation.VERTICAL, true, true, false);

		ChartPanel cp = new ChartPanel(chart);
		cp.setPreferredSize(new Dimension(500, 270));

		setContentPane(cp);

		setSize(new Dimension(600, 300));
		setVisible(true);
	}

	private static void populateDataSet(Vector<Integer> vector) {
		dataSet.setValue(vector.get(1), "IO", "XYZ");
		dataSet.setValue(vector.get(2), "BIO", "XYZD");
		dataSet.setValue(vector.get(3), "BIO", "XYZ");

	}

}
