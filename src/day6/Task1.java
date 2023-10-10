package day6;

public class Task1 {
    public static void main(String[] args) {
        newCar MyCar = new newCar();
        MyCar.setModel("Lada");
        MyCar.setColor("Black");
        MyCar.setYear(2017);
        System.out.println("Модель машины: " + MyCar.getModel() + "\nЦвет машины: " + MyCar.getColor() + "\nГод выпуска машины: " + MyCar.getYear());
        MyCar.info();
        int yearTransferCar = MyCar.yearDifference(2020);
        System.out.println(yearTransferCar);
        System.out.println();
        newMotorbike motorbike = new newMotorbike("BMW ", "White ", 2010);
        motorbike.info();
        int yearTransferMotorbike = motorbike.yearDifference(2020);
        System.out.println(yearTransferMotorbike);
    }
}

class newCar {
    private String model;
    private String color;
    private int year;

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {
        if (inputYear - year < 0) {
            return 0;
        } else {
            return inputYear - year;
        }
    }

    public void setModel(String carModel) {
        if (carModel.isEmpty()) {
            System.out.println("Ты ввел пустую строку в модели");
        } else {
            model = carModel;
        }
    }

    public String getModel() {
        return model;
    }

    public void setColor(String carColor) {
        if (carColor.isEmpty()) {
            System.out.println("Ты не заполнил цвет");
        } else {
            color = carColor;
        }
    }

    public String getColor() {
        return color;
    }

    public void setYear(int carYear) {
        if (carYear < 0) {
            System.out.println("Год выпуска не может быть отрицательным");
        } else {
            year = carYear;
        }
    }

    public int getYear() {
        return year;
    }
}
class newMotorbike {
    private String model;
    private String color;
    private int year;

    void info() {
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int inputYear) {
        if (inputYear - year < 0) {
            return 0;
        } else {
            return inputYear - year;
        }
    }

    public newMotorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
        System.out.println(getModel() + getColor() + getYear());
    }

    public String getModel() {
        if (model.isEmpty()) {
            return "Вы не указали модель\n";
        } else {
            return model;
        }
    }

    public String getColor() {
        if (color.isEmpty()) {
            return "Вы не указали цвет\n";
        } else {
            return color;
        }
    }

    public int getYear() {
        if (year < 0) {
            return 0;
        } else {
            return year;
        }
    }
}