package com.esprit.firstspringbootproject.repository;

import com.esprit.firstspringbootproject.entities.Bloc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IBlocRepository extends JpaRepository<Bloc,Long> {

}
