package Varad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(1, "Varad", 1200));
		al.add(new Employee(2, "Akash", 1500));
		al.add(new Employee(3, "Varad", 46000));
		al.add(new Employee(1, "Anjali", 54378000));
		
		int ch;
		do {
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				al.add(new Employee(1, "Varad", 1200));
				al.add(new Employee(2, "Akash", 1500));
				al.add(new Employee(3, "Varad", 46000));
				al.add(new Employee(1, "Anjali", 54378000));
				
				
				//System.out.println(arr);

				
				System.out.println(al);
				break;

			case 2:
				System.out.println(al);
				break;

			case 3:
				ListIterator<Employee> it1 = al.listIterator();
				int id = sc.nextInt();

				while (it1.hasNext()) {
					Employee e = it1.next();
					if (e.getId() == id) {
						String name = "Ashwani";
						int Salary = 10;
						Employee e2 = new Employee(id, name, Salary);
						it1.set(e2);
					} else {
						System.out.println();
					}
				}
				break;

			case 4:
				Iterator<Employee> ep = al.iterator();
				id = sc.nextInt();

				while (ep.hasNext()) {
					Employee ss = ep.next();
					if (ss.getId() == id) {
						ep.remove();
					} else {
						System.out.println();
					}
				}
				break;

			}
		} while (ch != 0);

	}
}
