package com.dio.persistence.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import static com.dio.persistence.entity.BoardColumnKindEnum.CANCEL;
import static com.dio.persistence.entity.BoardColumnKindEnum.INITIAL;

@Data
public class BoardEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
    private String name;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<BoardColumnEntity> boardColumns = new ArrayList<>();

    public BoardColumnEntity getInitialColumn(){
        return getFilteredColumn(bc -> bc.getKind().equals(INITIAL));
    }

    public BoardColumnEntity getCancelColumn(){
        return getFilteredColumn(bc -> bc.getKind().equals(CANCEL));
    }

    private BoardColumnEntity getFilteredColumn(Predicate<BoardColumnEntity> filter){
        return boardColumns.stream()
                .filter(filter)
                .findFirst().orElseThrow();
    }

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BoardColumnEntity> getBoardColumns() {
		return boardColumns;
	}

	public void setBoardColumns(List<BoardColumnEntity> boardColumns) {
		this.boardColumns = boardColumns;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
