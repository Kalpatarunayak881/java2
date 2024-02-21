package com.nt.sbeans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("impl")
@Data
@ConfigurationProperties(prefix="org.nit")
public class Employee {
	//simple properties
	private Integer eno;
	private String ename;
	//array type
	private String[] favColors;
	//Collection type
	private List<String>nickNames;
	private Set<String>phoneNumbers;
	private Map<String,Object>idDetails;
	//HAS-A properties
	private Company company;
	
	//Getters && Setters
	public Integer getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public String[] getFavColors() {
		return favColors;
	}
	public List<String> getNickNames() {
		return nickNames;
	}
	public Set<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public Map<String, Object> getIdDetails() {
		return idDetails;
	}
	public Company getCompany() {
		return company;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setFavColors(String[] favColors) {
		this.favColors = favColors;
	}
	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}
	public void setPhoneNumbers(Set<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", favColors=" + Arrays.toString(favColors)
				+ ", nickNames=" + nickNames + ", phoneNumbers=" + phoneNumbers +", idDetails=" + idDetails
				+ ", company=" + company + "]";
	}
}
