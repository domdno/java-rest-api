package com.rest.crud_api.repo;

import com.rest.crud_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
