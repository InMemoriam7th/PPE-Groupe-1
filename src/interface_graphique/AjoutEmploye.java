package interface_graphique;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import personnel.Employe;
import personnel.Ligue;
import personnel.SauvegardeImpossible;

public class AjoutEmploye{
	private Ligue ligue;
	private LigueEdit ligueedit;
	
	private JFrame rootframe = new JFrame();
	private JPanel mainframe = new JPanel();

	private JTextField nom  = new JTextField();
	
	private JTextField prenom = new JTextField();
	private JTextField mail = new JTextField();
	
	private JPasswordField password  = new JPasswordField();

	private JTextField dateArriveejour = new JTextField();
	private JTextField dateArriveemois = new JTextField();
	private JTextField dateArriveeannee = new JTextField();
	private JTextField dateDepartjour = new JTextField();
	private JTextField dateDepartmois = new JTextField();
	private JTextField dateDepartannee = new JTextField();
	
	private JTextField dateDepart = new JTextField();
	
	public AjoutEmploye(Ligue ligue, LigueEdit ligue_edit) {
		this.ligue = ligue;
		this.ligueedit = ligue_edit;
		Rootframe();
		Mainframe();
		
	}
	
	private void Rootframe() {
		rootframe.setSize(500,400);
		rootframe.setVisible(true);
		rootframe.getContentPane().add(mainframe);
	}
	
	private void Mainframe() {
		mainframe.setLayout(new BoxLayout(mainframe, BoxLayout.PAGE_AXIS));
		mainframe.add(Titre());
		mainframe.add(NomPrenom());
		mainframe.add(MailPwd());
		mainframe.add(Ajouter());
	}
	
	private JPanel ItemFrame() {
		JPanel itemframe = new JPanel();
		itemframe.setLayout(new BoxLayout(itemframe, BoxLayout.LINE_AXIS));
		return itemframe;
	}
	private JPanel Titre() {
		JPanel itemframe = ItemFrame();
		JLabel titre = new JLabel("Ajouter un employe.");
		itemframe.add(titre);
		return itemframe;
	}
	
	private JPanel NomPrenom(){
		JPanel itemframe = ItemFrame();
		JLabel nomlabel = new JLabel("*Nom : ");
		JLabel prenomlabel = new JLabel("*Pr�nom : ");
		nom.setMaximumSize(new Dimension(150, 20));
		prenom.setMaximumSize(new Dimension(150, 20));
		itemframe.add(nomlabel);
		itemframe.add(nom);
		itemframe.add(prenomlabel);
		itemframe.add(prenom);
		return itemframe;
	}
	
	private JPanel MailPwd() {
		JPanel itemframe = ItemFrame();
		JLabel maillabel = new JLabel("*Mail : ");
		JLabel passwordlabel = new JLabel("*Mot de passe : ");
		mail.setMaximumSize(new Dimension(150, 20));
		password.setMaximumSize(new Dimension(150, 20));
		itemframe.add(maillabel);
		itemframe.add(mail);
		itemframe.add(passwordlabel);
		itemframe.add(password);
		return itemframe;
	}
	
	private JPanel Ajouter() {
		JOptionPane messageerreur = new JOptionPane();
		JPanel itemframe = ItemFrame();
		JButton ajouter = new JButton("Ajouter");
	    ajouter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(nom.getText() == "" && prenom.getText() == "" && mail.getText() == "" && String.valueOf(password.getPassword()) == "") {
					try {
						ligue.addEmploye(nom.getText(), prenom.getText(), mail.getText(), String.valueOf(password.getPassword()), null, null);
					} catch (SauvegardeImpossible e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}finally {
						rootframe.dispose();
						ligueedit.GenerateListeEmployee();
					}
				}else {
					messageerreur.showMessageDialog(rootframe, "Des champs obligatoire sont vide", "Erreur" ,JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		itemframe.add(ajouter);
		return itemframe;
	}
		
	}
	


