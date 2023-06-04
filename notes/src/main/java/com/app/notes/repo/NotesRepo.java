package com.app.notes.repo;

import com.app.notes.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepo extends JpaRepository<Notes, Integer> {
}
