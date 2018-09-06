package chapter10.enumm;

public enum SeasonEnum implements SeasonInterface{
	@MyAnn 
	SPRING("����","��ɫ"),
	SUMMER("����","��ɫ"),
	AUTUMN("����","��ɫ"),
	WINTER("����","��ɫ");
	
	private final String SeasonName;
	private final String SeasonDescription;
	@MyAnn
	private SeasonEnum(String SeasonName,String SeasonDescription) {
		this.SeasonName=SeasonName;
		this.SeasonDescription=SeasonDescription;
	}

	public String getSeasonName() {
		return SeasonName;
	}

	public String getSeasonDescription() {
		return SeasonDescription;
	}
	
	public void show() {
		System.out.println("Season is :"+SeasonName+","+SeasonDescription);
	}

	@Override
	public void rain() {
		System.out.println("Weather:"+SeasonName+"Rainy");
		
	}

	@Override
	public void sun() {
		System.out.println("Weather:"+SeasonName+"Sunny");
	}

}
