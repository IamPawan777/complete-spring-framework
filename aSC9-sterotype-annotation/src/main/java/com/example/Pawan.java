package com.example;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("pa")
@Scope("prototype")
public class Pawan {
	@Value("177")
	private int id;
	@Value("Harry Scott")
	private String name;
	
	@Value("#{cor}")
	private Set<String> course;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<String> getCourse() {
		return course;
	}
	public void setCourse(Set<String> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Pawan [id=" + id + ", name=" + name + "]";
	}
	
}
