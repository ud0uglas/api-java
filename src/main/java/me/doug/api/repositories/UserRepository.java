package me.doug.api.repositories;

import org.springframework.data.repository.CrudRepository;

import me.doug.api.entites.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
