package builder;

public class LunchOrderTele {
	
	private String bread;
	
	private String condiments;
	
	private String dressing;
	
	private String meat;
	
	
    //Its immutable now since no setter methods but diff combinations of order like only meat are not dealt


	public LunchOrderTele(String bread) {
		super();
		this.bread = bread;
	}
	

	public LunchOrderTele(String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}

	public LunchOrderTele(String bread, String condiments, String dressing) {
		this(bread,condiments);
		this.dressing = dressing;
	}


	public LunchOrderTele(String bread, String condiments, String dressing, String meat) {
		this(bread,condiments,dressing);
		this.meat = meat;
	}


	public String getBread() {
		return bread;
	}


	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}


	public String getMeat() {
		return meat;
	}


}
