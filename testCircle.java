package com.atguigu.java;
/*
 * 1����������Ϊ�������ݸ�������
��ĿҪ��
��1������һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��һ��findArea()��������Բ�������
��2������һ����PassObject�������ж���һ������printAreas()���÷����Ķ������£�
		public void printAreas(Cirlce c, int time)
��printAreas�����д�ӡ���1��time֮���ÿ�������뾶ֵ���Լ���Ӧ����������磬timesΪ5��������뾶1��2��3��4��5���Լ���Ӧ��Բ�����
��main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ���������н����ͼ��ʾ��
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