package ru.citlab.citlab24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.citlab.citlab24.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
