package ru.citlab.citlab24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.citlab.citlab24.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
