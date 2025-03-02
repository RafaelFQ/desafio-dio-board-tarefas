package com.dio.service;

import com.dio.persistence.dao.BoardColumnDAO;
import com.dio.persistence.entity.BoardColumnEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class BoardColumnQueryService {

    private Connection connection;

    public BoardColumnQueryService(Connection connection2) {
	}

	public Optional<BoardColumnEntity> findById(final Long id) throws SQLException {
        var dao = new BoardColumnDAO();
        return dao.findById(id);
    }

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
