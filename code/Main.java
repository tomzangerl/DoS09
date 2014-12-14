package code;
import java.util.Vector;

public class Main {

	private static Vector<Integer> data = new Vector<Integer>();

	public Vector<Integer> getVector() {
		return data;
	}

	public static void populateVector() {
		for (int i = 0; i < 5; i++) {
			data.addElement(i);
		}
	}

	private static void showGraph() {
		new Chart("ChartFrame", "Demo chart DoS 9", data);

	}

	public static void main(String[] args) {
		populateVector();
		showGraph();
	}

}
