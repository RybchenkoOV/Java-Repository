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

    /** Точка входа */
    public static void main(String[] args) {
    /** Создаем сотрудников */
        Employee employee1 = new Employee(id, "Boltzmann", "Brain", "Universovich", "Director", "8916-568-8974", 320000, 54);
        Employee employee2 = new Employee(id, "Eremeeva", "Galina", "Stepanovna", "Bookeeper", "8905-123-7424", 150000, 56);
        Employee employee3 = new Employee(id, "Maksimov", "Alexey", "Grigorievich", "Project Manager", "8910-253-1269", 100000, 35);
        Employee employee4 = new Employee(id, "Polyakova", "Anna", "Valentinovna", "Developer", "8963-133-4389", 200000, 38);
        Employee employee5 = new Employee(id, "Rybchenko", "Oleg", "Vitalievich", "QA Lead", "8495-777-7777", 200000, 36);

    /** Задание 4. Выводим ФИО и должность сотрудника */
        System.out.println("Задание 4:");
        System.out.println("ID: " + employee1.getEmpId() + "\nSurname: " + employee1.getSurname() + "\nName: " + employee1.getName() + "\nSecond Name: " + employee1.getSecName() + "\nPostition: " + employee1.getPosition() + "\nTelephone: " +employee1.getTelephone() + "\nSalary: " +employee1.getSalary() + "\nAge: " +employee1.getAge() + "\n");
        System.out.println("ID: " + employee2.getEmpId() + "\nSurname: " + employee2.getSurname() + "\nName: " + employee2.getName() + "\nSecond Name: " + employee2.getSecName() + "\nPostition: " + employee2.getPosition() + "\nTelephone: " +employee2.getTelephone() + "\nSalary: " +employee2.getSalary() + "\nAge: " +employee2.getAge() + "\n");

    /** Задание 5. Создаем массив и цикл */
        System.out.println("Задание 5:");
        Employee[] empArray = new Employee[5];
        empArray[0] = employee1;
        empArray[1] = employee2;
        empArray[2] = employee3;
        empArray[3] = employee4;
        empArray[4] = employee5;
            for (int i = 0; i < empArray.length; i++) {
                if (empArray[i].age > 40) {
                    System.out.println("ID: " + empArray[i].getEmpId() + "\nSurname: " + empArray[i].getSurname() + "\nName: " + empArray[i].getName() + "\nSecond Name: " + empArray[i].getSecName() + "\nPostition: " + empArray[i].getPosition() + "\nTelephone: " +empArray[i].getTelephone() + "\nSalary: " +empArray[i].getSalary() + "\nAge: " +empArray[i].getAge() + "\n");
                }
            }

    /** Задание 6. Реализация метода */
        System.out.println("Задание 6:");
            for (int i = 0; i < empArray.length; i++) {
            System.out.println("ID: " + empArray[i].getEmpId() + "\nSurname: " + empArray[i].getSurname() + "\nName: " + empArray[i].getName() + "\nSecond Name: " + empArray[i].getSecName() + "\nPostition: " + empArray[i].getPosition() + "\nTelephone: " +empArray[i].getTelephone() + "\nSalary: " +increaseSalary(empArray[i].salary, empArray[i].age) + "\nAge: " +empArray[i].getAge() + "\n");
        }
    }
}