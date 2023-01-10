package classMethod;

import classMethod.human.Car;

public class Chapter09 {
	public static void main(String[] args) {
		Car drive = new Car();
		System.out.println(drive.dis + "km走ります");
		System.out.println("残量は" + drive.remain + "です");
	}
}
