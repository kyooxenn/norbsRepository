package sakilaproject.services;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import sakilaproject.dto.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Integer> {

}
