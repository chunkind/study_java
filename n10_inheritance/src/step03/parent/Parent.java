package step03.parent;

public class Parent {
	public String publicTest = "publicTest";
	protected String protectedTest = "protectedTest";
	String defaultTest = "defaultTest";
	private String privateTest = "privateTest";

	public Parent() {
		//첫라인에 당연히 Object의 super()가 숨어있다!!!
		System.out.println("Parent Construct!");
	}

	public void access() {
		System.out.println("Access Modifier Test....");
	}
}
