package hoofstuk02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class AssignmentsChapter2 {
    private static final Logger log = LoggerFactory.getLogger(AssignmentsChapter2.class);


    public String printHelloWorld(String message) {

        log.info(message);

        return message;
    }

    /**
     * Returns Hello <name> with params, Hello world without params
     * @param name
     * @return String
     */
    public String printHelloWithParams(String name) {

        Optional<String> nameOptional = Optional.ofNullable(name);

        String input = nameOptional.isPresent() ? nameOptional.get() : "world";


        return String.format("Hello %s", input);
    }
}
