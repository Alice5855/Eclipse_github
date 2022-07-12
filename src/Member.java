

public class Member {
	private String name;
	private int Age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Member(String name, int age) {
		
		this.name = name;
		Age = age;
	}
}
