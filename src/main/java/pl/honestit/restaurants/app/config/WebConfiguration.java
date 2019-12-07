package pl.honestit.restaurants.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pl.honestit.restaurants.app.converters.RestaurantConverter;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Bean
    public RestaurantConverter restaurantConverter() {
        return new RestaurantConverter();
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(restaurantConverter());
    }
}
