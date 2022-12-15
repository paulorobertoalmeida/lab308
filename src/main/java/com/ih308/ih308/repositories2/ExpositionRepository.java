package com.ih308.ih308.repositories2;

import com.ih308.ih308.models2.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpositionRepository extends JpaRepository<Exposition, Long> {
}