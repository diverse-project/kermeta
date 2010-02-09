package main;

public class Applicant {
    private String name;
    public Applicant(String name, int age, boolean valid) {
		super();
		this.name = name;
		this.age = age;
		this.valid = valid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	private int age;
    private boolean valid;
    // getter and setter methods here
}