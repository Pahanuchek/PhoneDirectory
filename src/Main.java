import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(new Employee(1, "123-456-7890", "Иванов Иван", 5));
        directory.addEmployee(new Employee(2, "234-567-8901", "Петров Петр", 3));
        directory.addEmployee(new Employee(3, "345-678-9012", "Сидоров Сидор", 5));
        directory.addEmployee(new Employee(4, "456-789-0123", "Иванов Иван", 2));

        System.out.println("Сотрудники со стажем 5 лет:");
        List<Employee> employeesWith5Years = directory.findByExperience(5);
        for (Employee employee : employeesWith5Years) {
            System.out.println(employee);
        }

        System.out.println("\nНомера телефонов сотрудников с именем Иванов Иван:");
        List<String> phoneNumbers = directory.findPhoneNumbersByName("Иванов Иван");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        System.out.println("\nСотрудник с табельным номером 2:");
        Employee employee = directory.findByIdNumber(2);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Сотрудник не найден.");
        }

        System.out.println("\nВсе сотрудники:");
        directory.printAllEmployees();
    }
}
