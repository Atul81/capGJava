package old.utils;

public class Details {
	private Integer age;
	private String name;
	private String company;
	private Integer ctc;
	public String cunt;
	public synchronized Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Integer getCtc() {
		return ctc;
	}
	public void setCtc(Integer ctc) {
		this.ctc = ctc;
	}
	
	@Override
	public String toString() {
		return "Age" + this.getAge() + "Company" + this.getCompany() + "Name" + this.getName() + "CTC" + this.getCtc() + "Are you a cunt" + cunt;
	}
}
