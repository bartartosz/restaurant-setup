package pl.honestit.restaurants.app.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@ToString @EqualsAndHashCode(of = "id")

@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;
    private Integer stars;

    @OneToMany(mappedBy = "restaurant")
    private List<Meal> menu;
}
