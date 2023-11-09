/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcakinator;

/**
 *
 * @author arcedo
 */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class McAkinator {
      public CProducts[] products = new CProducts[] {
//Last Course
            new CProducts("Danonino", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.LIQUID)),
      //FRUTA
            new CProducts("Apple Pie", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT,ProductAttribute.PIE)),
            new CProducts("Frutibrocheta", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT,ProductAttribute.MULTIPLE_PRODUCTS)),
            new CProducts("Melon", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT,ProductAttribute.HARD_SKIN)),
            new CProducts("Pine", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT,ProductAttribute.HARD_SKIN, ProductAttribute.SOUR)),
            new CProducts("Apple", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT)),
      //Ice Cream
            new CProducts("Cone Ice Cream", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM,ProductAttribute.CONE)),
            new CProducts("Sundae", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM,ProductAttribute.CELIAC)),
            new CProducts("McFlurry", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM)),
            
//Complements
      //Healthy
            new CProducts("Salad of the field", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SALAD,ProductAttribute.VEGETABLES)),
            new CProducts("Happy Cherritos", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.RED,ProductAttribute.VEGETABLES)),
            new CProducts("Gazpacho", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.RED, ProductAttribute.LIQUID,ProductAttribute.VEGETABLES)),
      //Potatoes
            //Normal Fries
            new CProducts("Potato Fries", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO)),
            new CProducts("Top Fries Bacon & Cheese", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO,ProductAttribute.CHEESE,ProductAttribute.BACON)),
            new CProducts("McShaker Fries Sour Cream", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO,ProductAttribute.SOUR)),
            //Deluxe Fries
            new CProducts("Potato Fries", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO,ProductAttribute.DELUXE)),
            new CProducts("Top Fries Bacon & Cheese", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO,ProductAttribute.CHEESE,ProductAttribute.BACON,ProductAttribute.DELUXE)),
            new CProducts("McShaker Fries Sour Cream", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO,ProductAttribute.SOUR,ProductAttribute.DELUXE)),
      //Chicken 
            new CProducts("ShareBox 25 McNuggets", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SHARE,ProductAttribute.CHICKEN )),
            new CProducts("ShareBox 10 McNuggets y 10 alitas de pollo", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SHARE,ProductAttribute.MULTIPLE_PRODUCTS,ProductAttribute.CHICKEN)),
            new CProducts("McBites", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.BALL_SHAPED,ProductAttribute.CHICKEN)),
            new CProducts("Alitas de pollo", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.BONE,ProductAttribute.CHICKEN)),
            new CProducts("McNuggets", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHICKEN)),
            
//Main Course
      //Salad 
            //Cesar
            new CProducts("Salad Chicken Cesar", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES,ProductAttribute.CHICKEN,ProductAttribute.SALAD, ProductAttribute.CESAR)),
            new CProducts("Salad Cesar", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES,ProductAttribute.SALAD, ProductAttribute.CESAR)),
            //Honey Mustad
            new CProducts("Salad Chicken Honey Mustad", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES,ProductAttribute.CHICKEN,ProductAttribute.SALAD, ProductAttribute.MUSTARD)),
            new CProducts("Salad Honey Mustad", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES,ProductAttribute.SALAD, ProductAttribute.MUSTARD)),
      //Chicken
            new CProducts("Chiken Burger Kids", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN)),
            new CProducts("Chiken Burger Kids", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN)),
      };  

      //QUESTIONS
      public CQuestions[] primarySectionQuestions = new CQuestions[]{
            //MAIN QUESTIONS
            new CQuestions("Are you thinking about a dessert?", QuestionType.LAST_COURSE, null),
            new CQuestions("Are you thinking about a complement?", QuestionType.COMPLEMENT, null),
            new CQuestions("Are you thinking about a main course?", QuestionType.MAIN_COURSE, null),
      };
      
      //Esta podria ser la primera pregunta porque solo hay dos productos liquidos y sabiendo el type se puede adivinar
      public CQuestions[] secondarySectionQuestions = new CQuestions[]{
            //SECONDARY QUESTIONS
            new CQuestions("Is your product liquid?", null, Arrays.asList(QuestionAttribute.LIQUID)),
            new CQuestions("Does your product contain vegetables?", null, Arrays.asList(QuestionAttribute.VEGETABLES)),
            new CQuestions("Has bacon?", QuestionType.COMPLEMENT, Arrays.asList( QuestionAttribute.BACON)),
            new CQuestions("Has bacon?", QuestionType.COMPLEMENT, Arrays.asList( QuestionAttribute.CHEESE)),
            new CQuestions("Is sour?", QuestionType.COMPLEMENT, Arrays.asList(QuestionAttribute.SOUR)),
            new CQuestions("It has multiple products?", QuestionType.COMPLEMENT, Arrays.asList(QuestionAttribute.MULTIPLE_PRODUCTS)),
      };
      
      public CQuestions[] thirdSectionQuestions = new CQuestions[]{
      //Last course
            // Solo hacer una pregunta de estas dos porque si no es una cosa es la otra
            new CQuestions("Your product is a fruit?", QuestionType.LAST_COURSE, Arrays.asList(QuestionAttribute.FRUIT)),
            new CQuestions("Your product is an ice cream?", QuestionType.LAST_COURSE, Arrays.asList(QuestionAttribute.ICE_CREAM)),
      // Complements
            new CQuestions("Your product is red?", QuestionType.COMPLEMENT, Arrays.asList(QuestionAttribute.RED)),
            //Ponemos esta pregunta como secundaria?? Porque se repite con la de main course
            new CQuestions("Your product is a salad?", QuestionType.COMPLEMENT, Arrays.asList(QuestionAttribute.SALAD)),
            new CQuestions("Your product has potato?", QuestionType.COMPLEMENT, Arrays.asList(QuestionAttribute.POTATO)),
            new CQuestions("Your product has chicken?", QuestionType.COMPLEMENT, Arrays.asList(QuestionAttribute.CHICKEN)),
      //Main course
            new CQuestions("Your product is a salad?", QuestionType.MAIN_COURSE, Arrays.asList(QuestionAttribute.SALAD)),
            new CQuestions("The product has flat bread?", QuestionType.MAIN_COURSE, Arrays.asList(QuestionAttribute.FLAT_BREAD)),
            new CQuestions("The product contains chicken?", QuestionType.MAIN_COURSE, Arrays.asList(QuestionAttribute.CHICKEN)),
            new CQuestions("The product contains fish?", QuestionType.MAIN_COURSE, Arrays.asList(QuestionAttribute.FISH)),
            new CQuestions("The product contains beef?", QuestionType.MAIN_COURSE, Arrays.asList(QuestionAttribute.BEEF)),
      };
      
      public CQuestions[] forthSectionQuestions = new CQuestions[]{
      //Last course
            //Fruit
            new CQuestions("Your product contains multiple fruits?", QuestionType.LAST_COURSE, Arrays.asList(QuestionAttribute.FRUIT, QuestionAttribute.MULTIPLE_FRUIT)),
            new CQuestions("Your product is a pie?", QuestionType.LAST_COURSE, Arrays.asList(QuestionAttribute.FRUIT, QuestionAttribute.PIE)),
            new CQuestions("Your fruit has a hard skin?", QuestionType.LAST_COURSE, Arrays.asList(QuestionAttribute.FRUIT, QuestionAttribute.HARD_SKIN)),
            //new CQuestions("Your fruit is sour?", QuestionType.LAST_COURSE, Arrays.asList(QuestionAttribute.FRUIT,QuestionAttribute.SOUR)),
            //Ice cream
            new CQuestions("Is your ice cream in a cone?", QuestionType.LAST_COURSE, Arrays.asList(QuestionAttribute.ICE_CREAM, QuestionAttribute.CONE)),
            new CQuestions("Is your ice cream for people with celiac disease?", QuestionType.LAST_COURSE, Arrays.asList(QuestionAttribute.ICE_CREAM, QuestionAttribute.CELIAC)), 
      //Complements
            // Potato
            new CQuestions("The potatoes are Deluxe?", QuestionType.COMPLEMENT, Arrays.asList(QuestionAttribute.POTATO, QuestionAttribute.DELUXE)),
            //Chicken
            new CQuestions("The product name has \"Share\"?", QuestionType.COMPLEMENT, Arrays.asList(QuestionAttribute.CHICKEN, QuestionAttribute.SHARE)),
            new CQuestions("It is ball shaped?", QuestionType.COMPLEMENT, Arrays.asList(QuestionAttribute.CHICKEN, QuestionAttribute.BALL_SHAPED)),
            new CQuestions("It has bones?", QuestionType.COMPLEMENT, Arrays.asList(QuestionAttribute.CHICKEN, QuestionAttribute.BONE)),
      };
      
      /*public CQuestions[] fivethSectionQuestions = new CQuestions[]{
      //Complements
            //Potato
            //Chicken
            //new CQuestions("It has multiple products?", QuestionType.COMPLEMENT, Arrays.asList(QuestionAttribute.CHICKEN,QuestionAttribute.SHARE ,QuestionAttribute.MULTIPLE_PRODUCTS)),
            
      };*/
      
      /**
       * @param args the command line arguments
       */
      public static void mostrarPregunta() {
        Scanner scanner = new Scanner(System.in);
        String[] pregunta = {"Are you thinking about a dessert?(y/n)", "Are you thinking about a Complement?(y/n)", "Are you thinking about a first course?(y/n)"};
        boolean respuesta = true;
        // Crear una instancia de la clase Random
        ArrayList<Integer> arrPreguntasMostradas = new ArrayList<>();
        do {
            // Generar un número aleatorio entre 1 y 3
            Random random = new Random();
            int numeroAleatorio;
            do {
                numeroAleatorio = random.nextInt(3);
            } while (arrPreguntasMostradas.contains(numeroAleatorio));

            //System.out.println(numeroAleatorio);
            System.out.println(pregunta[numeroAleatorio]);
            String respuestaPregunta = scanner.nextLine();

            if (respuestaPregunta == "Y" || respuestaPregunta == "y") {
                respuesta = false;
            } else if (respuestaPregunta == "N" || respuestaPregunta == "n") {
                respuesta = true;
            }
            
            arrPreguntasMostradas.add(numeroAleatorio);
            System.out.println(arrPreguntasMostradas.size());
        } while (respuesta == true);
    }
      public static void main(String[] args) {
            // TODO code application logic here
            mostrarPregunta();
      }
      
}
