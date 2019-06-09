/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Robin
 */
class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

        public Employee(){
            this.firstName="";
            this.lastName="";
            this.socialSecurityNumber="";
        }
	public Employee(String f, String l, String ssn){
		this.firstName = f;
		this.lastName = l;
		this.socialSecurityNumber = ssn;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getSocialSecurityNumber(){
		return this.socialSecurityNumber;
	}
	
	public String toString(){
		return String.format("%s: %s %s %n %s: %s",
			"employee", getFirstName(), getLastName(),
			"social security number", getSocialSecurityNumber());
	}
}

    
