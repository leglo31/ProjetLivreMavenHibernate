package gaelo.repositories.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gaelo.livres.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
