package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Service
public class ImagePropertiesService {

    private final Properties properties;

    // Le chemin vers le fichier image.properties est injecté depuis application.properties
    public ImagePropertiesService(@Value("${images.file.path}") String imagesFilePath) throws IOException {
        properties = new Properties();
        // Charge le fichier image.properties depuis le chemin spécifié
        try (InputStream inputStream = new ClassPathResource(imagesFilePath).getInputStream()) {
            properties.load(inputStream);
        }
    }

    // Récupère le chemin de l'image associé à un mois donné
    public String getImagePathForMonth(String month) {
        // La clé dans le fichier image.properties est sous la forme "image.[mois en minuscules]"
        return properties.getProperty("image." + month.toLowerCase());
    }
}
