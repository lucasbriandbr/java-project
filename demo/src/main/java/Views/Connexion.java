package Views;

//  Importer les librairies
import javax.swing.*;
import Functions.Encryption.encrypt;
import Views.Connexion;
import Views.Accueil;

//  Constructeur
public class Connexion {

    //  Définir le titre de la fenêtre
    JFrame frame = new JFrame("Connexion");
    JPanel connexionpanel = new JPanel();

    //  Définir les composants
    private JLabel labelLogin;
    private JLabel labelPassword;
    private JTextField textLogin;
    private JPasswordField textPassword;
    private JButton buttonConnexion;

    //  Créer une fenêtre de connexion
    public Connexion() {

        //  Définir le layout
        connexionpanel.setLayout(null);

        //  Définir les composants
        labelLogin = new JLabel("Prénom");
        labelPassword = new JLabel("Mot de passe");
        textLogin = new JTextField();
        textPassword = new JPasswordField();
        buttonConnexion = new JButton("Connexion");

        //  Définir les positions et les tailles des composants
        labelLogin.setBounds(50, 50, 100, 30);
        labelPassword.setBounds(50, 100, 100, 30);
        textLogin.setBounds(150, 50, 200, 30);
        textPassword.setBounds(150, 100, 200, 30);
        buttonConnexion.setBounds(150, 150, 200, 30);

        //  Ajouter les composants à la fenêtre
        connexionpanel.add(labelLogin);
        connexionpanel.add(labelPassword);
        connexionpanel.add(textLogin);
        connexionpanel.add(textPassword);
        connexionpanel.add(buttonConnexion);

        //  Définir l'action du bouton
        buttonConnexion.addActionListener(e -> {

            //  Récupérer les données
            String login = textLogin.getText();
            char[] password = textPassword.getPassword();

            //  Instancier la classe encrypt
            encrypt encrypt = new encrypt();

            //  Crypter le mot de passe et l'enregistrer dans une variable
            String passwordCrypt = encrypt.Encrypt(new String(password), "SHA-256");
            
            //  Requêter le mot de passe dans la base de données
            String passwordBDD = Functions.BDD.connexion.getPassword(passwordCrypt, login);

            //  Afficher le mot de passe crypté
            // System.out.println("Mot de passe crypté : "+passwordCrypt);

            //  Afficher le mot de passe de la base de données
            // System.out.println("Mot de passe de la base de données : "+passwordBDD);

            //  Vérifier les données
            if (passwordCrypt.equals(passwordBDD)) {
                
                //  Afficher un message de confirmation
                JOptionPane.showMessageDialog(null, "Connexion réussie");

                //  Rendre le panneau de connexion invisible
                connexionpanel.setVisible(false);

                //  Fermer la fenêtre
                close();

                //  Instancier la classe Accueil
                Views.Accueil accueil = new Views.Accueil();

            } else {

                //  Afficher un message d'erreur
                JOptionPane.showMessageDialog(null, "Connexion échouée");

            }

        });

        //  Ajouter un contenu à la fenêtre
        frame.setContentPane(connexionpanel);

        //  Définir l'action par défaut lors du clic sur la croix rouge
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Définir la taille de la fenêtre
        frame.setSize(400, 300);

        //centrer la fenêtre
        frame.setLocationRelativeTo(null);

        //rendre la fenêtre non redimensionnable
        frame.setResizable(false);

        //  Fermer la fenêtre
        frame.setVisible(true);

    }

    // Méthode qui permet de fermer la fenêtre
    public void close() {
        frame.dispose();
    }

}