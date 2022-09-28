package com.derin.backendpracticeone.repository;

import com.derin.backendpracticeone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{
}
