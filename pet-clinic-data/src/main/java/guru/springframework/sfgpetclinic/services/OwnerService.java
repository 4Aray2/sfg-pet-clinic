package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findBuId();

    Owner saveOwner(Owner owner);

    Set<Owner> findAll();
}
