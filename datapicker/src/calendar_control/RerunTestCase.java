package calendar_control;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunTestCase implements IRetryAnalyzer {
	
	
	int mincount=0;
	int maxcount=2;
	@Override
	public boolean retry(ITestResult result) {
		
		if(mincount<=maxcount){
			
			System.out.println("following test case is failed "+result.getName());
			
			System.out.println(result.getStatus());
			
			System.out.println("retry count "+(mincount+1));
			
			mincount++;
			
			return true;
			
		}
		
		return false;
	}
	
}
	

	
	
	


