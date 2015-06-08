package com.web.service;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.web.dto.Demo;

public class SetData {

	public void set(String name, String dob, String salary) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Demo d = null;
		try {
			d = new Demo();
			d.setId("#2");
			d.setName(name);
			d.setDob(sdf.parse(dob));
			d.setSalary(Integer.parseInt(salary));
		} catch(Exception e) {
			e.printStackTrace();
		}
		SessionFactory sf = null;
		Session s = null;
		try {
			sf = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
			s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.save(d);
			tx.commit();
			s.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			sf.close();
		}
	}

}
