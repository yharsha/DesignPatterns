package singleton;

public class SingletonEverydayDemo {

	public static void main(String[] args) {

		Runtime singletonRuntime = Runtime.getRuntime();
		
		singletonRuntime.gc();
		
		System.out.println(singletonRuntime);
		
		Runtime anothersingletonRuntime = Runtime.getRuntime();
		
		System.out.println(anothersingletonRuntime);
		
		if(anothersingletonRuntime == singletonRuntime)
		{
			System.out.println("They are same Instance");
		}

	}

}
