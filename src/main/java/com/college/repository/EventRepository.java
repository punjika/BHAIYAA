package com.college.repository;

import com.college.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByCategory_CategoryId(Long categoryId);
}