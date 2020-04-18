package com.xyz.Hibernatedb.DAOImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xyz.Hibernatedb.DbConfig;

import com.xyz.Hibernatedb.DAOModel.CustomerModel;

public class CustomerImpl 
{
	private Transaction trans;
	private Session sess;
	private boolean b=true;
	public void addCustomer(CustomerModel c)
	{
		try
		{
			DbConfig db=new DbConfig();
			sess=db.getSess();
			trans=sess.beginTransaction();
			sess.save(c);//save is an Pre-define method
			trans.commit();
		}
		catch(Exception t)
		{
			System.out.println(t);
		}
	}
	

}
