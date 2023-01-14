package br.com.erionmaia.api.services.impl;

import br.com.erionmaia.api.domain.User;
import br.com.erionmaia.api.repositories.UserRepository;
import br.com.erionmaia.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User finById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
