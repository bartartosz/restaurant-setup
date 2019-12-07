package pl.honestit.restaurants.app.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class AddRestaurantDTO {

    @NotBlank @Size(min = 3)
    private String name;
    @Size(max = 1000)
    private String description;
    private String simpleAddress;

}
