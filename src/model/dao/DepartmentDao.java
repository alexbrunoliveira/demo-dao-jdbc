package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	/* Model compreende as entidades e as classes
	 * que fazem transforma��es nas entidades 
	 */
	void insert(Department obj);
	/* Opera��o respons�vel por inserir este 
	 * objeto no banco de Dados 
	 */
	void update(Department obj);
	void deleteById(Integer id);
	Department  findById(Integer id);
	
	List<Department> findAll();
}
