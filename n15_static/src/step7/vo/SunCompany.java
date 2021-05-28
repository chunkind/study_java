package step7.vo;

public class SunCompany {
	private String companyName;
	static private SunCompany company = new SunCompany();
	private SunCompany(){
		companyName = "Sun MicroSystem";
		System.out.println("Company Name : " +companyName);
		
	}
	public static SunCompany getCompany(){
		 return company;
	}
}