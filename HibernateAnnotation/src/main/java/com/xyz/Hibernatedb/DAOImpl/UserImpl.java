package com.xyz.Hibernatedb.DAOImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xyz.Hibernatedb.DbConfig;

import com.xyz.Hibernatedb.DAOModel.UserModel;

public class UserImpl
{
	private Transaction trans;
	private Session sess;
	private boolean b=true;
	public void addUser(UserModel u)
	{
	try
	{
		DbConfig db=new DbConfig();
		sess=db.getSess();
		trans=sess.beginTransaction();
		sess.save(u);//save is an Pre-define method
		trans.commit();
	}
	catch(Exception t)
	{
		System.out.println(t);
	}

}
}
