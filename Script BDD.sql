create table ligue
(
id_ligue int PRIMARY KEY AUTO_INCREMENT,
nom_ligue varchar(256) NOT NULL
);

create table employes
(
id_employe int PRIMARY KEY AUTO_INCREMENT,
nom varchar(256) NOT NULL,
prenom varchar(256) NOT NULL,
mail varchar(256) NOT NULL,
password varchar(256) NOT NULL,
datedepart DATETIME,
datearrivee DATETIME,
admin int DEFAULT 0,
id_ligue int,
FOREIGN KEY ligue_employe(id_ligue) references ligue(id_ligue)
);
