package com.diosoft;

/**
 * Created by adler on 11.12.2014.
 */
public class PersonImpl implements Person {

    private final String company = "DioSoft";
    private String firstName;
    private String secondName;
    private int age;
    private JobTitle title;


    public PersonImpl(String firstName, String secondName, int age, JobTitle title) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.title = title;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTitle(JobTitle title) {
        this.title = title;
    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSecondName() {
        return secondName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public JobTitle getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonImpl person = (PersonImpl) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (secondName != null ? !secondName.equals(person.secondName) : person.secondName != null) return false;
        if (title != person.title) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonImpl{");
        sb.append("company='").append(company).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", title=").append(title);
        sb.append('}');
        return sb.toString();
    }
}
