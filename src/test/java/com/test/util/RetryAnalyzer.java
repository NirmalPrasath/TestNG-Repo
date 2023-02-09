package com.test.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int retryCount=0;
	int maxRetryCount=1;
	public boolean retry(ITestResult result)
	{
		if(retryCount<maxRetryCount)
		{
			retryCount++;
			return true;
		}
		return false;
	}
	
	

}
