package step05;

import java.util.Enumeration;
import java.util.Properties;

public class TestApp {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		Enumeration e = p.propertyNames();
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String value = p.getProperty(name);

			System.out.println(name + "======================" + value);
		}
	}
}
