package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findBuId();

    Pet saveOwner(Pet pet);

    Set<Pet> findAll();
}
