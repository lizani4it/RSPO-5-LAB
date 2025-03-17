package com.example.petstore.repository;

import com.example.petstore.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetRepositoryInterface extends CrudRepository<Pet, Long> {
    Pet findById(long id);

    List<Pet> findAll();

    void deleteById(long id);
}