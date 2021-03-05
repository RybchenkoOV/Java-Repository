package lesson4;

/** 1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
 2 Конструктор класса должен заполнять эти поля при создании объекта;
 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
 4 Вывести при помощи методов из пункта 3 ФИО и должность.
 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер. */

public class Employee {
    /** Переменные класса */
    static int id = 0; // вводим переменную для счетчика
    String surname;
    String name;
    String secName;
    String position;
    String telephone;
    int salary;
    int age;

    /** Задание 2. Employee конструктор */
    Employee(int id, String surname,String name,String secName,String position,String telephone,int salary,int age) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secName = secName;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    /** Задание 3. Get методы */
    public int getEmpId() {return createId();} // возвращаем метод уникального ID

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecName() {
        return secName;
    }

    public String getPosition() {
        return position;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    /** Задание 6. Метод повышения зарплаты */
    public static int increaseSalary (int oldSalary, int compareAge) {
        if (compareAge > 35) {
            oldSalary += 10000;
        }
        return oldSalary;
    }

    /** Задание 7. Метод уникального id */
    public static int createId () {
        return id++; // увеличиваем счетчик переменной id на 1
    }

    public static void main(String[] args) {

    }
}