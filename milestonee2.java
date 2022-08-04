package testt;

import java.util.*;

class Employee implements Comparable<Employee>{
	
	int cid;
	
	String name;
	
	int salary;
	
	int age;
	
	Employee(int cid,String name,int salary,int age){
		this.cid=cid;
		this.name=name;
		this.salary=salary;
	    this.age=age;
	}
	public void setsalary(int cid ) {
		this.salary = cid;
	}
	public int compareTo(Employee st) {
		if(name==st.name)
			return 0;
		else if(name.compareTo(st.name)<0)
			return 1;
		else
			return -1;
	}
}




public class milestonee2{
	public static void main(String args[]) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		al.add(new Employee(101,"Chalsi",9000000,25 ));
		al.add(new Employee(106,"Lucky",8000000,24 ));
		al.add(new Employee(109,"Namrata",5000000,28 ));
		al.add(new Employee(104,"Akbar",3000000,29 ));
		al.add(new Employee(103,"Amar",4000000,30 ));
		al.add(new Employee(105,"Abhishek",10000000,33 ));
		al.add(new Employee(108,"Shreya",9500000,26 ));
		al.add(new Employee(110,"Vishakha",4500000,43 ));
		al.add(new Employee(102,"Varun",6700000,27 ));
		al.add(new Employee(107,"Sid",8300000,19 ));
		
		
		int len=al.size();
		Scanner sc= new Scanner(System.in);
		
		
		String whilechoice="go";
		while (whilechoice=="go") {
			
			String avail="False";
			System.out.print("Enter Your Choice");
			System.out.print("1-->Employee Data. 2->EmployeeData in Descending Order.  ");
			System.out.print(" ");
			int a= sc.nextInt();
			
			switch (a) {
			
			case 1:
				System.out.println("");
				System.out.println("Employee Data ..");
				
				System.out.println("Employee Name Salary Age");
				
				for(Employee st:al){
					System.out.println(st.cid+" "+st.name+" "+st.salary+" "+st.age);
				}
				break;
				
			    case 2:
				System.out.println("");
				System.out.println("Employee Data in Descending Order.. ");
				
				System.out.println("Employee Data in Descending Order.. ");
				Collections.sort(al);
				for(Employee st:al) {
					System.out.println(st.cid+" "+st.name+" "+st.salary+" "+st.age);
				}
					break;
				

			}
		}
	}
}