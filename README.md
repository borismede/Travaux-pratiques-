# Cahier des Charges : Projet Web "Amen-Web"

**Étudiant :** MEDEBAHO Dèlidji Sylvain Boris
**Filière :** L3 Mathématique-Informatique (FAST Natitingou)
**Thème :** Plateforme web mobile d'accès aux conférences chrétiennes pour les zones rurales.

---

## 1. Description du Projet
**Amen-Web** est une application web optimisée pour mobile permettant aux fidèles chrétiens des zones rurales d'accéder aux enseignements, aux conférences et aux cultes en différé ou en direct (via liens), malgré les contraintes de déplacement.

## 2. Analyse des Besoins
### 2.1. Problématique
Dans les zones rurales autour de Natitingou, l'éloignement des centres urbains et le manque de moyens de transport empêchent de nombreux fidèles de participer aux grandes conventions chrétiennes. 

### 2.2. Objectifs
* Offrir une interface simple et légère (faible consommation de données).
* Centraliser les ressources audio et textuelles des conférences.
* Permettre aux utilisateurs de soumettre des intentions de prière.

## 3. Spécifications Fonctionnelles
* **Page d'Accueil :** Liste des conférences récentes et thématiques (Ex: Foi, Jeunesse, Famille).
* **Lecteur de Conférences :** Une interface permettant de lire des résumés textuels et d'écouter des extraits audio (via balise HTML5 `<audio>`).
* **Agenda des Événements :** Calendrier des prochaines conférences prévues.
* **Module d'Interactivité (JS) :** Formulaire de soumission de témoignages ou d'intentions de prière avec validation dynamique en JavaScript.
* **Mode Économie de Données :** Design épuré sans images lourdes pour faciliter le chargement avec une connexion Edge/3G.

## 4. Spécifications Techniques
Le projet respecte les contraintes de développement Web "Vanilla" (pur) :
* **HTML5 :** Structure sémantique pour l'accessibilité.
* **CSS3 :** Design mobile-first utilisant Flexbox pour s'adapter à toutes les tailles d'écrans de smartphones.
* **JavaScript :** Gestion de la navigation entre les sections, filtrage des conférences par catégorie et gestion du formulaire de contact.

## 5. Architecture du Projet
* `index.html` : Page principale (Dashboard).
* `conferences.html` : Liste des enseignements.
* `priere.html` : Formulaire interactif.
* `assets/css/style.css` : Charte graphique sobre et spirituelle.
* `assets/js/app.js` : Logique d'affichage et de validation.

## 6. Planning Prévisionnel
* **Semaine 1 :** Rédaction de la structure HTML et hiérarchisation des contenus.
* **Semaine 2 :** Mise en page CSS (Focus sur l'expérience utilisateur mobile).
* **Semaine 3 :** Intégration JavaScript (Système de filtrage et validation de formulaire).
* **Semaine 4 :** Tests sur différents navigateurs mobiles et mise en ligne.

---
*Projet réalisé dans le cadre de l'unité de Développement Web - FAST Natitingou.*
