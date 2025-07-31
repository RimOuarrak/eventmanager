package com._7.eventmanager.repository;

// public class EventRepository {
    
// }

// package com.example.eventmanager.repository;

import com._7.eventmanager.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
