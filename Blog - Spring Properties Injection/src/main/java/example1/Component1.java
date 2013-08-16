package example1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Component1 {
	@Value("#{propSource[message1]}")
	private String message;
	
	public String getMessage(){
		return message;
	}
}
