package ua.training.repos;

import org.springframework.data.repository.CrudRepository;
import ua.training.entities.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
