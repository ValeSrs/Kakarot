package controller;

import org.springframework.ui.Model;

import java.time.LocalDate;
import java.time.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import service.ImagePropertiesService; // Import manquant pour ImagePropertiesService

@Controller
public class ControleurKakarot {

    @Autowired
    private ImagePropertiesService imagePropertiesService; // Injection du service ImagePropertiesService

    /**
     * Méthode pour la page d'accueil
     * @param model Le modèle utilisé pour transmettre des données à la vue
     * @return La vue "index"
     */
    @GetMapping("/")
    public String home(Model model) {
        // Obtenir le mois actuel
        Month currentMonth = LocalDate.now().getMonth();
        // Récupérer le chemin de l'image pour le mois actuel depuis le service imagePropertiesService
        String imagePath = imagePropertiesService.getImagePathForMonth(currentMonth.name()); // Utilisation de imagePropertiesService pour obtenir le chemin de l'image
        // Transmettre le chemin de l'image au modèle
      model.addAttribute("imagePath", imagePath); // Ajout du chemin de l'image au modèle pour être utilisé dans la vue
        return "index"; // Retourne la vue "index"
    }
}
