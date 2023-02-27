package com.softserve.edu04set;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	public static class ByNameAndId implements Comparator<Employee> {
        @Override
        public int compare(Employee em1, Employee em2) {
        	if ((em1 == null) && (em2 == null)) {
        		return 0;
        	} else if (em1 == null) {
        		return -1;
        	} else if (em2 == null) {
        		return 1;
        	}
        	int byName = em1.getName().compareTo(em2.getName());
            return byName == 0 ? em1.getId() - em2.getId() : byName;
        }
    }

	//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	private int id;
	private String name;

	public Employee() {
		this.id = 0;
		this.name = "";
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		System.out.println("\thashCode() running");
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("\t\tequals() running");
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		//
//		if (hashCode() != obj.hashCode()) {
//			return false;
//		}
		//
		Employee other = null;
		if (obj instanceof Employee) {
			other = (Employee) obj;
		}
		if ((other == null) || (id != other.id)
				|| ((name == null) && (other.name != null))
				|| ((name != null) && (other.name == null))) {
			return false;
		}
		if ((name == null) && (other.name == null)) {
			return true;
		}
		return name.equals(other.name);
	}

	@Override
	public String toString() {
		return "\nEmployee [ id=" + id 
				+ ", name=" + name 
				+ " ]";
	}

	@Override
	public int compareTo(Employee employee) {
		//return name.compareTo(employee.getName());
		return id - employee.getId();
		// return 1;
	}
}
