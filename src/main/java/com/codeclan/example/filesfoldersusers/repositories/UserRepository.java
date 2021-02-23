package com.codeclan.example.filesfoldersusers.repositories;

import com.codeclan.example.filesfoldersusers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
