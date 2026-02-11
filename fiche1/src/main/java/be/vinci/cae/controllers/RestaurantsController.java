package be.vinci.cae.controllers;

import be.vinci.cae.models.Restaurant;
import be.vinci.cae.services.RestaurantsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantsController {
    private final RestaurantsService restaurantService;

    public RestaurantsController(RestaurantsService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/")
    public List<Restaurant> getRestaurants(@RequestParam(required = false) String cuisine) {
        return restaurantService.getRestaurants(cuisine);
    }
}
