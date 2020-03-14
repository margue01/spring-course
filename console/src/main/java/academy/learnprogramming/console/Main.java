package academy.learnprogramming.console;

import academy.learnprogramming.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    private static final String CONFIG_LOCATION = "_beans_unused_.xml";

    public static void main(String[] args) {
        log.info("Guess the number game");

        // create context with a file config
        // ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        // create context with a Java config
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
        context.close();
    }
}
