package com.example.demo.servicio;

import java.util.List;

public class Data {

	    private Integer age;
	    private String name;

	    public Data(final Integer age, final String name) {
	        super();
	        this.age = age;
	        this.name = name;
	    }

	    public Integer getAge() {
	        return age;
	    }

	    public void setAge(final Integer age) {
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(final String name) {
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return name;
	    }

	    public static void printPersons(final List<Data> personList) {
	        System.out.println(personList);
	    }

	   
	
}
