package peixun;

import lombok.Getter;

@Getter
public class Student {
	String name;
	int age;
	int classNo;
	String hobby;
	public void show() {
		System.out.println("姓名:" + name + "\n 年龄:" + age + "\n 班级编号:" + classNo + "\n 爱好:" + hobby);
	}
}
