package builder;

public class LunchOrderBeanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LunchOrderBean lunchOrderBean = new LunchOrderBean();
		
		
		
		lunchOrderBean.setBread("Wheat");
		lunchOrderBean.setCondiments("Lettuce");
		lunchOrderBean.setDressing("Mustard");
		lunchOrderBean.setMeat("Ham");
		
		//NOT Immutable - cant say it is a valid lunch order
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());
	}

}
