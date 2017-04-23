import java.util.Map;
import java.util.TreeMap;


public class TreeMapProject {

    public static void main(String[] args) {

        Map<Integer, Car> carsMap = new TreeMap<>();

        Car car1 = new Car(555, "name1");
        Car car2 = new Car(333, "name4");
        Car car3 = new Car(666, "name3");

        carsMap.put(1, car1);
        carsMap.put(2, car2);
        carsMap.put(3, car3);
        car3 = new Car(777, "name3");
        carsMap.put(3, car3);
        carsMap.put(4, null);

        //в качестве ключа не могут быть значения null, в качестве значений - могут

        //Map.Entry<Integer, Car> - интерфейс для перебора объектов типа Entry  в нашей carsMap
        //чтобы получить список объектов Entry в нашей carsMap вызываем метод entrySet()
        for (Map.Entry<Integer, Car> entry : carsMap.entrySet()) {
            System.out.println(entry);
        }


    }

}
