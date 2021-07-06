import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName){
        for(Restaurant Rsnt: restaurants) {
            if(Rsnt.getName().equals(restaurantName))
                return Rsnt;
        }
        return null;
        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        addRestaurant("Chio Cafe","Chenai",LocalTime.parse("10:00:00"), LocalTime.parse("22:00:00"));
        addRestaurant("Bristo Cafe","Madrash",LocalTime.parse("10:00:00"), LocalTime.parse("22:00:00"));
        addRestaurant("Anjarappan","Pan India",LocalTime.parse("07:00:00"), LocalTime.parse("23:00:00"));
        addRestaurant("Mainland China","India",LocalTime.parse("00:00:00"), LocalTime.parse("23:59:00"));
        return this.restaurants;
    }
}
