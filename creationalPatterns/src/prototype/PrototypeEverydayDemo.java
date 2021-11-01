package prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select * from movies where title = ?";
		
		List<String> parameters = new ArrayList<>();
		parameters.add("Luka");
		
		Record record = new Record();
		
		Statement st1 = new Statement(sql, parameters, record);
		
		System.out.println(st1.toString());
		
		//shallow copy
		Statement st2 = st1.Clone();
		
		System.out.println(st2.toString());
		
	}

}
