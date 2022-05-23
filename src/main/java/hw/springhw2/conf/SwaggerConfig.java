package hw.springhw2.conf;/*
  @author   User
  @project   spring-hw2
  @class  SwaggerConfig
  @version  1.0.0 
  @since 25.03.2022 - 20.47
*/

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2

public class SwaggerConfig {


    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfo("API for Hotel",
                                    "My Term Paper",
                                    "1.0.0",
                                    null,
                        new Contact("Ivanova Iryna",
                                    "https://t.me/cut3_iro4ka",
                                    "ivanova.iryna@chnu.edu.ua"),
                                    "","",
                        new ArrayList()))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

    }
}




