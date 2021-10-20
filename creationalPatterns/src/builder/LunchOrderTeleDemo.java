package builder;

public class LunchOrderTeleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LunchOrderTele lunchOrderTele = new LunchOrderTele("wheat", "lettuce", "Mustard", "Ham");
		
		//Immutable ...but not configurable easily when compared with bean approach
		System.out.println(lunchOrderTele.getBread());
		System.out.println(lunchOrderTele.getCondiments());
		System.out.println(lunchOrderTele.getDressing());
		System.out.println(lunchOrderTele.getMeat());
	}

}
