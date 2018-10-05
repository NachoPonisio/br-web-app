package ar.com.bateriasroca.brspringwebapp.config;

import ar.com.bateriasroca.brspringwebapp.repositories.OfferRepository;
import ar.com.bateriasroca.brspringwebapp.services.OfferService;
import ar.com.bateriasroca.brspringwebapp.services.OfferServiceImpl;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import javax.naming.Context;
import javax.sql.DataSource;

@Configuration
public class ApplicationConfig {

    @Bean
    @Primary
    public OfferService getOfferService(OfferRepository repository){
        return new OfferServiceImpl(repository);
    }

}
