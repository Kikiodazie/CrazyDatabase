package com.odazie.cardchecker.cardchecker.data.repository;

import com.odazie.cardchecker.cardchecker.data.entity.CardOwner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardOwnerRepository extends CrudRepository<CardOwner,Long> {

}
