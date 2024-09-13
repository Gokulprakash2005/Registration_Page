package com.Registration.Volunteer_form;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Apply {
	@Id
	private int idno;
	private String full_name;
	private String dob;
	private String gender;
	private long contact_number;
	private String email;
	private String address;
	private String skills;
	private String experience;
	private String  interest_areas; 
	private String tshirt_size;
	private boolean terms_conditions;
	private boolean background_check;
	
	
	
	public Apply(int idno, String full_name, String dob, String gender, long contact_number, String email,
			String address, String skills, String experience, String interest_areas, String tshirt_size,
			boolean terms_conditions, boolean background_check) {
		super();
		this.idno = idno;
		this.full_name = full_name;
		this.dob = dob;
		this.gender = gender;
		this.contact_number = contact_number;
		this.email = email;
		this.address = address;
		this.skills = skills;
		this.experience = experience;
		this.interest_areas = interest_areas;
		this.tshirt_size = tshirt_size;
		this.terms_conditions = terms_conditions;
		this.background_check = background_check;
	}
	
	
	
	public Apply() {
		super();
	}



	public int getIdno() {
		return idno;
	}
	
	public void setIdno(int idno) {
		this.idno = idno;
	}

	public String getFull_name() {
		return full_name;
	}
	
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public long getContact_number() {
		return contact_number;
	}
	
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getSkills() {
		return skills;
	}
	
	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getExperience() {
		return experience;
	}
	
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	public String getInterest_areas() {
		return interest_areas;
	}
	
	public void setInterest_areas(String interest_areas) {
		this.interest_areas = interest_areas;
	}
	
	public String getTshirt_size() {
		return tshirt_size;
	}
	
	public void setTshirt_size(String tshirt_size) {
		this.tshirt_size = tshirt_size;
	}
	
	public boolean isTerms_conditions() {
		return terms_conditions;
	}
	
	public void setTerms_conditions(boolean terms_conditions) {
		this.terms_conditions = terms_conditions;
	}

	public boolean isBackground_check() {
		return background_check;
	}
	
	public void setBackground_check(boolean background_check) {
		this.background_check = background_check;
	}
	
	@Override
	public String toString() {
		return "[idno=" + idno + ", full_name=" + full_name + ", dob=" + dob + ", gender=" + gender
				+ ", contact_number=" + contact_number + ", email=" + email + ", address=" + address + ", skills="
				+ skills + ", experience=" + experience + ", interest_areas=" + interest_areas + ", tshirt_size="
				+ tshirt_size + ", terms_conditions=" + terms_conditions + ", background_check=" + background_check
				+ "]";
	}
	
	
}
