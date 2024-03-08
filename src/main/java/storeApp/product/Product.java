package games.storeApp5.product;

public class Product {

    public String name;
    public double weight;
    public int count;

    public Product(String name, double weight, int count) {
        this.name = name;
        this.weight = weight;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", count=" + count +
                '}';
    }
}
