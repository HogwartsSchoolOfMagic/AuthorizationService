package io.github.hogwartsschoolofmagic.authorization;

import static java.lang.System.nanoTime;
import static org.springframework.boot.SpringApplication.run;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A class to run the entire spring application. To run, just use the command -
 * {@code mvn spring-boot:run}.
 *
 * @author Vladislav [SmithyVL] Kuznetsov.
 * @since 0.0.1.
 */
@Slf4j
@SpringBootApplication
public class AuthorizationApp {
  /**
   * The Main method that launches the Spring context of the application - and outputs the duration
   * of the launch to the log.
   *
   * @param args launch arguments.
   */
  public static void main(String[] args) {
    var startTime = nanoTime();
    run(AuthorizationApp.class, args);
    log.info("AuthorizationApplication started for {} ms!", nanoTime() - startTime);
  }
}