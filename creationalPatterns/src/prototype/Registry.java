package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem(String Type)
	{
		Item item = null;
		try {
			item = (Item)(items.get(Type)).clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		return item;
	}
	
	
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Robot");
		movie.setPrice(36.78);
		movie.setRuntime("2 hours");
		items.put("Movie", movie);
		
		
		Book book = new Book();
		book.setTitle("HarryPotter");
		book.setNumberOfPages(198);
		movie.setPrice(36.78);
		items.put("Book", book);
		
	}
	
	
	
}
