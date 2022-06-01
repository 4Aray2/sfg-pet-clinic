package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findBuId();

    Vet saveOwner(Vet vet);

    Set<Vet> findAll();
}
