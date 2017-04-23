import java.util.*;

public class TreeSetPr {

    public static void main(String[] args) {

        Set<Car> set = new TreeSet<>();

        Car car1 = new Car(555, "name1");
        Car car2 = new Car(333, "name4");
        Car car3 = new Car(666, "name3");

        set.add(car1);
        set.add(car3);
        set.add(car2);

        for (Car car: set) {
            System.out.println(car);
        }


    }
}
