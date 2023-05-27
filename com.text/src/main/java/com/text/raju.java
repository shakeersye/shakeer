package com.text;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class raju {
public static void main(String[] args) {
	Resource rs = new ClassPathResource("sana.xml");
	 BeanFactory bn =new XmlBeanFactory(rs);
	 student c =(student)bn.getBean("cst1");
	 c.disp();
}

}
	
	



	
	


	
	


	
	


