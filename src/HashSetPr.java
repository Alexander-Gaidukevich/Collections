import java.util.HashSet;
import java.util.Set;

public class HashSetPr {

    public static void main(String[] args) {
        Set<Car> carsHashSet = new HashSet<>();

        Car car1 = new Car(555, "name1");
        Car car2 = new Car(333, "name4");
        Car car3 = new Car(666, "name3");

        carsHashSet.add(car1);
        carsHashSet.add(car2);
        carsHashSet.add(car3);

        for (Car car: carsHashSet) {
            System.out.println(car);
        }
    }



}
