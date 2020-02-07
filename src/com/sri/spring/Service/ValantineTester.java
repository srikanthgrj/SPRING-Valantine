package com.sri.spring.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.spring.DAO.ValantineDAO;
import com.sri.spring.DAO.ValentineDAOIMPL;
import com.sri.spring.entity.ValantineEntity;

public class ValantineTester {
public static void main(String[] args) {
	ApplicationContext con = new ClassPathXmlApplicationContext("context.xml");
	ValintineService reffofval=con.getBean(ValintineService.class);
	ValantineEntity valent = new ValantineEntity("rak", "bro zone", 840, "blood letter");
	ValantineDAO dao1= new ValentineDAOIMPL();
	//dao1.save(valent);
	reffofval.validateandsave(valent);
}
}
