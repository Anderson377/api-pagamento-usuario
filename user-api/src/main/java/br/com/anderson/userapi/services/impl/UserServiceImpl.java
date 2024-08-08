package br.com.anderson.userapi.services.impl;

import br.com.anderson.userapi.domain.User;
import br.com.anderson.userapi.repositories.UserRepository;
import br.com.anderson.userapi.services.UserService;
import br.com.anderson.userapi.services.execptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }



}
