package pl.mm.versioningDemo;

public class VersioningDemo {

	public static void main(String[] args) {
		System.out.println("Versioning demo");
		System.out.println(
				"This program is running version " + VersioningDemo.class.getPackage().getImplementationVersion());
	}

}
