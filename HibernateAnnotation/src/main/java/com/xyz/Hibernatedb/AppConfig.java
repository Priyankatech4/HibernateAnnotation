package com.xyz.Hibernatedb;
import com.xyz.Hibernatedb.DAOImpl.CustomerImpl;
import com.xyz.Hibernatedb.DAOImpl.ProductImpl;
import com.xyz.Hibernatedb.DAOImpl.UserImpl;
import com.xyz.Hibernatedb.DAOModel.CustomerModel;
import com.xyz.Hibernatedb.DAOModel.ProductModel;
import com.xyz.Hibernatedb.DAOModel.UserModel;

	public class AppConfig {

		public static void main(String[] args) {
			
			ProductModel p=new ProductModel();
			p.setPid(1001);
			p.setPname("apple");
			p.setPprice(100);
			
			ProductImpl pm=new ProductImpl();
			pm.addProduct(p);
			
			System.out.println("InsertedSucess");
			

			CustomerModel c=new CustomerModel();
			c.setCid(1001);
			c.setCname("apple");
			
			CustomerImpl cm=new CustomerImpl();
			cm.addCustomer(c);
			
			System.out.println("InsertedSucess");
			
		
			UserModel u=new UserModel();
			u.setUserid(1001);
			u.setUsername("Priya");
			
			
			UserImpl um=new UserImpl();
			um.addUser(u);
			
			System.out.println("InsertedSucess");
			
			
			
		}


	
}
