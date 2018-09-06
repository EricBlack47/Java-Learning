package chapter10.enumm;

public class SeasonTest {

	public static void main(String[] args) {

		SeasonEnum[] se = SeasonEnum.values();
		for (SeasonEnum s : se) {
			System.out.println(s.getSeasonName() + "," + s.getSeasonDescription());
		}
        System.out.println("-----------------------------------");
		SeasonEnum se1 = SeasonEnum.valueOf("SPRING");
		SeasonEnum se2 = SeasonEnum.valueOf("SUMMER");
		SeasonEnum se3 = SeasonEnum.valueOf("AUTUMN");
		SeasonEnum se4 = SeasonEnum.valueOf("WINTER");
		se1.show();
		se2.show();
		se3.show();
		se4.show();
        System.out.println("-----------------------------------");
		switch (se4) {
		case SPRING:se1.show();break;
		case SUMMER:se2.show();break;
		case AUTUMN:se3.show();break;
		case WINTER:se4.show();break;		
		}
		System.out.println("-----------------------------------");
		se1.rain();
		se1.sun();
		se2.rain();
		se2.sun();
		System.out.println("-----------------------------------");
		SeasonWeather sw=new SeasonWeather();
		sw.goodWeather(se1);
		sw.badWeather(se1);
		sw.goodWeather(se2);
		sw.badWeather(se2);
	}

}
