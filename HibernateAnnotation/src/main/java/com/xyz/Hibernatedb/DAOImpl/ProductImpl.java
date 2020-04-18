package com.xyz.Hibernatedb.DAOImpl;


	import com.xyz.Hibernatedb.DAO.ProductDAO;
	import org.hibernate.Session;
	import org.hibernate.Transaction;
	import com.xyz.Hibernatedb.DbConfig;
	import com.xyz.Hibernatedb.DAOModel.ProductModel;
	public class ProductImpl implements ProductDAO
	{
		private Transaction trans;
		private Session sess;
		private boolean b=true;
		public void addProduct(ProductModel p) {
			try
			{
				DbConfig db=new DbConfig();
				sess=db.getSess();
				trans=sess.beginTransaction();
				sess.save(p);//save is an Pre-define method
				trans.commit();
			}
			catch(Exception t)
			{
				System.out.println(t);
			}
			
		}
		public boolean isB() {
			return b;
		}
		public void setB(boolean b) {
			this.b = b;
		}

	}
