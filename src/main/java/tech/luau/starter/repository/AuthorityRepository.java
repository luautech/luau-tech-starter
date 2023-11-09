package tech.luau.starter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.luau.starter.domain.Authority;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {}
