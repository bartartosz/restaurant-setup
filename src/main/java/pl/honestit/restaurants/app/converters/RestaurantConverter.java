package pl.honestit.restaurants.app.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.honestit.restaurants.app.domain.entities.Restaurant;
import pl.honestit.restaurants.app.domain.repositories.RestaurantRepository;

public class RestaurantConverter implements Converter<String, Restaurant> {

    private RestaurantRepository restaurantRepository;

    @Autowired
    public void setRestaurantRepository(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Restaurant convert(String id) {
        return restaurantRepository.getOne(Long.parseLong(id));
    }
}
