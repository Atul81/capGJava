package old.utils;

public class Employee implements Comparable<Employee> {

	private Integer empId;

	private String empName;

	private Long empSalary;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Long empSalary) {
		this.empSalary = empSalary;
	}

	public Employee() {

	}

	/**
	 * @param empId
	 * @param empName
	 * @param empSalary
	 */
	public Employee(Integer empId, String empName, Long empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empName.compareTo(o.empName);
	}
}
