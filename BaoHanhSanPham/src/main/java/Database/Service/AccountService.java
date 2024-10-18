/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Service;

import Database.DAO.AccountDAO;
import Model.Account;
import com.datastax.oss.driver.api.core.CqlSession;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class AccountService {
    
    private final AccountDAO accountDAO;
    public AccountService(CqlSession session) {
        this.accountDAO = new AccountDAO(session);
    }
    
    public List<Account> getAll() {
        return accountDAO.getAllAccount();
    }
    public Account login(String username, String password) {
        return accountDAO.login(username, password);
    }
}
