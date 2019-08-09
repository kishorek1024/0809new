package packone;

public class CallMethods {

	public static void main(String[] args) {
		
		Methods m=new Methods();
		m.launchApp("http://facebook.com");
		m.numberofElements("a", 50);
		m.numberofElements("select", 3);
		m.elementPresent("email", true);
		m.elementPresent("pass", false);
		m.elementPresent("day", true);
		m.elementPresent("year", false);
		m.closeApp();
		m.launchApp("http://rediff.com");
		m.closeApp();

	}

}
