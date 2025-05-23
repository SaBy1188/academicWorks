package de.awacademy.zwitscher.repository;

import de.awacademy.zwitscher.entity.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findAllByOrderByPostedAtDesc();
}
