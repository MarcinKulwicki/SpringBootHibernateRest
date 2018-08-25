package com.marcinkulwicki.testSpringBoot.repository;

import com.marcinkulwicki.testSpringBoot.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
}
