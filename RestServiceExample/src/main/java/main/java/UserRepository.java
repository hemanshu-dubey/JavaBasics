package main.java;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import main.java.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
	UserEntity findUserByEmail(String email);

}
