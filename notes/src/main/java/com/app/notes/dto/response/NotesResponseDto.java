package com.app.notes.dto.response;

import com.app.notes.entity.Notes;
import lombok.*;

import javax.persistence.criteria.CriteriaBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class NotesResponseDto {
    private Integer id;
    private String title;
    private String author;
    private String noteText;

    public NotesResponseDto(Notes added){
        this.id = added.getId();
        this.title = added.getTitle();
        this.author = added.getAuthor();
        this.noteText = added.getNoteText();
    }

}
