package umg.principal.baseDatos.Servicios;

import umg.principal.baseDatos.Model.Telebot;
import umg.principal.baseDatos.Dao.TelebotDAO;

import java.sql.SQLException;
import java.util.List;

public class TelebotService {

    private TelebotDAO telebotDAO;

    // Empty constructor initializing DAO
    public TelebotService() {
        this.telebotDAO = new TelebotDAO();
    }

    // Create a new user
    public void addUser(Telebot user) throws SQLException {
        telebotDAO.insertUser(user);
    }

    // Get a user by ID
    public Telebot getUserById(int id) throws SQLException {
        return telebotDAO.getUser(id);
    }

    // Update a user
    public void updateUser(Telebot user) throws SQLException {
        telebotDAO.updateUser(user);
    }

    // Delete a user
    public void deleteUser(int id) throws SQLException {
        telebotDAO.deleteUser(id);
    }

    // Get all users
    public List<Telebot> getAllUsers() throws SQLException {
        return telebotDAO.getAllUsers();
    }
}
