package com.odazie.cardchecker.cardchecker.data.repository;

import com.odazie.cardchecker.cardchecker.data.entity.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card,Long> {


}
