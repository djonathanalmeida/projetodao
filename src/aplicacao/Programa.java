package aplicacao;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {

		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		Vendedor vendedor = vendedorDao.findById(3);

		System.out.println(vendedor);

	}

}
