package org.xmlconversion;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Conversion {
	
public static void main(String[] args) {
	Map<Integer, Company> e=toConvertToJavaProject();
	Company c=e.get(979);
	System.out.println(c.getFname());
	System.out.println(c.getLname());
	System.out.println(c.getAddress());
	System.out.println(c.getEmail());
	System.out.println(c.getPassword());
	System.out.println(c.getConfirmPassword());
}
	public static Map<Integer, Company> toConvertToJavaProject() {
		
		Map<Integer, Company> emp=new HashMap<>();
		
		try {
			File xmlloc=new File("C:\\Users\\93ksr\\eclipse-workspace\\Bala\\XmlConversion\\src\\Registration.xml");
			
			JAXBContext contxt=JAXBContext.newInstance(register.class);
			Unmarshaller un = contxt.createUnmarshaller();
			Object obj=un.unmarshal(xmlloc);
			
			register r=(register) obj;
			List<emp> el=r.getEmp();
			for(emp x:el)
			{
				Company c=new Company();
				c.setFname(x.getFname());
				c.setLname(x.getLname());
				c.setAddress(x.getAddress());
				c.setEmail(x.getEmail());
				c.setPassword(x.getPassword());
				c.setConfirmPassword(x.getConfirmPassword());
				emp.put(x.getPhone(),c);
			}
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
		

	}
}
