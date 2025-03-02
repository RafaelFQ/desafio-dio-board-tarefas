package com.dio.service;

import com.dio.dto.BoardDetailsDTO;
import com.dio.persistence.dao.BoardColumnDAO;
import com.dio.persistence.dao.BoardDAO;
import com.dio.persistence.entity.BoardEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class BoardQueryService {

    private Connection connection;

    public BoardQueryService(Connection connection2) {
	}

	public Optional<BoardEntity> findById(final Long id) throws SQLException {
        var dao = new BoardDAO(connection);
        var boardColumnDAO = new BoardColumnDAO(connection);
        var optional = dao.findById(id);
        if (optional.isPresent()){
            var entity = optional.get();
            entity.setBoardColumns(boardColumnDAO.findByBoardId(entity.getId()));
            return Optional.of(entity);
        }
        return Optional.empty();
    }

    public Optional<BoardDetailsDTO> showBoardDetails(final Object object) throws SQLException {
        var dao = new BoardDAO(connection);
        var boardColumnDAO = new BoardColumnDAO(connection);
        var optional = dao.findById(object);
        if (optional.isPresent()){
            var entity = optional.get();
            var columns = boardColumnDAO.findByBoardIdWithDetails(entity.getId());
            var dto = new BoardDetailsDTO(entity.getId(), entity.getName(), columns);
            return Optional.of(dto);
        } else {
        	
        }
		return null;
        
    }

}
