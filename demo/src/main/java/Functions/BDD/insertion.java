package Functions.BDD;

//  Importer les librairies
import java.sql.*;

//  Constructeur
public class insertion {
    
    // Définir la méthode d'insertion d'un utilisateur
    public static String insertUser(String query) {
            
            //  Définir la variable de retour
            String retour = "";

            //  Essayer de se connecter à la base de données
            try {
                
                //étape 1: charger la classe de driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                //étape 2: créer l'objet de connexion
                Connection conn = DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7607209", "sql7607209", "2wFwEdmw8y");

                //étape 3: créer l'objet statement
                Statement stmt = conn.createStatement();
                // ResultSet req = stmt.executeQuery(query);
                
                //étape 4: exécuter la requête
                stmt.executeUpdate(query);

                //étape 5: fermez l'objet de connexion
                conn.close();

            //  Si une erreur survient
            } catch(Exception e){

                //  Afficher l'erreur
                System.out.println(e);

            }

            //  Retourner la query
            return retour;

    }

}
