package hw.springhw2;

import hw.springhw2.conf.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SwaggerConfig.class})
public class SpringHw2Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringHw2Application.class, args);
    }

}
// localhost:8081/swagger-ui/index_html#/