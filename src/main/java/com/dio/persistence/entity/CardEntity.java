package com.dio.persistence.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class CardEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BoardColumnEntity getBoardColumn() {
		return boardColumn;
	}
	public void setBoardColumn(BoardColumnEntity boardColumn) {
		this.boardColumn = boardColumn;
	}
	
    
}
