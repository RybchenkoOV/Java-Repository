package lesson4;

public class Homework4 {

    /** Точка входа */
    public static void main(String[] args) {
        /** Создаем сотрудников */
        Employee employee1 = new Employee(Employee.id, "Boltzmann", "Brain", "Universovich", "Director", "8916-568-8974", 320000, 54);
        Employee employee2 = new Employee(Employee.id, "Eremeeva", "Galina", "Stepanovna", "Bookeeper", "8905-123-7424", 150000, 56);
        Employee employee3 = new Employee(Employee.id, "Maksimov", "Alexey", "Grigorievich", "Project Manager", "8910-253-1269", 100000, 35);
        Employee employee4 = new Employee(Employee.id, "Polyakova", "Anna", "Valentinovna", "Developer", "8963-133-4389", 200000, 38);
        Employee employee5 = new Employee(Employee.id, "Rybchenko", "Oleg", "Vitalievich", "QA Lead", "8495-777-7777", 200000, 36);

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
            System.out.println("ID: " + empArray[i].getEmpId() + "\nSurname: " + empArray[i].getSurname() + "\nName: " + empArray[i].getName() + "\nSecond Name: " + empArray[i].getSecName() + "\nPostition: " + empArray[i].getPosition() + "\nTelephone: " +empArray[i].getTelephone() + "\nSalary: " +Employee.increaseSalary(empArray[i].salary, empArray[i].age) + "\nAge: " +empArray[i].getAge() + "\n");
        }
    }
}
