package org.sandbox.dao;

import org.sandbox.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ClientDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Client> getAllClients() {
        String sql = "SELECT * FROM Client";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Client>(Client.class));
    }

    public int insertClient(Client client) {
        String sql = "INSERT INTO Client (client_id, client_name, onboarding_date) " +
                "VALUES(?, ?, ?)";
        return jdbcTemplate.update(sql, new Object[]
                {client.getClientId(), client.getClientName(), client.getOnboardingDate()});
    }

    private static final class ClientMapper implements RowMapper<Client> {

        @Override
        public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
            Client client = new Client();
            client.setClientId(rs.getInt("client_id"));
            client.setClientName(rs.getString("client_name"));
            client.setOnboardingDate(rs.getDate("onboarding_date"));
            return client;
        }
    }
}
