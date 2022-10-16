package com.eduar.misiontic.games2.service;


import com.eduar.misiontic.games2.entities.Games;
import com.eduar.misiontic.games2.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    public GameRepository gameRepository;

    public List<Games> getAll(){
        return gameRepository.getAll();
    }
    public Optional<Games> getGames(int id){
        return gameRepository.getGames(id);
    }
    public Games save(Games p){
        if(p.getId()==null){
            return gameRepository.save(p);
        }else{
            Optional<Games> e=gameRepository.getGames(p.getId());
            if(e.isPresent()){
                return p;
            }else{
                return gameRepository.save(p);
            }
        }
    }
    public Games update(Games p) {
        if (p.getId() != null) {
            Optional<Games> q = gameRepository.getGames(p.getId());
            if (q.isPresent()) {
                if (p.getName() != null) {
                    q.get().setName(p.getName());
                }
                if (p.getDeveloper() != null) {
                    q.get().setDeveloper(p.getDeveloper());
                }
                if (p.getYear() != null) {
                    q.get().setYear(p.getYear());
                }
                if (p.getDescription() != null) {
                    q.get().setDescription(p.getDescription());
                }
                if (p.getCategory() != null) {
                    q.get().setCategory(p.getCategory());
                }
                if (p.getMessages() != null) {
                    q.get().setMessages(p.getMessages());
                }
                if (p.getReservations() != null) {
                    q.get().setReservations(p.getReservations());
                }

                gameRepository.save(q.get());
                return q.get();
            } else {
                return p;
            }
        }else{
            return p;
        }
    }

    public boolean delete(int id){
        boolean flag=false;
        Optional<Games>p=gameRepository.getGames(id);
        if(p.isPresent()){
            gameRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }
}
