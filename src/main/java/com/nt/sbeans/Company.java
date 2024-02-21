package com.nt.sbeans;

import lombok.Data;

@Data
public class Company {
private Integer id;
private String name;
private String addrs;
private String size;
private Integer pincode;
public Integer getId() {
	return id;
}
public String getName() {
	return name;
}
public String getAddrs() {
	return addrs;
}
public String getSize() {
	return size;
}
public void setId(Integer id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setAddrs(String addrs) {
	this.addrs = addrs;
}
public void setSize(String size) {
	this.size = size;
}
public Integer getPincode() {
	return pincode;
}
public void setPincode(Integer pincode) {
	this.pincode = pincode;
}
//toString()
@Override
public String toString() {
	return "Company [id=" + id + ", name=" + name + ", addrs=" + addrs + ", size=" + size + ", pincode=" + pincode
			+ "]";
}




}
