import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulations;

    public CityPopulationTracker(){
        this.cityPopulations = new HashMap<>();
    }

    public City getCity(String cityName){
        City newCity = this.cityPopulations.get(cityName);

        return new City(newCity);
    }

    public void setCity(City newCity){
        String cityName = newCity.getName();

        this.cityPopulations.put(cityName, new City(newCity));
    }

    public void addCity(City newCity){
        String cityName = newCity.getName();

        this.cityPopulations.put(cityName, new City(newCity));
    }

}
