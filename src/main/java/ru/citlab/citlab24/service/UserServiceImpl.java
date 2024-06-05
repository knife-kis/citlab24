package ru.citlab.citlab24.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import ru.citlab.citlab24.repository.UserRepository;
import ru.citlab.citlab24.repr.UserRepr;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Override
    public UserRepr findById(Long id) {
        return null;
    }
}