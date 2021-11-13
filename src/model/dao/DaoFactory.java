package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	/*Classe Fabrica responsável 
	 * por instanciar os Daos.
	 *Também é uma forma de realizar uma injeção de dependencia  
	 * sem explicitar a  implementação	
	*/
	
	public static SellerDao  createSellerDao() {
		return new SellerDaoJDBC();
	}
}
