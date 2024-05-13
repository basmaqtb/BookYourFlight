package dao;

import java.sql.SQLException;
import java.util.List;

import metier.User;

public interface UserDao {

    // Récupérer un utilisateur par son ID
    User getUserById(Integer id_user);
   
    
    // Ajouter un nouvel utilisateur
    void addUser(User user);
    
    // Mettre à jour les informations d'un utilisateur existant
    void updateUser(User user);
    
    // Supprimer un utilisateur de la base de données
    void deleteUser(Integer id_user);
    
    // Récupérer tous les utilisateurs
    List<User> getAllUsers() throws SQLException;
}
