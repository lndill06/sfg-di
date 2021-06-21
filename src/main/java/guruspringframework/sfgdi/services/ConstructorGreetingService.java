package guruspringframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Example service that determines which greeting will be shown.
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
