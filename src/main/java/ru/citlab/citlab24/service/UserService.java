package ru.citlab.citlab24.service;

import org.springframework.stereotype.Service;
import ru.citlab.citlab24.model.User;
import ru.citlab.citlab24.repr.UserRepr;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    UserRepr findById(Long id);
}
