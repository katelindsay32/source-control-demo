package com;

public class Application {
	public static void main(String[] args) {
		System.out.println("Source control demo, hello!");
		feature1();
		feature2();
	}

	private static void feature2() {
		System.out.println("feature2 is atually better!");
		feature1();
	}

	private static void feature1() {
		System.out.println("feature1 is the best feature!");
	}
}
