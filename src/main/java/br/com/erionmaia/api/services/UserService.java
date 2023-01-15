package br.com.erionmaia.api.services;

import br.com.erionmaia.api.domain.User;

import java.util.List;

public interface UserService {

    User finById(Integer id);
    List<User> findAll();
}
