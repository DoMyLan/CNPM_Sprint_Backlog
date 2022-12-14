package Dao;

import java.util.List;

import Models.TeachersModel;

public interface ITeachersDao {

	void insert(TeachersModel teachers);

	void edit(TeachersModel teachers);

	void delete(int id);


	TeachersModel getByUser(String user);

	TeachersModel get(int id);


	List<TeachersModel> getAll();

	TeachersModel findById(int id);

}
