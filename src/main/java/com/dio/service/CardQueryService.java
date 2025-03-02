package com.dio.service;

import com.dio.dto.CardDetailsDTO;
import com.dio.persistence.dao.CardDAO;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class CardQueryService {

    private Connection connection;

    public CardQueryService(Connection connection2) {
	}

	public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }

}
