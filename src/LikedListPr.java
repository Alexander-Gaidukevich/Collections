import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LikedListPr {

    public static void main(String[] args) {
        List<Car> carlLinkedList = new LinkedList<>();

        Car car1 = new Car(555, "name1");
        Car car2 = new Car(333, "name4");
        Car car3 = new Car(666, "name3");

        carlLinkedList.add(car1);
        carlLinkedList.add(car2);
        carlLinkedList.add(car3);

        for (Car car: carlLinkedList) {
            System.out.println(car);
        }
        System.out.println("===================================================");
        Iterator<Car> iterator = carlLinkedList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
