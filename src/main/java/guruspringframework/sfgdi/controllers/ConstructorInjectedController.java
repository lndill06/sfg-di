package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Example controller that uses constructor dependency injection.
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    /* @Autowired is not required on constructors, Spring will automatically
       inject an instance of GreetingService into our constructor */
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
