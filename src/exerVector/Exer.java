package exerVector;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		System.out.print("how many employees will be registered? ");
		int n=sc.nextInt();
		sc.nextLine();
		List<employeer> lista=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			System.out.println("employeer # "+i);
			System.out.print("ID: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.print("Name :");
			String name=sc.nextLine();
			System.out.print("Salary");
			double salary=sc.nextDouble();
			lista.add(new employeer(id, name,salary));
			
				}
		System.out.print("enter the employee id yhat wil have salary increase: ");
		int id=sc.nextInt();
		sc.nextLine();
		employeer emp=lista.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		if(emp==null) {
			System.out.println("id não  existe ");
			
		}else {
			 System.out.println("enter de percentage: ");
			 double perc=sc.nextDouble();
			 emp.aumento(perc);
		}
		System.out.println();
		System.out.println("lista de funcionarios");
		for(employeer valor:lista) {
			System.out.println(valor.getId()+" - "+valor.getName()+valor.getSalario());
			
		}
		sc.close();
		
		
	}

}
