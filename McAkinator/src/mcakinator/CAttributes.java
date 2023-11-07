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
      private Boolean vegetables;
      private Boolean liquid;

// Last Course Attributes
// Fruit
      // Liquid is Danonino
      private Boolean fruit; // Tiene Frutas
      private Boolean pie; // Tarta de manzana
      private Boolean multipleFruits; // Frutibrocheta
      private Boolean hardSkin; //Melon Piña
      private Boolean acidic; // Piña
            // If no acidic Melon
      // IF No hardSkin es Manzana 
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
      private Boolean isPotato;  // Potatoes
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
      //ELSE McNuggets
      
// Main Course
// IF No vegetables  Chicken Burger Kids
// ELSE
      private Boolean multipleMeat;
      //private Boolean fried;
      private Boolean hasBacon;
      private Boolean hasCheese;
      private Boolean bbqSauce; 
      private Boolean seedBread;
      private Boolean multipleCheese;
      
      private Boolean isMcExtreme;
      // IF McExtreme
      private Boolean hasEgg; //  IF multipleMeat Doble McExtreme BBQ Bourbon Huevo  ELSE McExtreme BBQ Bourbon Huevo
      //  IF multipleMeat AND multipleCheese Doble McExtreme Tres Quesos  ELSE McExtreme Tres Quesos
      // ELSE IF multipleMeat  McExtreme Bacon Doble ELSE McExtreme Bacon
      
      // IF No McExtreme
      private Boolean isMcCrispy;
      // IF  McCrispy AND bbqSauce BBQ&Bacon
      // ELSE McCrispy Original
      
      // IF No McExtreme AND No McCrispy normal Sandwiches
      private Boolean flatBread; // McWrap chicken crujiente & Bacon
      
      private Boolean salat;
      //IF Salat
      private Boolean mustard;
      //if  has chicken Ensalada Chicken Honey Mustard
      //ELSE Ensalada Honey Mustard
      //IF No mustard AND chicken Ensalada Chicken César
      //ELSE Ensalada César
// Has fish
      private Boolean fish;
      //  If has cheese Filete de Pescado
      // ELSE McFish
      
      // Has Chicken
      private Boolean chicken;
      // IF BBQ Chicken Burger BBQ
      // ELSE 
            //  IF cheese AND bacon CBO
            // IF cheese Chicken & Cheese
            // ELSE 
                  //IF seed bread McPollo
                  // ELSE Chicken Mayo TODO: Doble & Triple
// Else has meat
      //IF Seed Bread 
            //IF mostazaSauce Cuarto de Libra
            //ELSE IF multipleMeat Cuarto de Libra Doble
            //ELSE
                  //IF multipleMeat Big Mac
                  // ELSE McRoyal Deluxe
      // ELSE IF hasVegetals Cheeseburger TODO: Doble & Triple
      //ELSE Hamburguesa Happy Meal
}
