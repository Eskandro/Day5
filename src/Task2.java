public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("BMW ", "White ", 2023);
    }
}
class Motorbike {
    private String model;
    private String color;
    private int year;
    public Motorbike(String model, String color, int year)
    {
        this.model = model;
        this.color = color;
        this.year = year;
        System.out.println(getModel() + getColor() + getYear());
    }
    public String getModel() {
        if(model.isEmpty()){
            return "Вы не указали модель\n";
        }
        else
        {
            return model;
        }
    }

    public String getColor() {
        if(color.isEmpty()) {
            return "Вы не указали цвет\n";
        } else {
        return color; }
    }

    public int getYear() {
        if(year < 0) {
            return 0;
        } else {
        return year; }
    }
}