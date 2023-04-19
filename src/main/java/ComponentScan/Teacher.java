package ComponentScan;

import org.springframework.stereotype.Component;

@Component
// It is alternative of configuration and bean nothing else.

public class Teacher {
    public String teach(){
        return "She is teaching spring boot";
    }
}
