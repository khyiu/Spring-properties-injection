package propertiesinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import example4.Component4;

@Test
@ContextConfiguration(locations={"classpath:/config/config4.xml"})
public class Test4 extends AbstractTestNGSpringContextTests{
	@Autowired
	private Component4 component;

	@Autowired
	private ApplicationContext context;
	
	public void testReadProperty(){
		String expectedValue = "Message from prop1.properties" +
				"\nMessage from prop2.properties" +
				"\nMessage from prop3.properties";
		
		Assert.assertEquals(component.getMessage(), expectedValue);
	}
}
