package com.jbruno.workshop_mongo.services;

import com.jbruno.workshop_mongo.DTO.UserDTO;
import com.jbruno.workshop_mongo.domain.User;
import com.jbruno.workshop_mongo.repository.UserRepository;
import com.jbruno.workshop_mongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public void delete (String id) {
        findById(id);
        repository.deleteById(id);
    }

    public User update(User obj) {
        User newUser = repository.findById(obj.getId())
                .orElseThrow(() -> new ObjectNotFoundException("ID não encontrado"));
        updateData(newUser, obj);
        return repository.save(newUser);
    }

    public void updateData(User newUser, User obj) {
        newUser.setName(obj.getName());
        newUser.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}
