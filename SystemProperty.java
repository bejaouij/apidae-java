public class SystemProperty {
	public static void main(String[] args) {
		System.out.println("Username: " + System.getProperty("user.name"));
		System.out.println("Current working directory: " + System.getProperty("user.dir"));
		System.out.println("JVM version: " + System.getProperty("java.vm.version"));
	}
}
