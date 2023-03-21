package Functions.BDD.get;

// Importer les librairies
import java.sql.*;

// Constructeur
public class getUsers {

    //  Définir la méthode de récupération des utilisateurs
    public static String getusers() {

        //  Définir la variable de retour
        String retour = "";

        //  Essayer de se connecter à la base de données
        try {
            
            //étape 1: charger la classe de driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //étape 2: créer l'objet de connexion
            Connection conn = DriverManager.getConnection("jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7607209", "sql7607209", "2wFwEdmw8y");

            
            //  Définir la requête
            String sql = "SELECT * FROM `Utilisateurs`";

            //  Exécuter la requête
            Statement stmt = conn.createStatement();

            //  Récupérer le résultat
            ResultSet rs = stmt.executeQuery(sql);

            //  Parcourir le résultat
            while(rs.next()){

                //  Récupérer le mot de passe
                retour = rs.getString("NOM");

            }

            //  Afficher le retour
            System.out.println(retour);

            //  Fermer le résultat
            rs.close();

            //  Fermer la requête
            stmt.close();

            //  Fermer la connexion
            conn.close();

        //  Si une erreur survient
        } catch(Exception e){

            //  Afficher l'erreur
            System.out.println("erreur : "+e);

        }

        //  Afficher la valeur de retour
        // System.out.println("retour : "+retour);

        //  Retourner le mot de passe
        return retour;

    }
    
}
