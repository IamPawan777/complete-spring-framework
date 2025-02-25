package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
	
	private List<String> friend;
	
	private Map<String, Integer> fees;
	
	private Properties pro;

	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [friend=" + friend + ", \n fees=" + fees + ",\n pro=" + pro + "]";
	}	
	
}
