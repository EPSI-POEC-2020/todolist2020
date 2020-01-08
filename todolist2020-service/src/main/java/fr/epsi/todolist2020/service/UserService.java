package fr.epsi.todolist2020.service;

import java.util.List;

import fr.epsi.todolist2020.service.bo.UserBO;

public interface UserService {

	List<UserBO> listUsersWithEmptyTodolists();

	List<UserBO> list();

}
