package Views;

//  Importer les librairies
import javax.swing.*;
import Views.*;

// 
public class Accueil {

    //  Définir le titre de la fenêtre
    JFrame frame = new JFrame("Accueil");
    JPanel accueilpanel = new JPanel();

    //  Définir les composants
    private JLabel labelAccueil;

    //  Créer une fenêtre d'accueil
    public Accueil() {

        //  Définir le layout
        accueilpanel.setLayout(null);

        //  Définir la taille de la fenêtre
        frame.setSize(500, 500);

        //  Définir la position de la fenêtre
        frame.setLocationRelativeTo(null);

        //  Définir l'action de la croix
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  Afficher la fenêtre
        frame.setVisible(true);

        //  Définir les composants
        labelAccueil = new JLabel("Bienvenue sur l'application de gestion des stocks");

        //  Définir les positions et les tailles des composants
        labelAccueil.setBounds(0, 0, 500, 30);

        //  Centrer les composants et gérer les tailles
        labelAccueil.setHorizontalAlignment(JLabel.CENTER);

        //  Ajouter les composants à la fenêtre
        accueilpanel.add(labelAccueil);

        //  Ajouter le panel à la fenêtre
        frame.add(accueilpanel);

        //  Ajouter une barre de Menu
        JMenuBar menuBar = new JMenuBar();

        //  Ajouter un menu
        JMenu menu = new JMenu("Menu");

        //  Ajouter un item au menu
        JMenuItem item = new JMenuItem("Quitter");

        //  Ajouter l'action de l'item
        item.addActionListener(e -> System.exit(0));

        //  Ajouter l'item au menu
        menu.add(item);

        //  Ajouter un second item au menu
        JMenuItem item2 = new JMenuItem("Accueil");

        //  Ajouter l'action de l'item
        item2.addActionListener(e -> {
            frame.dispose();
            new Accueil();
        });

        //  Ajouter l'item au menu
        menu.add(item2);

        //  Ajouter un troisième item au menu
        JMenuItem item3 = new JMenuItem("Changer d'utilisateur");

        //  Ajouter l'action de l'item
        item3.addActionListener(e -> {
            frame.dispose();
            new Connexion();
        });

        //  Ajouter l'item au menu
        menu.add(item3);

        //  Ajouter un quatrième item au menu
        JMenuItem item4 = new JMenuItem("Gestion des utilisateurs");

        //  Ajouter l'action de l'item
        item4.addActionListener(e -> {
            frame.dispose();
            new GestionUtilisateurs();
        });

        //  Ajouter l'item au menu
        menu.add(item4);

        //  Ajouter le menu à la barre de menu
        menuBar.add(menu);

        //  Ajouter la barre de menu à la fenêtre
        frame.setJMenuBar(menuBar);
        
    }
    
}
