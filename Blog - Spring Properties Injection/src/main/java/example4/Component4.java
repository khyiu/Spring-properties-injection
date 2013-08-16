package example4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Component4 {
	
	@Value("${message1}")
	private String messageFromProp1;
	
	@Value("${message2}")
	private String messageFromProp2;
	
	@Value("${message3}")
	private String messageFromProp3;
	
	public String getMessage(){
		return this.messageFromProp1 + "\n"
				+ this.messageFromProp2 + "\n" + 
					this.messageFromProp3;
	}
}
