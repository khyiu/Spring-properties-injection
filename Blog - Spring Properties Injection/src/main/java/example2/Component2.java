package example2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Component2 {
	@Value("${message2}")
	private String message;
	
	public String getMessage(){
		return this.message;
	}
}
