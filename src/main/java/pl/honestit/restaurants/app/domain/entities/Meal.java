package pl.honestit.restaurants.app.domain.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@ToString(exclude = "restaurant") @EqualsAndHashCode(of = "id")

@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(precision = 15, scale = 2)
    private Double price;
    private Integer weight;

    @ManyToOne
    private Restaurant restaurant;

    @ManyToMany
    private List<Ingredients> ingredients;
}
