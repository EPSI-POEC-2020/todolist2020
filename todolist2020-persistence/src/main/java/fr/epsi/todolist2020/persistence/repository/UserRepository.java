package fr.epsi.todolist2020.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.epsi.todolist2020.persistence.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
