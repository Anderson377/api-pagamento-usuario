package br.com.anderson.userapi.services.impl;

import br.com.anderson.userapi.domain.User;
import br.com.anderson.userapi.repositories.UserRepository;
import br.com.anderson.userapi.services.UserService;
import br.com.anderson.userapi.services.execptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final Environment env;

    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }



}
