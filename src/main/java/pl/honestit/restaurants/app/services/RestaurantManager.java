package pl.honestit.restaurants.app.services;

import pl.honestit.restaurants.app.dto.AddRestaurantDTO;
import pl.honestit.restaurants.app.dto.RestaurantDTO;

import java.util.List;

public interface RestaurantManager {

    void setUpRestaurant(AddRestaurantDTO restaurantDTO);

    List<RestaurantDTO> allRestaurants();

    RestaurantDTO getRestaurant(Long id);
}
