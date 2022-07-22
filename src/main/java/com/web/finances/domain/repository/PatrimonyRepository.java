package com.web.finances.domain.repository;

import com.web.finances.domain.model.Patrimony;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatrimonyRepository extends JpaRepository<Patrimony, Long> {
}
