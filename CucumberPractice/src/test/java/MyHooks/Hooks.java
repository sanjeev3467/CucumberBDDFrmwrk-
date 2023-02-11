package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {

	
	@Before("@Smoke")
	public void Setup(Scenario sc) {
		
		System.out.println("Lanuching1"+sc.getName());
		
	}
	
	//@Before(order=2)
	//public void Setup2() {
		
	//	System.out.println("Lanuching2");
		
//	}
	
//	@After(order=1)
//	public void Teardown1() {
	
	//	System.out.println("Close Browser1");
		
//	}
	
	@After("@Sanity")
	public void Teardown2(Scenario sc) {
	
		System.out.println("Close Browser2"+sc.getName());
		
	}
	
	@BeforeStep
	public void takescreenshot() {
		
		System.out.println("Take screen shot");
	}
	
	@AfterStep
	public void refreshing() {
		System.out.println("Refresh pager");
	}
	
	
}
