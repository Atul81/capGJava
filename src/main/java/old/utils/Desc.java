package old.utils;

public class Desc {
	private String name;
	private Integer Age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	
	@Override
	public String toString() {
		return "Name " + this.getName() + "Age " + this.getAge() + "Class " + this.getClass(); 
	}
}
