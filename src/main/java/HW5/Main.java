package HW5;

import java.util.Arrays;
public class Main {

        public static void main(String[] args) {

            Employee employee = new Employee("Корякин Иван", "Менеджер", "email1@me.com", "8923500100", 100000, 34);
            employee.info();

            Employee[] employees = new Employee[5];
            employees[0] = new Employee("Корякин Самуил", "Менеджер", "email1@me.com", "8923500100", 100000, 34);
            employees[1] = new Employee("Пупкин Иван", "Разработчик", "email2@me.com", "8923500101", 150000, 42);
            employees[2] = new Employee("Сергеев Тварь", "Инженер", "email3@me.com", "8923500102", 75000, 45);
            employees[3] = new Employee("Рыльскай Григорий", "Уборщик", "email4@me.com", "8923500103", 35000, 78);
            employees[4] = new Employee("Ильин Серафим", "Самогонщик", "email5@me.com", "8923500104", 65000, 12);
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getAge() > 40) {
                    employees[i].info();
                }
            }
        }
    }