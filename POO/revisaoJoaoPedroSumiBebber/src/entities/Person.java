package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private String name;
    private LocalDate birthday;
    private int age;
    private float height;
    
    public Person() {
    }
    
    public Person(String name, int age, float height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Person(String name, LocalDate birthday, float height) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.height = height;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public long calculateAge() {
        LocalDate today = LocalDate.now();
        return ChronoUnit.YEARS.between(birthday, today);
    }

    public void personData() {
        System.out.println("Data: ");
        System.out.printf("Age: %d%n", calculateAge());
        System.out.println("Height: " + this.height);
        System.out.println("Name: " + this.name);
    }
}