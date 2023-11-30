package com.desafioItau.DesafioItau.repository;

import com.desafioItau.DesafioItau.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
