# Documentation Utilisateur PPe Gestion des Utilsateur et des Ligues  

## Sommaire  
<ul>
    <li><a href="#sommaire">Sommaire</a></li>
    <li><a href="#installation">Installation</a></li>
    <li><a href="#mode-operatoire">Mode Operatoire</a></li>
    <li><a href="#document-technique">Document Technique</a></li>
</ul>

## Installation

Pour installer l'application de gestion des ligues et des utilisateur.  
il va vous falloir [récuperer l'application](https://codeload.github.com/InMemoriam7th/PPE-Groupe-1/zip/refs/heads/main). 

Une fois l'application mise en place il va falloir configurer la base de données.  
Le script de création est fourni avec l'application, il est dans le fichier [Script BDD.sql](https://github.com/InMemoriam7th/PPE-Groupe-1/blob/main/Script%20BDD.sql).  

Ensuite il va falloir configurer l'application avec les parametres de la base de données créé.  
Copiez le fichier **CredentialsExample** et renommez le **Credentials**, ensuite configurez les acces de la base de données dedans.  

Pour finir, il va falloir installer les dépendances Maven:<br> Depuis Eclipse -> selectionner l'aplication -> run as -> Maven build.<br>
Puis faite "Maven install".
  
Une fois que tout est fait, votre application est prête a l'emploi.

## Mode Operatoire

D'abord connectez vous à l'application, les identifiants par default sont:

**root** pour l'identifiant  
**toor** pour le mot de passe  

![connexion](https://raw.githubusercontent.com/InMemoriam7th/PPE-Groupe-1/main/DOCS/img/connexion.jpg)

Vous serez connecter a l'application avec le compte **Root**, il permet d'outrepasser toute les autorisations et de creer, de modifier et de supprimer des employés et des ligues.  

### **Creer une ligue**

Depuis la page principale, selectionnez "Gérer les ligues", puis "ajouter une ligue", renseignez le nom de la ligue que vous voulez créer et c'est fait.  

![Selection d'une Ligue](https://raw.githubusercontent.com/InMemoriam7th/PPE-Groupe-1/main/DOCS/img/selection_ligue.jpg)
![Creer une ligue](https://raw.githubusercontent.com/InMemoriam7th/PPE-Groupe-1/main/DOCS/img/ajouter_une_ligue.jpg)

### **Modifier ou supprimer une ligue**

Depuis la page "Gestion des ligues", sélectionnez la ligue a modifier ou a supprimer, et sur la page suivante vous pouvez soit modifier le nom de la ligue ou la supprimer.  

![Modifier ou supprimer une ligue](https://raw.githubusercontent.com/InMemoriam7th/PPE-Groupe-1/main/DOCS/img/edit_ligue.jpg)

### **Ajouter un employé**  

Depuis la page "Gestion des ligues", sélectionnez la ligue où l'employé doit être ajouté, et sur la page suivante, sélectionnez "éditer employés", puis "Ajouter un employé", renseignez les informations de l'employé pour terminer.

![Ajouter un employé](https://raw.githubusercontent.com/InMemoriam7th/PPE-Groupe-1/main/DOCS/img/edit_ligue_employee.jpg)

### **Modifier ou supprimer un employé**

Depuis la page "Gestion des ligues", sélectionnez la ligue où se trouve l'employé qui doit être modifier ou supprimer, et sur la page suivante, sélectionnez "éditer employés", puis l'employé en question, sélectionnez "Modifier", sur la page suivante vous pouvez modifier les information de l'employé ou le supprimer.  

![Ajouter un employé](https://raw.githubusercontent.com/InMemoriam7th/PPE-Groupe-1/main/DOCS/img/modifier_employe.jpg)

## Document Technique

### Schéma des différentes couches

![Schéma des couches](https://raw.githubusercontent.com/InMemoriam7th/PPE-Groupe-1/main/DOCS/img/couche.svg)

### Schéma relationnel de la base de données

![BDD](https://raw.githubusercontent.com/InMemoriam7th/PPE-Groupe-1/main/DOCS/img/BDD.svg)

