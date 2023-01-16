package br.com.erionmaia.api.services;

import br.com.erionmaia.api.domain.User;
import br.com.erionmaia.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User finById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
}
