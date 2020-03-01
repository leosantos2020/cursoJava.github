package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("LEO");
		list.add("Marcos");
		list.add("jose");
		list.add("maria");
	
		for( String x:list) {
			System.out.println(x);
		}
		System.out.println("---------------");
	
		
			
			List<String> result= list.stream().filter( x -> x.charAt(0)!='L').collect(Collectors.toList());
			for( String x:result) {
				System.out.println(x);
			}
			System.out.println(list.indexOf("jose"));
			String name= list.stream().filter( x -> x.charAt(0)=='m').findFirst().orElse(null);
			System.out.println(name);
	}
	

}
