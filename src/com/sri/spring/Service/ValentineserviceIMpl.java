package com.sri.spring.Service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sri.spring.DAO.ValantineDAO;
import com.sri.spring.entity.ValantineEntity;

@Component
public class ValentineserviceIMpl implements ValintineService{
	@Autowired
	private ValantineDAO dao;
	
	public ValentineserviceIMpl() {
		System.out.println("created  "+this.getClass().getSimpleName());
	}



	@Override
	public boolean validateandsave(ValantineEntity ent) {
		System.out.println("invoked validate & save  "+ent);
		
		 Integer id=dao.save(ent);
		 if(Objects.nonNull(id)) {
			 System.out.println("its true saving");
			 return true;
		 }
		 System.out.println("its false cannot save");
		return false;
	}

}
