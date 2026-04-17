import java.util.*;
import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Nabati", "Hidayatov", 3000));
        list.add(new Employee("Turan", "Sadigli", 4500));

        Function<Employee, String> formatCard =
                e -> "Name: [" + e.getLastName() + ", " + e.getFirstName() + "] - Salary: $" + e.getSalary();

        Function<Employee, Double> salaryPicker = Employee::getSalary;

        for (Employee e : list) {
            System.out.println(formatCard.apply(e));
            System.out.println("Salary only: $" + salaryPicker.apply(e));
        }
    }
}
