package pl.honestit.restaurants.app.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.honestit.restaurants.app.domain.entities.Restaurant;
import pl.honestit.restaurants.app.domain.repositories.RestaurantRepository;
import pl.honestit.restaurants.app.dto.AddRestaurantDTO;
import pl.honestit.restaurants.app.dto.RestaurantDTO;
import pl.honestit.restaurants.app.services.RestaurantManager;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class DefaultRestaurantManagerService implements RestaurantManager {

    private final RestaurantRepository restaurantRepository;

    @Override
    public void setUpRestaurant(AddRestaurantDTO restaurantDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Restaurant restaurant = modelMapper.map(restaurantDTO, Restaurant.class);
        restaurant.setStars(0);
        log.debug("Zapis restauracji: {}", restaurant);
        restaurantRepository.save(restaurant);
        log.debug("Zapisano restaurację: {}", restaurant);
    }

    @Override
    public List<RestaurantDTO> allRestaurants() {
        ModelMapper mapper = new ModelMapper();
        return restaurantRepository.findAll().stream().map(r -> mapper.map(r, RestaurantDTO.class)).collect(Collectors.toList());
    }

    @Override
    public RestaurantDTO getRestaurant(Long id) {
        ModelMapper modelMapper = new ModelMapper();
        return restaurantRepository.findById(id).map(r -> modelMapper.map(r, RestaurantDTO.class)).orElse(null);
    }
}
