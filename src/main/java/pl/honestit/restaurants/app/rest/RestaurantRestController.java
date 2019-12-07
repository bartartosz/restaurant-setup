package pl.honestit.restaurants.app.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.honestit.restaurants.app.dto.RestaurantDTO;
import pl.honestit.restaurants.app.services.RestaurantManager;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantRestController {

    private RestaurantManager restaurantManager;

    public RestaurantRestController(RestaurantManager restaurantManager) {
        this.restaurantManager = restaurantManager;
    }

    @GetMapping
    public List<RestaurantDTO> getAllRestaurants() {
        List<RestaurantDTO> restaurants = restaurantManager.allRestaurants();
        return restaurants;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getRestaurant(@PathVariable Long id) {
        RestaurantDTO restaurant = restaurantManager.getRestaurant(id);
        if (restaurant == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(restaurant);
    }

}
