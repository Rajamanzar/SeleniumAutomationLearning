import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaPractice {

	public static void main(String[] args) {
		
		//Arrays 
		
		String[] cloud1Employees = {"Areez","Manzar","Bilal","Raza","Ali","Bilal"};
		
		//String name = ;
		System.out.println(cloud1Employees[2]);
		
		
		for(int i=1; i <cloud1Employees.length; i++){
			System.out.println(cloud1Employees[i]);
		}
		
		System.out.println("Next loop");
		for(String name : cloud1Employees) {
			System.out.println(name);
		}
		
		/*ArrayList<String> employees = new ArrayList<String>();
		employees.add( "Manzar");
		employees.add( "Areez");
		employees.add( "Raza"); */
		
		List<String> strList = Arrays.asList(cloud1Employees);
		
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.addAll(strList);
		
		for(String s :nameList) {
			if(s.contains("Raza")) {
				System.out.println("Raza is an employee");
			}else {
				System.out.println(s);
			}
		}

	}

}
