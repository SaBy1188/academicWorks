package de.awacademy.zwitscher.repository;

import de.awacademy.zwitscher.entity.Session;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.Optional;

@Repository
public interface SessionRepository extends CrudRepository<Session, String> {

    Optional<Session> findByIdAndExpiresAtAfter(String id, Instant expiresAt);

}
