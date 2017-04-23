
public class Car  { //implements Comparable<Car>

    private int cost;
    private String name;

    public Car(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (cost != car.cost) return false;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        int result = cost;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Car car) {
//        return cost - car.getCost();
//    }
}
