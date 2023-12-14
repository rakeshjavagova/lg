package lg.lg;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private List<Employee> employees;
    
    

    // Constructors, getters, setters, and other methods...

    @Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", employees=" + employees + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public List<Employee> getEmployees() {
		return employees;
	}



	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}



	public static void main(String[] args) throws Exception {
        // Creating an example Employee object
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setSalary(50000.0);

        // Creating a list of employees (for demonstration purposes)
        Employee subordinate1 = new Employee();
        subordinate1.setId(2);
        subordinate1.setFirstName("Alice");
        subordinate1.setLastName("Smith");
        subordinate1.setSalary(45000.0);

        Employee subordinate2 = new Employee();
        subordinate2.setId(3);
        subordinate2.setFirstName("Bob");
        subordinate2.setLastName("Johnson");
        subordinate2.setSalary(48000.0);

        employee.setEmployees(Arrays.asList(subordinate1, subordinate2));

        System.out.println(employee.toString());
        // Converting the Employee object to JSON
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(employee);

        // Printing the JSON representation
        System.out.println(jsonString);
    }
}

