package aplicacao;

import java.util.Date;
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
		for (Vendedor obj : list) {
			System.out.println(obj);
		}

		System.out.println("===== TESTE 3: vendedor findAll =====");
		list = vendedorDao.findAll();
		for (Vendedor obj : list) {
			System.out.println(obj);
		}

		System.out.println("===== TESTE 4: vendedor insert =====");
		Vendedor novoVendedor = new Vendedor(null, "Greg", "greg@email.com", new Date(), 4000.0, departamento);
		vendedorDao.insert(novoVendedor);
		System.out.println("Inserido! Novo id= " + novoVendedor.getId());

		System.out.println("===== TESTE 5: vendedor update =====");
		vendedor = vendedorDao.findById(1);
		vendedor.setNome("Martha Waine");
		vendedorDao.update(vendedor);
		System.out.println("Update completado!");

	}

}
