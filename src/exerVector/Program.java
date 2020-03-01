package exerVector;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("how many rooms will be rented? ");
		int n=sc.nextInt();
		sc.nextLine();
		Student[] vect= new Student[10];
		
		for(int c=0;c<n;c++) {
			String name=sc.nextLine();
			String email=sc.nextLine();
			int room=sc.nextInt();
			sc.nextLine();
			vect[room]=new Student(name,email);
			
		}
		int j=1;
		for(int i=0;i<vect.length;i++) {
			
			if(vect[i]!=null) {
		
				
				System.out.println("Rent # "+j);
				System.out.println("name: "+vect[i].getName());
				System.out.println("email: "+vect[i].getEmail());
				System.out.println("Room: "+i);
				System.out.println();
				j++;
			
				
				
			}
		}
		System.out.println("busy rooms: ");
		for(int i=0;i<vect.length;i++) {
			
			if(vect[i]!=null) {
				System.out.println(i+" : "+vect[i].getName()+" , "+vect[i].getEmail());
		
				
						
				
			
		}
		
			
		}
	}

}
