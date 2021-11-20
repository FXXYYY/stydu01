package javaDemo.testCar;

/**
 * @创建人 41213
 * @创建时间 2021/11/6
 */
public class Car {

    //颜色
    private String color;

    //价格
    private Double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
