package com.eduar.misiontic.games2.repository;

import com.eduar.misiontic.games2.entities.Client;
import com.eduar.misiontic.games2.entities.Games;
import com.eduar.misiontic.games2.repository.crudRepository.ClientCrudRepository;
import com.eduar.misiontic.games2.repository.crudRepository.GameCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class GameRepository {

    @Autowired
    private GameCrudRepository gameCrudRepository;

    public Optional<Games> getGames(int id){
        return gameCrudRepository.findById(id);
    }

    public Games save(Games games){
        return gameCrudRepository.save(games);
    }

    public void delete(Games games){
        gameCrudRepository.delete(games);
    }

    public List<Games> getAll(){
        return (List<Games>) gameCrudRepository.findAll();
    }
}
