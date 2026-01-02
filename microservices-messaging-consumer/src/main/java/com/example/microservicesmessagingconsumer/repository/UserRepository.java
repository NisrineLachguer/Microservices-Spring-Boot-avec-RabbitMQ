package com.example.microservicesmessagingconsumer.repository;


import com.example.microservicesmessagingconsumer.domaine.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}