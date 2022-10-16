package com.eduar.misiontic.games2.repository.crudRepository;


import com.eduar.misiontic.games2.entities.Games;
import org.springframework.data.repository.CrudRepository;

public interface GameCrudRepository extends CrudRepository<Games, Integer> {
}
