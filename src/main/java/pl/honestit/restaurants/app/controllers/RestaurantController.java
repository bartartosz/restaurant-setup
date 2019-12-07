package pl.honestit.restaurants.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.honestit.restaurants.app.domain.entities.Restaurant;
import pl.honestit.restaurants.app.domain.repositories.RestaurantRepository;
import pl.honestit.restaurants.app.dto.AddRestaurantDTO;
import pl.honestit.restaurants.app.services.RestaurantManager;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantRepository restaurantRepository;
    private final RestaurantManager restaurantManager;

    public RestaurantController(RestaurantRepository restaurantRepository, RestaurantManager restaurantManager) {
        this.restaurantRepository = restaurantRepository;
        this.restaurantManager = restaurantManager;
    }

    @GetMapping("/add")
    public String prepareAddRestaurantPage(Model model) {
        model.addAttribute("restaurant", new AddRestaurantDTO());
        return "restaurants/add";
    }

    @PostMapping("/add")
    public String processAddRestaurantPage(@ModelAttribute("restaurant") @Valid AddRestaurantDTO restaurant, BindingResult result) {
        if (result.hasErrors()) {
            return "/restaurants/add";
        }
        restaurantManager.setUpRestaurant(restaurant);
        return "restaurants/add-summary";
    }

    @GetMapping
    public String prepareAllRestaurantsPage(Model model) {
        List<Restaurant> restaurants = restaurantRepository.findAllWithMealsBy();
        model.addAttribute("restaurants", restaurants);
        return "restaurants";
    }
}
