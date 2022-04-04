package hoofstuk02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssignmentsChapter2 {
    private static final Logger log = LoggerFactory.getLogger(AssignmentsChapter2.class);


    public String printHelloWorld(String message) {
        log.info(message);
        return message;
    }
}
