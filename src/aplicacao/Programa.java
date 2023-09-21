package aplicacao;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {

		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println("===== TESTE 1: vendedor findById =====");
		Vendedor vendedor = vendedorDao.findById(3);
		System.out.println(vendedor);
		
		System.out.println("===== TESTE 2: vendedor findByDepartment =====");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vendedorDao.findByDepartament(departamento);
		for(Vendedor obj : list) {
			System.out.println(obj);
		}

	}

}
