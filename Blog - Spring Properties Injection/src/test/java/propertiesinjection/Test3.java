package propertiesinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import example3.Component3;

@Test
@ContextConfiguration(locations={"classpath:/config/config3.xml"})
public class Test3 extends AbstractTestNGSpringContextTests{

	@Autowired
	private Component3 component;
	
	public void testReadProperty(){
		Assert.assertEquals(component.getMessage(), "Message from prop3.properties");
	}
}
