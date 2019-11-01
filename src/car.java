import java.util.InputMismatchException;
import java.util.Scanner;

interface car {
    String getName();
    int getPrice();
    String getColor();
}

class BMW implements car {
    public String getName() {
        String bmw = "BMW";
        return bmw;
    }
    public int getPrice() {
        return 200000;
    }
    public String getColor() {
        String color1 = "黑色";
        return color1;
    }
}

class CheryQQ implements car {
    @Override
    public String getName() {
        String qq = "CheryQQ";
        return qq;
    }

    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public String getColor() {
        String color2 = "白色";
        return color2;
    }
}

class CarShop {
    private int qian = 0;

    public void sellCar(car car) {
        System.out.println("车型" + car.getName() + "，颜色是" + car.getColor() + ",价格为" + car.getPrice() + "元");
        qian += car.getPrice();
        }

    public int getQian() {
        return qian;
    }

    public static void main(String[] args) {

        CarShop shop = new CarShop();
        shop.sellCar(new BMW());
        shop.sellCar(new CheryQQ());
        System.out.println("到目前为止卖出的车总价为:" + shop.getQian() + "元");
    }
}


