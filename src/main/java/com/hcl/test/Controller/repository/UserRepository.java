package com.hcl.test.Controller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.test.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByName(String userName);

	@Query(value="from User where city= :city")
	List<User> findByCity(@Param("city") String city);

}
