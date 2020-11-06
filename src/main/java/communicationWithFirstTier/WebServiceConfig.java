package communicationWithFirstTier;

import logic.users.UsersLogic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "communicationWithFirstTier")
public class WebServiceConfig
{
  @Bean
  public UsersLogic UsersLogic()
  {
    return new UsersLogic();
  }
}
