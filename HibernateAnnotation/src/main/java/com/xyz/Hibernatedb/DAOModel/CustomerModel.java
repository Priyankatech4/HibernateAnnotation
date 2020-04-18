package com.xyz.Hibernatedb.DAOModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CustomerModel")
public class CustomerModel
{

	 @Id	
	  private int cid;
	  private String cname;
	 
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

}
