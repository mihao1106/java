package com.atguigu.java;
/*
 * (1)����Person��Ķ������øö����name��age��sex���ԣ�����study����������ַ�����studying����
 * ����showAge()������ʾageֵ������addAge()�����������age����ֵ����2�ꡣ
 * (2)�����ڶ�������ִ���������������ͬһ����Ĳ�ͬ����֮��Ĺ�ϵ��
 */
public class testPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.study();
		p.showAge();
		p.addAge(2);
		p.showAge();
	}
}
class Person{
	String name;
	int age;
	int sex;
	public void study() {
		System.out.println("studying");
	}
	public void showAge() {
		System.out.println(age);
	}
	public int addAge(int i) {
		age += i;
		return age;
	}
}