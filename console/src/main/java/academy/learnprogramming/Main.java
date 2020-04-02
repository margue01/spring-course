package academy.learnprogramming;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Main {
    private static final String CONFIG_LOCATION = "_beans_unused_.xml";

    public static void main(String[] args) {
        log.info("Guess the number game");

        // create context with a file config
        // ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        // create context with a Java config
        // ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
        // context.close();

        SpringApplication.run(Main.class, args);
    }
}
