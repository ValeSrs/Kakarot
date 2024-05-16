/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.potager.kakarot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.io.InputStream;
import java.time.Month;
import java.util.Properties;

@Service
public class ImagePropertiesService {

    private final Properties properties;

    // Le chemin vers le fichier image.properties est injecté depuis application.properties
    public ImagePropertiesService(@Value("${images.file.path}") String imagesFilePath) throws IOException {
        properties = new Properties();
        // Charge le fichier image.properties depuis le chemin spécifié
        try ( InputStream inputStream = new ClassPathResource(imagesFilePath).getInputStream()) {
            properties.load(inputStream);
        }
    }

    public String getImagePathForMonth(String month) {
        // La clé dans le fichier image.properties est sous la forme "image.[mois en minuscules]"
        return properties.getProperty("image." + month.toLowerCase());
    }

    /* public String getImagePathForNextMonth(String month) {
        // Calculer le mois suivant
        Month currentMonth = Month.valueOf(month.toUpperCase());
        Month nextMonth = currentMonth.plus(1);
        // Obtenir le chemin de l'image pour le mois suivant
        return getImagePathForMonth(nextMonth.name());
    }*/
    public String getImagePathForNextMonth(String currentMonth) {
        // Calculer le mois suivant
        Month nextMonth = Month.valueOf(currentMonth.toUpperCase()).plus(1);
        // Obtenir le chemin de l'image pour le mois suivant
        return getImagePathForMonth(nextMonth.name());
    }
}
