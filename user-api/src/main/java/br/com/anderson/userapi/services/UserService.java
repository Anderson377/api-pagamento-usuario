package br.com.anderson.userapi.services;

import br.com.anderson.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();

}
