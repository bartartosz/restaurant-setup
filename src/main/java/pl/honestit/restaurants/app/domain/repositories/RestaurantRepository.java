package pl.honestit.restaurants.app.domain.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.honestit.restaurants.app.domain.entities.Restaurant;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    /**
     * Metoda pobiera wszystkie resturacje razem z uzupełnioną listą posiłków
     * w polu <code>menu</code>.
     *
     * Domyślnie posiłki były by leniwie uzupełniane
     * @see javax.persistence.FetchType
     * @return Lista restauracji z posiłkami
     */
    @EntityGraph(type = EntityGraph.EntityGraphType.LOAD, attributePaths = "menu")
    List<Restaurant> findAllWithMealsBy();
}
