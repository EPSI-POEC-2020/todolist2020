package fr.epsi.todolist2020.api;

import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.epsi.todolist2020.api.vo.UserVO;
import fr.epsi.todolist2020.service.UserService;
import fr.epsi.todolist2020.service.util.DozerUtils;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private Mapper mapper;
	
	public List<UserVO> listUsers() {
		return DozerUtils.map(mapper, userService.list(), UserVO.class);
	}

}
