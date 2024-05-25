package ru.astondevs.aqa_course;

import ru.astondevs.aqa_course.entity.Employee;
import ru.astondevs.aqa_course.park_info.Park;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        employeesArray[1] = new Employee("Petrov Petr", "Manager",
                "petrov@mailbox.com", "891234567", 40000, 35);
        employeesArray[2] = new Employee("Sidorov Alexey", "Ride operator",
                "sidorov@mailbox.com", "890987654", 50000, 28);
        employeesArray[3] = new Employee("Kozlova Maria", "Ride operator",
                "kozlova@mailbox.com", "890123456", 35000, 25);
        employeesArray[4] = new Employee("Smirnov Sergey", "Park director",
                "smirnov@mailbox.com", "899876543", 70000, 45);

        employeesArray[0].printInfo();
        employeesArray[1].printInfo();
        employeesArray[2].printInfo();
        employeesArray[3].printInfo();
        employeesArray[4].printInfo();

        Park gomelPark = new Park();
        gomelPark.AddNewAttractionInfo("Kids Train", "10:00 - 18:00", 100);
        gomelPark.AddNewAttractionInfo("Strength Test", "12:00 - 20:00", 200);
        gomelPark.AddNewAttractionInfo("Ferris Wheel", "11:00 - 19:00", 150);

        gomelPark.AllAttractionInfo();
    }
}
