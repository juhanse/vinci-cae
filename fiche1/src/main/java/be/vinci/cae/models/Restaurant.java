package be.vinci.cae.models;

import java.util.Objects;

public class Restaurant {
    private String name;
    private String cuisine;

    public Restaurant(String name, String cuisine) {
        this.name = name;
        this.cuisine = cuisine;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return Objects.equals(name, that.name) && Objects.equals(cuisine, that.cuisine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cuisine);
    }
}
