package com.tns.daythree;

public class Student {
	String name;
	int regno;
	String dep;
	int age;
	String per;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}
	public String toString() {
		return "Student [name=" + name + ", regno=" + regno + ", dep=" + dep
				+ ", age=" + age + ", per=" + per + "]";
	}
	
}


