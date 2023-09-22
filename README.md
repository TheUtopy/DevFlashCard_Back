# FashCard - Partie Backend

FashCard est une application web de révision des entretiens techniques pour devenir développeur Web/logiciel. Cette partie du projet gère le backend de l'application, développé avec Spring Boot et utilise une base de données MongoDB pour stocker les flashcards de questions/réponses.

La partie frontend de l'application se trouve dans un dépôt distinct développé en Angular.


## Prérequis
Avant de commencer, assurez-vous d'avoir installé les outils suivants sur votre système

- Java 8 ou version ultérieure
- Apache Maven
- MongoDB

## Configuration
1. Clonez ce dépôt sur votre machine locale
```bash
git clone git@github.com:TheUtopy/DevFlashCard_Back.git
```

2. Configurez la base de données MongoDB 
En modifiant le fichier src/main/resources/application.properties selon vos besoins. Par défaut, l'application utilise une base de données nommée fashcard.

3. Compilez et exécutez l'application Spring Boot
```bash
mvn spring-boot:run
```

L'application sera accessible à l'adresse http://localhost:8080.


## Utilisation
L'API REST exposée par ce backend permet de gérer les flashcards. Vous pouvez créer, lire, mettre à jour et supprimer des flashcards en utilisant les endpoints appropriés.

Consultez la documentation de l'API ou les fichiers de contrôleurs pour plus de détails sur les endpoints disponibles.

## Contributeurs 
- [Elsa](lien_vers_profil_github_elsa) 
- [Kévin](lien_vers_profil_github_kevin) 


## Contribution
Les contributions à ce projet sont les bienvenues. Si vous souhaitez contribuer, suivez ces étapes :

Fork du projet
Créez une branche pour votre fonctionnalité (git checkout -b fonctionnalité/nom-de-la-fonctionnalité)
Faites vos modifications
Validez vos modifications (git commit -m "Ajout de fonctionnalité")
Poussez vers la branche (git push origin fonctionnalité/nom-de-la-fonctionnalité)
Ouvrez une demande de fusion (Pull Request) vers la branche principale du projet

 ## Licence 
 Ce projet est sous licence MIT. Pour plus d'informations, consultez le fichier [LICENSE](LICENSE). 