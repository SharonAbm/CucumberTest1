package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src\\test\\resources\\taggedFeature\\",
		glue = {"stepDefs"},
		monochrome=true,
		tags="@SmokeTest"
		//tags="@RegressionTest"
		//tags="@SmokeTest and @RegressionTest"
		//tags="@SmokeTest or @RegressionTest"
		//tags="@RegressionTest and not @SmokeTest"
		//tags="@SmokeTest and @PhaseTwo"
		//tags="@SmokeTest or @PhaseTwo"
		//tags="@PhaseThree"
		)

public class TaggedRunner extends AbstractTestNGCucumberTests{

}
