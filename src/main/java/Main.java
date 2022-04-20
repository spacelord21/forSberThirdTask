import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cities = CityUtils.parse();
        System.out.println(findMaxPopulation(cities));
    }

    private static String findMaxPopulation(List<City> cities) {
        City[] arrayWithCities = new City[cities.size()];
        for(int i = 0; i < arrayWithCities.length; i++) {
            arrayWithCities[i] = cities.get(i);
        }
        int maxPopulation = arrayWithCities[0].getPopulation();
        int maxIndex = 0;
        for(int i = 0; i < arrayWithCities.length; i++) {
            if(arrayWithCities[i].getPopulation()>maxPopulation) {
                maxPopulation = arrayWithCities[i].getPopulation();
                maxIndex = i;
            }
        }
        return "["+maxIndex+"] = " + maxPopulation;
    }
}
