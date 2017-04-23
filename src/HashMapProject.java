import java.util.HashMap;
import java.util.Map;


public class HashMapProject {

    public static void main(String[] args) {

        Map<Car, String> hashMap = new HashMap<>();
        Car car1 = new Car(555, "name1");
        Car car2 = new Car(333, "name4");
        Car car3 = new Car(666, "name3");

        hashMap.put(car1, "CAR1");
        hashMap.put(car3, "CAR3");
        hashMap.put(car2, "CAR2");

        //отсортированные данные по хэшкоду ключа(объект типа Car)
        for (Map.Entry<Car, String> entry: hashMap.entrySet()) {
            System.out.println(entry);
        }




    }
}
