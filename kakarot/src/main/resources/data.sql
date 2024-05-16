
DROP TABLE IF EXISTS plantes;
CREATE TABLE plantes (
 id INT AUTO_INCREMENT PRIMARY KEY,
 nom VARCHAR(250) NOT NULL,
 categorie VARCHAR(250) NOT NULL,
 astuce VARCHAR(250) NOT NULL,
 planter VARCHAR(250) NOT NULL,
 recolter VARCHAR(250) NOT NULL,
 region VARCHAR(250) NOT NULL);
 INSERT INTO plantes (nom, categorie, astuce, planter, recolter, region)
VALUES ('courgette', 'Légume', 'Limiter l’oïdium, Favoriser la fécondation des fleurs,espacement d’1 mètre à 2 mètres', 'Avril', 'Juin','Provence-Alpes-Côte dAzur'),
('tomate', 'Fruit', 'Il doit faire le double de la taille du pot en largeur et le triple en profondeur, "Attacher ses plants', 'Mai', 'Aout', 'Occitanie'),
            ('laitue', 'Légume', 'apprécient aussi des arrosages fréquents, surtout si elles sont cultivées en pot', 'Mai', 'Juin','Bretagne'),
            ('citron', 'Fruit', 'omblez les espaces vides avec la terre de jardin, Ajoutez au fond du trou de plantation un engrais spécial agrumes', 'Mars', 'Juin','Ile-de-France'),
            ('jabuticaba', 'Fruit', 'Placer dans un vase mesurant 50 cm de diamètre et 50 cm de hauteur, Égoutter leau pour éviter la pourriture des racines', 'Avril', 'Septembre','Ile-de-France');



