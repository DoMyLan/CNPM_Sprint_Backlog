package Dao;

import java.util.List;

import Models.TeachersModel;

public interface ITeachersDao {

	void insert(TeachersModel teachers);

	void edit(TeachersModel teachers);

	void delete(int id);

	TeachersModel get(String user);

	List<TeachersModel> getAll();

	TeachersModel findById(int id);

}
