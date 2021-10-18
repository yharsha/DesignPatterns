package singleton;

public class DbSingleton {
	
	private static volatile DbSingleton instance = null;
	
	private DbSingleton()
	{
		if(instance!=null)
		{
			throw new RuntimeException("Use getInsance() method to create");
		}
	}
	
	
	public static DbSingleton getInstance(){
		
		//lazily loaded
		if(instance==null)
		{
			//thread-safe
			synchronized (DbSingleton.class) {
				if(instance==null)
				{
				instance = new DbSingleton();
				}
			}
		
		}
		
		return instance;
	}

}
