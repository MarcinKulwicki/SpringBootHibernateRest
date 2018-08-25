package com.marcinkulwicki.testSpringBoot.repository;


import com.marcinkulwicki.testSpringBoot.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
