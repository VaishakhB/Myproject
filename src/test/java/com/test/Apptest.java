package com.test;

import org.testing.Assert;
import org.testing.annotations.Test;

import com.dev.App;


public class Apptest{
	
	
	public void testlogin1()
	{
		App myapp=new App();
		org.testng.Assert.assertEquals(0, myapp.userLogin("abc", "abc123"));
	}
    
     public void testlogin2()
     {
    	 App myapp=new App();
    	 org.testng.Assert.assertEquals(1, myapp.userLogin("abc", "abc@123"));
     }
}

