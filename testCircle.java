package com.atguigu.java;
/*
 * 1、将对象作为参数传递给方法。
题目要求：
（1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
（2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
		public void printAreas(Cirlce c, int time)
在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示。
 */
public class testCircle {
	public static void main(String[] args) {
		Circle c = new Circle();
		PassObject p = new PassObject();
		c.radius = 2.0;
		c.findArea();
		c.radius = 4.5;
		c.findArea();
		p.printAreas(c, 5);
	}
}
class Circle{
	double radius = 1.0;
	public void findArea() {
		double S;
		S = radius * radius * 3.14;
		System.out.println(S);
	}
}
class PassObject{
	public void printAreas(Circle c, int time) {
		System.out.println("R\tS");
		for(int i = 1;i <= time;i++) {
			System.out.println(i + "\t" +  i * i *3.14);
		}
	}
}