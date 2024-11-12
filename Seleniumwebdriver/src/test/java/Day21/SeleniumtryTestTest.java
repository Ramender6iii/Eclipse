package Day21;

import org.testng.annotations.Test;

public class SeleniumtryTestTest {

	@Test
	void Seleniumtry() {
	    // Your existing login code
	}

	@Test(dependsOnMethods = {"Seleniumtry"})
	public void Seleniumtr3() {
	    // Your existing code for entering new test details
	}
}