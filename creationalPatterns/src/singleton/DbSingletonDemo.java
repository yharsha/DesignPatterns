package singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbSingleton instance = DbSingleton.getInstance();
		
		System.out.println(instance);
		
		DbSingleton testInstance = DbSingleton.getInstance();
		System.out.println(testInstance);

	}

}
