package array;

import java.util.Arrays;

public class CopyTest {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];

        carArray[0] = new Car("아우디");
        carArray[1] = new Car("벤츠");
        carArray[2] = new Car("BMW");

        //================================================================================================================
        // System.arraycopy
        //================================================================================================================
        // shallow copy
        Car[] copyArray1 = new Car[3];

        System.arraycopy(carArray, 0, copyArray1, 0, carArray.length);

        copyArray1[0].setCarName("람보르기니");

        System.out.println(carArray[0].getCarName());

        //================================================================================================================
        // Object.clone
        //================================================================================================================
        // primitive array만 deep copy, object array는 shallow copy
        Car[] copyArray2 = carArray.clone();

        copyArray2[0].setCarName("링컨");

        System.out.println(carArray[0].getCarName());

        //================================================================================================================
        // Arrays.copyOf
        //================================================================================================================
        // shallow copy
        Car[] copyArray3 = Arrays.copyOf(carArray, 2);

        copyArray3[1].setCarName("부가티");

        System.out.println(carArray[1].getCarName());

        //================================================================================================================
        // Arrays.copyOf
        //================================================================================================================
        // shallow copy
        Car[] copyArray4 = Arrays.copyOfRange(carArray, 1, 3);

        for (Car car : copyArray4) {
            System.out.println(car.getCarName());
        }
    }
}
