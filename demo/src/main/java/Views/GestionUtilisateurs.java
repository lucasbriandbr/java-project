package Views;

//  Importer les librairies
import javax.swing.*;

public class GestionUtilisateurs {

    //  Définir le titre de la fenêtre
    JFrame frame = new JFrame("Gestion des utilisateurs");

    //  Définir les composants
    private JLabel labelGestionUtilisateurs;
    
    //  Créer une fenêtre de gestion des utilisateurs
    public GestionUtilisateurs() {

        //  Définir la taille de la fenêtre
        frame.setSize(500, 500);

        //  Définir la position de la fenêtre
        frame.setLocationRelativeTo(null);

        //  Définir l'action de la croix
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  Afficher la fenêtre
        frame.setVisible(true);

        //  Définir les composants
        labelGestionUtilisateurs = new JLabel("Gestion des utilisateurs");

        //  Définir les positions et les tailles des composants
        labelGestionUtilisateurs.setBounds(0, 0, 500, 30);

        //  Centrer les composants et gérer les tailles
        labelGestionUtilisateurs.setHorizontalAlignment(JLabel.CENTER);

        //  Ajouter les composants à la fenêtre
        frame.add(labelGestionUtilisateurs);

        //  Ajouter une barre de Menu
        JMenuBar menuBar = new JMenuBar();

        //  Ajouter un item au menu
        JMenuItem item = new JMenuItem("Retour à l'accueil");

        //  Ajouter l'action de l'item
        item.addActionListener(e -> {
            frame.dispose(); 
            new Accueil();
        });

        //  Ajouter le menu à la barre de menu
        menuBar.add(item);

        //  Ajouter la barre de menu à la fenêtre
        frame.setJMenuBar(menuBar);

    }
    
}
