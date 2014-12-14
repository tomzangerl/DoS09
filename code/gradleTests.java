package code;
import org.junit.Assert;
import org.junit.Test;

public class gradleTests {

	@Test
	public void gradleSampleTest() {
		Main tester = new Main();
		Main.populateVector();

		Assert.assertEquals("Size must be 5", 5, tester.getVector().size());
	}

}
