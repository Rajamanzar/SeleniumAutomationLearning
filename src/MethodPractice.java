import java.util.Arrays;
import java.util.List;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cloudEmployees = {"Areez","Manzar","Bilal","Raza","Ali","Bilal"};
		List<String> strList = Arrays.asList(cloudEmployees);
		MethodPractice obj = new MethodPractice();
		int ans = obj.sum(9, 8);
		
		MethodPractice2 obj1 = new MethodPractice2();
		
		int ans2 = obj1.multiply(5, 67);
		
		List<String> stringList = obj1.cloud1Emplpoyees(strList);
		

	}
	
	public int sum(int num1, int num2) {
		
		int add = num1 + num2;
		System.out.println(add);
		return add;
	}

}
