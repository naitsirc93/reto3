package com.eduar.misiontic.games2.repository.crudRepository;



import com.eduar.misiontic.games2.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
