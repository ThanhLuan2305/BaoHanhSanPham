/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.DAO;

import Model.Account;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.BoundStatement;
import com.datastax.oss.driver.api.core.cql.PreparedStatement;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class AccountDAO {
    private final CqlSession session;

    public AccountDAO(CqlSession session) {
        this.session = session;
    }
    
    public List<Account> getAllAccount() {
        String query = "SELECT * FROM account";
        List<Account> accounts = new ArrayList<>();
        ResultSet resultSet = session.execute(query);
        for (Row row : resultSet) {
            accounts.add(new Account(
                 row.getString("username"),
                 row.getString("password")
            ));
        }
        return accounts;
    }
    public Account login(String username, String password) {
        String query = "select * from account where username = ? and PASSWORD =? ALLOW FILTERING";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
                username,
                password
        );
        ResultSet resultSet = session.execute(boundStatement);
        Row row = resultSet.one();
        if (row != null) {
            return new Account(
                row.getString("username"),
                row.getString("password")     
            );
        }
        return null; 
    }
}
