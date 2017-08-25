package guru.springframework.sprimg5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.sprimg5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
