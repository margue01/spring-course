package academy.learnprogramming.config;

import academy.learnprogramming.GuessCount;
import academy.learnprogramming.MaxNumber;
import academy.learnprogramming.MinNumber;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
@ComponentScan(basePackages = "academy.learnprogramming")
public class GameConfig {

    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.minNumber:5}")
    private int minNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;

    // Method 1: Qualifier with name: require the string to be copied in several places.
    @Bean
    @Qualifier("GuessCount")
    public int guessCountMethod1() { // can be rename since we are now using Qualifiers
        return guessCount;
    }

    // Method 2: Qualifier is defined in a specific @interface file.
    @Bean
    @GuessCount
    public int guessCount() { // can be rename since we are now using Qualifiers
        return guessCount;
    }

    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }
}
