package javaDemo.Qs;

import javaDemo.testCar.Car;

/**
 * @创建人 41213
 * @创建时间 2021/11/6
 */
public class TestQs {
    public static void main(String[] args) {
        //创建对象
        QsDemo qsDemo = new QsDemo();

        String b = qsDemo.b;
        System.out.println(b);
        Car car = new Car();
        car.setPrice(120000.00);
        Double price = car.getPrice();
        System.out.println(price);
        System.out.println(car.toString());
    }
}
