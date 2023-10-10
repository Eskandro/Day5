package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов И.И", "математика");
        Student student = new Student("Никита");
        teacher.evaluate(student);
    }
}

class Teacher {
    private String name;
    private String subject;
    Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student) {
        int randomValue = random.nextInt(4) + 2;
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName()
                + " по предмету " + subject + " на оценку " + randomValue);
        if (randomValue == 2) {
            System.out.println("неудовлетворительно");
        } else if (randomValue == 3) {
            System.out.println("удовлетворительно");
        } else if (randomValue == 4) {
            System.out.println("хорошо");
        } else if (randomValue == 5) {
            System.out.println("отлично");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}