package academy.learnprogramming.console;

import academy.learnprogramming.config.GameConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private static final String CONFIG_LOCATION = "_beans_unused_.xml";

    public static void main(String[] args) {
        log.info("Guess the number game");

        // create context with a file config
        // ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        // create context with a Java config
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
//       APP STARTS WITH THE EVENT Callback

//        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);
//
//        int number = numberGenerator.next();
//
//        log.info("number = {}", number); // if debug, the string won't be concatenated
//
//        Game game = context.getBean(Game.class);
//
//        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
//        log.info("getMainMessage = {}", messageGenerator.getMainMessage());
//        log.info("getResultMessage = {}", messageGenerator.getResultMessage());
        context.close();
    }
}
