import java.util.*;

class Employee
{
    public String EmployeeName;
    private int EmployeeId;
    private float salary;

    public Employee(int EmployeeId, String EmployeeName, float salary)
    {
        this.EmployeeId =  EmployeeId;
        this.EmployeeName = EmployeeName;
        this.salary = salary;
    }

    public String toString()
    {
        return this.EmployeeId + ". " + this.EmployeeName;
    }
}

class SortByName implements Comparator<Employee> {
    public int compare(Employee a, Employee b)
    {
        return a.EmployeeName.compareTo(b.EmployeeName);
    }

}


public class EmployeeMain {
    public static void main(String[] args)
    {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(1, "Digendra", 10000));
        emp.add(new Employee(2, "Prashant", 12000));
        emp.add(new Employee(3, "Joseph", 30000));
        emp.add(new Employee(4, "Unnati", 100000));
        emp.add(new Employee(5, "Manzar", 70000));
        emp.add(new Employee(6, "OmPrakash ", 28000));
        System.out.println("Before Sorting");
        System.out.println(emp);

        Collections.sort(emp, new SortByName());

        System.out.println("\nSorted by name");
        for (Employee employee : emp) System.out.println(employee);

    }
}
