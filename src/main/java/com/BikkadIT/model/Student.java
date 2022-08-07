package com.BikkadIT.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
	private int sid;
	
	private String sname;
	
	private String semail;
	
	private int sage;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", sage=" + sage + "]";
	}
	
	
}
