package fr.epsi.todolist2020.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import fr.epsi.todolist2020.persistence.entity.Todolist;
import fr.epsi.todolist2020.persistence.entity.User;
import fr.epsi.todolist2020.persistence.repository.UserRepository;
import fr.epsi.todolist2020.service.UserService;
import fr.epsi.todolist2020.service.bo.UserBO;
import fr.epsi.todolist2020.service.util.DozerUtils;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private Mapper mapper;

	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public List<UserBO> listUsersWithEmptyTodolists() {
		// Liste des utilisateurs avec todolist vide à remplir
		List<User> usersWithEmptyTodolist = new ArrayList<User>();
		// liste de tous les utilisateurs en BDD
		List<User> users = userRepository.findAll();
		for(User user:users) {
			for(Todolist todolist:user.getTodolists()) {
				if(CollectionUtils.isEmpty(todolist.getTasks())) {
					usersWithEmptyTodolist.add(user);
				}
			}
		}
		return DozerUtils.map(mapper,usersWithEmptyTodolist, UserBO.class);
	}

	public List<UserBO> list() {
		return DozerUtils.map(mapper, userRepository.findAll(), UserBO.class);
	}

}
