package com.suraj.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.suraj.spring.model.MobileUser;

public class ClientTest {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		MobileUser mobileUser = factory.getBean("mobileUser", MobileUser.class);
		mobileUser.getCharger().getPlug();
		
	}

}
