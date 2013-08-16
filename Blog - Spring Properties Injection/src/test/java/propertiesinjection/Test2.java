package propertiesinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import example2.Component2;

@Test
@ContextConfiguration(locations={"classpath:/config/config2.xml"})
public class Test2 extends AbstractTestNGSpringContextTests{
	@Autowired
	private Component2 component;
	
	public void testReadProperty(){
		Assert.assertEquals(component.getMessage(), "Message from prop2.properties");
	}
}
