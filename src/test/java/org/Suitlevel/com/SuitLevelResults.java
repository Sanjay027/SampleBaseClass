package org.Suitlevel.com;

import java.util.List;

import org.adatin.pojo.Asss1;
import org.junit.com.Jsamplep;
import org.junit.com.Junitprogram;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SuitLevelResults  {
	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(Asss1.class,Junitprogram.class,Jsamplep.class,Junitprogram.class);
		
		int failureCount = runClasses.getFailureCount();
		System.out.println(failureCount);

		int ignoreCount = runClasses.getIgnoreCount();System.out.println(ignoreCount);
		
		long runTime = runClasses.getRunTime();System.out.println(runTime);
		
		int runCount = runClasses.getRunCount();System.out.println(runCount);
		
		List<Failure> failures = runClasses.getFailures();
		for (Failure failure : failures) {
			
			System.out.println(failure.toString());
			
			
		}  
		
		
		
	}

}
