package org.test.springTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.test.springTest")
public class AppConfig {

@Bean
  public Auto auto()
  {
      Auto auto = new Auto();
      auto.setMark("BMW");
      auto.setNumOfWheels(4);
      auto.setMilage(100000);
      auto.setMaxSpeed(250);
      auto.setEngine(engine());
      return auto;

  }

@Bean

  public Engine engine()
  {
      Engine engine = new Engine();
      engine.setHoursePower(240);
      engine.setType_of_fuel("Gasoline");
      return engine;
  }



}
