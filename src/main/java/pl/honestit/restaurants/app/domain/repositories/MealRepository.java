package pl.honestit.restaurants.app.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.honestit.restaurants.app.domain.entities.Meal;

public interface MealRepository extends JpaRepository<Meal, Long> {

}
