package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/26/19.
 */
@Service("i18nService")
public interface GreetingService {

    String sayGreeting();
}
