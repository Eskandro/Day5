public class Main {
    public static void main(String[] args) {
        Car MyCar = new Car();
        MyCar.setModel("");
        MyCar.setColor("");
        MyCar.setYear(-2023);
        System.out.println("Модель машины: " + MyCar.getModel() + "\nЦвет машины: " + MyCar.getColor() + "\nГод выпуска машины: "+ MyCar.getYear());

    }
}
class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String carModel) {
        if(carModel.isEmpty()){
            System.out.println("Ты ввел пустую строку в модели");
        } else {
            model = carModel;
        }
    }
    public String getModel() {
        return model;
    }
    public void setColor(String carColor) {
        if(carColor.isEmpty()) {
            System.out.println("Ты не заполнил цвет");
        } else {
        color = carColor; }
    }
    public String getColor() {
        return color;
    }
    public void setYear(int carYear) {
        if(carYear < 0) {
            System.out.println("Год выпуска не может быть отрицательным");
        } else {
            year = carYear;
        }
    }
    public int getYear() {
        return year;
    }
}