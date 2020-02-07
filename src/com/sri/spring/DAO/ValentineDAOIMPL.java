package com.sri.spring.DAO;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.sri.spring.entity.ValantineEntity;
@Component
public class ValentineDAOIMPL implements ValantineDAO{
	public ValentineDAOIMPL() {
		System.out.println("created daoimpl");
	}
/*private SessionFactory Factory;
	
	public void setFactory(SessionFactory factory) {
		Factory = factory;
		System.out.println("invoked session factory "+factory);
		}*/

	@Override
	public Integer save(ValantineEntity dto) {
		System.out.println("entered save");

		try {
			//Session session = Factory.openSession();
				System.out.println("dao implement start");
				System.out.println(dto);
				Configuration cfg = new Configuration();
				cfg.configure();
				cfg.addAnnotatedClass(ValantineEntity.class);
				SessionFactory fsc = cfg.buildSessionFactory();
				Session session = fsc.openSession();
				session.beginTransaction();
				System.out.println("tx begin");
				System.out.println("data saving");
				if(Objects.nonNull(dto)) {
				session.save(dto);}
				else {
					System.out.println("cannot save");
				}
				
				session.getTransaction().commit();
				System.out.println("commited");
				
			System.out.println("all resource closed");
			}catch(Exception e ) {
				e.printStackTrace();
			}
		return null;
			
		
	}

}
