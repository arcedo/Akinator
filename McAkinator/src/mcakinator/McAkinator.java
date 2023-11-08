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
            new CProducts("Frutibrocheta", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT,ProductAttribute.MULTIPLE_FRUIT)),
            new CProducts("Melon", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT,ProductAttribute.HARD_SKIN)),
            new CProducts("Pine", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT,ProductAttribute.HARD_SKIN, ProductAttribute.SOUR)),
            new CProducts("Apple", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT)),
      //Ice Cream
            new CProducts("Cone Ice Cream", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM,ProductAttribute.CONE)),
            new CProducts("Sundae", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM,ProductAttribute.CELIAC)),
            new CProducts("McFlurry", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM)),
            
//Complements
      //Healthy
            new CProducts("Salad of the field", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SALAD)),
            new CProducts("Happy Cherritos", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.RED)),
            new CProducts("Gazpacho", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.RED, ProductAttribute.LIQUID)),
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
            //TODO: Les ponemos el atributo de Chicken?
            new CProducts("ShareBox 25 McNuggets", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SHARE)),
            new CProducts("ShareBox 10 McNuggets y 10 alitas de pollo", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SHARE,ProductAttribute.MULTIPLE_PRODUCTS)),
            new CProducts("McBites", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.BALL_SHAPED)),
            new CProducts("Alitas de pollo", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.BONE)),
            new CProducts("McNuggets", ProductType.COMPLEMENT, Arrays.asList()),
            
//Main Course
      //Salad 
            //Cesar
            new CProducts("Salad Chicken Cesar", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN,ProductAttribute.BACON.SALAD, ProductAttribute.CESAR)),
            new CProducts("Salad Cesar", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BACON.SALAD, ProductAttribute.CESAR)),
            //Honey Mustad
            new CProducts("Salad Chicken Cesar", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN,ProductAttribute.BACON.SALAD, ProductAttribute.MUSTARD)),
            new CProducts("Salad Chicken Cesar", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BACON.SALAD, ProductAttribute.MUSTARD)),
      //Chicken
            new CProducts("Chiken Burger Kids", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN)),
            new CProducts("Chiken Burger Kids", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN)),
      };  

      //QUESTIONS
      public CQuestions[] questions = new CQuestions[]{
            //MAIN QUESTIONS
            new CQuestions("Are you thinking about a dessert?", QuestionType.LAST_COURSE, null),
            new CQuestions("Are you thinking about a complement?", QuestionType.COMPLEMENT, null),
            new CQuestions("Are you thinking about a main course?", QuestionType.MAIN_COURSE, null),
            //SECONDARY QUESTIONS
            new CQuestions("Is your product liquid?", null, Arrays.asList(QuestionAttribute.LIQUID)),
            new CQuestions("Does your product contain vegetables?", null, Arrays.asList(QuestionAttribute.VEGETABLES)),
            //LAST_COURSE QUESTIONS
            new CQuestions("Your product is a fruit?", QuestionType.LAST_COURSE, Arrays.asList(QuestionAttribute.FRUIT)),
            new CQuestions("Your product contains multiple fruits?", QuestionType.LAST_COURSE, Arrays.asList(QuestionAttribute.FRUIT, QuestionAttribute.MULTIPLE_FRUIT)),
      };
      
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
