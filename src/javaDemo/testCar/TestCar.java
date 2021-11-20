package javaDemo.testCar;

/**
 * @创建人 fxy
 * @创建时间 2021年11月6日
 */
public class TestCar {


    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("蓝色");
        car.setPrice(120000.0);
        System.out.println("车的价格：" + car.getPrice() + "," + "车的颜色：" + car.getColor());
    }
}
