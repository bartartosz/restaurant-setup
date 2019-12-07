package pl.honestit.restaurants.app.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import pl.honestit.restaurants.app.domain.entities.Ingredients;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

public interface IngredientsRepository extends JpaRepository<Ingredients, Long> {

}
