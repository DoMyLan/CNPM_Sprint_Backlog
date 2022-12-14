package Dao;

import java.util.List;

import Models.TopicModel;

public interface ITopicDao {

	void insert(TopicModel topic);

	void edit(TopicModel topic);

	void delete(int id);

	TopicModel get(int id);

	List<TopicModel> getAll();

	TopicModel findById(int id);

	List<TopicModel> getAllByTeacher(int teacherId);


	TopicModel getById(int id);

	List<TopicModel> findTopicByEmail(String email);


}
