package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("КАПО", 2012, 17, 25.4);
        airplane.setYear(2014);
        airplane.setLenght(13);
        airplane.fillUp(54);
        airplane.fillUp(33);
        airplane.info();
    }
}

class Airplane {
    private String manufacturer;
    private int year;
    private int lenght;
    private double weight;
    private double fuel = 0;

    public Airplane(String manufacturer, int year, int lenght, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
    }

    void info() {
        System.out.println("Изготовитель " + manufacturer + "\nгод выпуска " + year + "\nдлина " + lenght + "\nвес " + weight + "\nкол-во топлива в баке " + fuel);
    }

    double fillUp(int n) {
        fuel += n;
        return fuel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }
}