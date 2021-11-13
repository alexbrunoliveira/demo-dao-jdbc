package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	/*Classe Fabrica respons�vel 
	 * por instanciar os Daos.
	 *Tamb�m � uma forma de realizar uma inje��o de dependencia  
	 * sem explicitar a  implementa��o	
	*/
	
	public static SellerDao  createSellerDao() {
		return new SellerDaoJDBC();
	}
}
