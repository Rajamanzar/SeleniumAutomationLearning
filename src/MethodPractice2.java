import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodPractice2 {

public int multiply(int num1, int num2) {
		
		int multi = num1 * num2;
		System.out.println(multi);
		return multi;
	}

public List<String> cloud1Emplpoyees(List<String> strList) {
	
	
	List<String> coll = new ArrayList<String>();
	
	for(String s:strList) {
		
		String[] splittedString = s.split(",");

		System.out.println(s);
		
		coll.add(s);
		
		
		
		
	}
	
	return coll;
}

}
