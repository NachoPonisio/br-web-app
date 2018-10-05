package ar.com.bateriasroca.brspringwebapp.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
public class ApplicationConfig {
//
//    @Profile({"heroku", "docker"})
//    @Bean
//    public DataSource dataSource(){
//        return DataSourceBuilder.create().build();
//    }

}
