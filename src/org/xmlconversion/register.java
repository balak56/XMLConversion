package org.xmlconversion;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class register {

	private List<emp> emp;

	public List<emp> getEmp() {
		return emp;
	}

	public void setEmp(List<emp> emp) {
		this.emp = emp;
	}
	
	
}
