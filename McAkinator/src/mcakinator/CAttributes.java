/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mcakinator;

/**
 *
 * @author arcedo
 */
public class CAttributes {
      // Global Attributes
      private Boolean mainCourse;
      private Boolean lastCourse;
      private Boolean menu;
      private Boolean complements;
      private Boolean healthy;
      private Boolean fried;
      private Boolean vegetables;
      private Boolean liquid;

// Last Course Attributes
// Fruit
      // Liquid is Danonino
      private Boolean fruit; // Tiene Frutas
      private Boolean pie; // Tarta de manzana
      private Boolean multipleFruits; // Frutibrocheta
      private Boolean sweet; // Melon
      private Boolean acidic; // Piña
            // Si no es acido y no es dulce es Manzana 
// Helado
      private Boolean iceCream; // Helados
      private Boolean cone; // Cono de helado
      private Boolean celiac; 
             // Si no tiene un cono y no es para celiacos es McFlurry
      
// Complements Attributes
// Saludable
      private Boolean isRed; // But NO liquid Happy Cherritos
            //  If is liquid and isRed Gazpacho
            //  NO IsRed Ensalada de la huerta
// No Saludable
// Potatoes
      private Boolean isPotatoe;  // Potatoes
      private Boolean hasBaconAndCheese; // Top Fries Bacon & Cheese
      private Boolean hasSourCream; // McShaker Fries Sour Cream
            // If NO Bacon And Cheese AND no hasSourCream Normal Potatoes
      private Boolean deluxe;
            // IF NO deluxe normal fries
// If No Potatoes 
      private Boolean share; //ShareBox
// If Yes shareBox
      private Boolean multipleProducts; // ShareBox 10 McNuggets And 10 alitas de pollo
      // ELSE ShareBox 25 McNuggets
//If No ShareBox
      private Boolean ballShape; // McBites
      private Boolean hasBone;// Alitas de pollo
      //McNuggets
      
}
