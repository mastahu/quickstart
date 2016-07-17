package it.morfoza.quickstart.library.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("jpaBookDao")
public interface BookDao extends CrudRepository<Book, Long> {
}
