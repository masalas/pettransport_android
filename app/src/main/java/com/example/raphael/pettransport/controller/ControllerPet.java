package com.example.raphael.pettransport.controller;

import java.util.List;

import com.example.raphael.pettransport.models.Pet;

public interface ControllerPet {
    void addPet(Pet pet);

    void deletePet(Pet pet);

    void atualizarPet(Pet pet);

    List<Pet> getPetsByRaio(int raio) throws Exception;

    List<Pet> getPets() throws Exception;

    List<Pet> getPetById(int id);
}
