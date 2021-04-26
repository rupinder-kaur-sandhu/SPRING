package com.uttara.test;

import java.io.Serializable;

//an ordinary java POJO
//public no arg constructor
//belong t package
//instance variables equal to input variables with same identifiers
//setter/getter for instance variable
//override equals,hashcode and tostring
//mark the class as Serializable


public class RegBean implements Serializable{
	
	String uname,email,pass,rpass;
	
	public RegBean() {
		System.out.println("in RegBean constructor");
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRpass() {
		return rpass;
	}

	public void setRpass(String rpass) {
		this.rpass = rpass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + ((rpass == null) ? 0 : rpass.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegBean other = (RegBean) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (rpass == null) {
			if (other.rpass != null)
				return false;
		} else if (!rpass.equals(other.rpass))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegBean [uname=" + uname + ", email=" + email + ", pass=" + pass + ", rpass=" + rpass + "]";
	}
	
	public String validate() {
		StringBuilder sb = new StringBuilder();
		
		if(uname==null || uname.trim().equals(""))
			sb.append("ur name is mandatory");
		if(email==null || email.trim().equals(""))
			sb.append("ur email is mandatory");
		if(pass==null || pass.trim().equals(""))
			sb.append("ur password is mandatory");
		else
			if(!pass.equals(rpass))
			sb.append("pass and rpass shoud be same");
		
		String msg = sb.toString();
		if(msg.equals(""))
			return "SUCCESS";
		else 
			return msg;
	}
}
