package example3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Component3 {
	
	@Value("${message3}")
	private String message;
	
	public String getMessage(){
		return this.message;
	}
}
