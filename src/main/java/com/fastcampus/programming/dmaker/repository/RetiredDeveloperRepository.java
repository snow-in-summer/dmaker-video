package com.fastcampus.programming.dmaker.repository;

import com.fastcampus.programming.dmaker.entity.RetiredDeveloper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Snow
 */
@Repository
public interface RetiredDeveloperRepository
        extends JpaRepository<RetiredDeveloper, Long> {
}
