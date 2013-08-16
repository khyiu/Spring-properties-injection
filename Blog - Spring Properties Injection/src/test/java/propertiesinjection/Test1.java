package propertiesinjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import example1.Component1;

@Test
@ContextConfiguration(locations={"classpath:/config/config1.xml"})
public class Test1 extends AbstractTestNGSpringContextTests {
	@Autowired
	private Component1 component;
	
	
	public void testReadProperty(){
		Assert.assertEquals(component.getMessage(), "Message from prop1.properties");
	}
}
