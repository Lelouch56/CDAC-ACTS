package customer;

public enum ServicePlan {
	SILVER(1000),GOLD(2200),DIAMOND(5000),PLATINUM(10000);
	
	private int charges;
	private ServicePlan(int a) {
		charges=a;		
	}
	
	public int getCharage() {
		return charges;
	}
	
	@Override
	public String toString() {
		return name()+" ";
	}
	

}
