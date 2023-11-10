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

public class ProjecteMICRO01_Akinator {

      public static CProducts[] products = new CProducts[]{
            //Last Course
            new CProducts("Danonino", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.LIQUID)),
            //FRUTA
            new CProducts("Apple Pie", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.PIE)),
            new CProducts("Frutibrocheta", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.MULTIPLE_PRODUCTS)),
            new CProducts("Melon", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.HARD_SKIN)),
            new CProducts("Pine", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.HARD_SKIN, ProductAttribute.SOUR)),
            new CProducts("Apple", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT)),
            //Ice Cream
            new CProducts("Cone Ice Cream", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM, ProductAttribute.CONE)),
            new CProducts("Sundae", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM, ProductAttribute.CELIAC)),
            new CProducts("McFlurry", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM)),
            //Complements
            //Healthy
            new CProducts("Salad of the field", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SALAD, ProductAttribute.VEGETABLES)),
            new CProducts("Happy Cherritos", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.RED, ProductAttribute.VEGETABLES)),
            new CProducts("Gazpacho", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.RED, ProductAttribute.LIQUID, ProductAttribute.VEGETABLES)),
            //Potatoes
            //Normal Fries
            new CProducts("Potato Fries", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO)),
            new CProducts("Top Fries Bacon & Cheese", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.CHEESE, ProductAttribute.BACON)),
            new CProducts("McShaker Fries Sour Cream", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.SOUR)),
            //Deluxe Fries
            new CProducts("Potato Fries", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.DELUXE)),
            new CProducts("Top Fries Bacon & Cheese", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.CHEESE, ProductAttribute.BACON, ProductAttribute.DELUXE)),
            new CProducts("McShaker Fries Sour Cream", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.SOUR, ProductAttribute.DELUXE)),
            //Chicken 
            new CProducts("ShareBox 25 McNuggets", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SHARE, ProductAttribute.CHICKEN)),
            new CProducts("ShareBox 10 McNuggets y 10 alitas de pollo", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SHARE, ProductAttribute.MULTIPLE_PRODUCTS, ProductAttribute.CHICKEN)),
            new CProducts("McBites", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.BALL_SHAPED, ProductAttribute.CHICKEN)),
            new CProducts("Alitas de pollo", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.BONE, ProductAttribute.CHICKEN)),
            new CProducts("McNuggets", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHICKEN)),
            //Main Course
            //Salad 
            //Cesar
            new CProducts("Salad Chicken Cesar", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES, ProductAttribute.CHICKEN, ProductAttribute.SALAD, ProductAttribute.CESAR)),
            new CProducts("Salad Cesar", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES, ProductAttribute.SALAD, ProductAttribute.CESAR)),
            //Honey Mustad
            new CProducts("Salad Chicken Honey Mustad", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES, ProductAttribute.CHICKEN, ProductAttribute.SALAD, ProductAttribute.MUSTARD)),
            new CProducts("Salad Honey Mustad", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES, ProductAttribute.SALAD, ProductAttribute.MUSTARD)),
            //Chicken
            new CProducts("Chiken Burger Kids", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN)),
      
        // BURGIR
            //ALL THE HAMBURGERS MUST HAVE BEEF, CHICKEN OR FISH AND MOST OF THEM MAY HAVE VEGETABLES, CHEESE AND SEED_BREAD.
              new CProducts("Big Mac", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.CHEESE,ProductAttribute.VEGETABLES, ProductAttribute.MULTIPLE_PRODUCTS, ProductAttribute.SEED_BREAD)),
              new CProducts("MCRoyal Deluxe", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.SEED_BREAD)),
              new CProducts("Cuarto de Libra", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.SEED_BREAD, ProductAttribute.MUSTARD)),
              new CProducts("Cuarto de Libra Doble", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MULTIPLE_MEAT, ProductAttribute.BEEF, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.SEED_BREAD, ProductAttribute.MUSTARD)),
              new CProducts("McPollo", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.VEGETABLES, ProductAttribute.SEED_BREAD)),
              new CProducts("CBO", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.VEGETABLES, ProductAttribute.CHEESE, ProductAttribute.BACON, ProductAttribute.SEED_BREAD)),
              new CProducts("McCrispy Original", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCCRISPY, ProductAttribute.VEGETABLES, ProductAttribute.CHICKEN, ProductAttribute.CHEESE)),
              new CProducts("McCrispy BBQ&Bacon", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCCRISPY, ProductAttribute.BACON, ProductAttribute.CHICKEN, ProductAttribute.CHEESE, ProductAttribute.VEGETABLES)),
              new CProducts("McExtreme Bacon", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.BEEF, ProductAttribute.SEED_BREAD)),
              new CProducts("McExtreme Bacon Double", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.MULTIPLE_MEAT, ProductAttribute.BEEF, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.SEED_BREAD)),
              new CProducts("McExtreme Tres Quesos", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.DIFERENT_CHEESE,ProductAttribute.BEEF ,ProductAttribute.SEED_BREAD)),
              new CProducts("Doble McExtreme Tres Quesos", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.MULTIPLE_MEAT,ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.DIFERENT_CHEESE,ProductAttribute.BEEF ,ProductAttribute.SEED_BREAD)),
              new CProducts("McExtreme BBQ Bourbon Huevo", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.CHEESE, ProductAttribute.BEEF, ProductAttribute.EGG, ProductAttribute.BBQ_SAUCE)),
              new CProducts("Doble McExtreme BBQ Bourbon Huevo", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.CHEESE, ProductAttribute.BEEF, ProductAttribute.MULTIPLE_MEAT, ProductAttribute.EGG, ProductAttribute.BBQ_SAUCE)),
              new CProducts("Hamburguesa Happy Meal", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.VEGETABLES, ProductAttribute.MUSTARD)),
              new CProducts("Cheeseburger", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.VEGETABLES, ProductAttribute.MUSTARD, ProductAttribute.CHEESE)),
              // DOUBLE AND TRIPLE CHEESE BURGUER ARE THE SAME.
              //new CProducts("Double Cheeseburguer", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.MULTIPLE_MEAT, ProductAttribute.MULTIPLE_CHEESE,  ProductAttribute.VEGETABLES, ProductAttribute.MUSTARD, ProductAttribute.CHEESE)),
              //new CProducts("Triple Cheeseburguer", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.MULTIPLE_MEAT, ProductAttribute.MULTIPLE_CHEESE,  ProductAttribute.VEGETABLES, ProductAttribute.MUSTARD, ProductAttribute.CHEESE)),
              new CProducts("Chicken & Cheese", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.CHEESE,ProductAttribute.VEGETABLES, ProductAttribute.BBQ_SAUCE)),
              new CProducts("McWrap Chicken crujiente & Bacon", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.FLAT_BREAD, ProductAttribute.CHICKEN, ProductAttribute.CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.BACON)),
      };  

      //QUESTIONS
      public static CQuestions[] primarySectionQuestions = new CQuestions[]{
            //MAIN QUESTIONS
            new CQuestions("Are you thinking about a dessert?", ProductType.LAST_COURSE, null),
            new CQuestions("Are you thinking about a complement?", ProductType.COMPLEMENT, null),
            new CQuestions("Are you thinking about a main course?", ProductType.MAIN_COURSE, null),
      };

      //Esta podria ser la primera pregunta porque solo hay dos productos liquidos y sabiendo el type se puede adivinar
      public static CQuestions[] secondarySectionQuestions = new CQuestions[]{
            //SECONDARY QUESTIONS
            new CQuestions("Is your product liquid?", null, Arrays.asList(ProductAttribute.LIQUID)),
            new CQuestions("Does your product contain vegetables?", null, Arrays.asList(ProductAttribute.VEGETABLES)),
            new CQuestions("Has bacon?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.BACON)),
            new CQuestions("Has cheese?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHEESE)),
            new CQuestions("Is sour?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SOUR)),
            new CQuestions("It has multiple products?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.MULTIPLE_PRODUCTS)),
      };

      public  static CQuestions[] thirdSectionQuestions = new CQuestions[]{
            //Last course
            // Solo hacer una pregunta de estas dos porque si no es una cosa es la otra
            new CQuestions("Your product is a fruit?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT)),
            new CQuestions("Your product is an ice cream?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM)),
            // Complements
            new CQuestions("Your product is red?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.RED)),
            //Ponemos esta pregunta como secundaria?? Porque se repite con la de main course
            new CQuestions("Your product is a salad?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SALAD)),
            new CQuestions("Your product has potato?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO)),
            new CQuestions("Your product has chicken?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHICKEN)),
            //Main course
            new CQuestions("Your product is a salad?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.SALAD)),
            new CQuestions("The product has flat bread?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.FLAT_BREAD)),
            new CQuestions("The product contains chicken?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN)),
            new CQuestions("The product contains fish?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.FISH)),
            new CQuestions("The product contains beef?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF)),
      };

      public static CQuestions[] forthSectionQuestions = new CQuestions[]{
            //Last course
            //Fruit
            new CQuestions("Your product contains multiple fruits?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.MULTIPLE_FRUIT)),
            new CQuestions("Your product is a pie?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.PIE)),
            new CQuestions("Your fruit has a hard skin?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.HARD_SKIN)),
            //new CQuestions("Your fruit is sour?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT,ProductAttribute.SOUR)),
            //Ice cream
            new CQuestions("Is your ice cream in a cone?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM, ProductAttribute.CONE)),
            new CQuestions("Is your ice cream for people with celiac disease?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM, ProductAttribute.CELIAC)),
            //Complements
            // Potato
            new CQuestions("The potatoes are Deluxe?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.DELUXE)),
            //Chicken
            new CQuestions("The product name has \"Share\"?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.SHARE)),
            new CQuestions("It is ball shaped?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.BALL_SHAPED)),
            new CQuestions("It has bones?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.BONE)),
      };
      
      public static CProducts selectedAttributes = new CProducts();
      public static CProducts notAttributes = new CProducts();
      
      public static CProducts[] getProductsByType(CProducts[] allProducts, ProductType targetType) {
            List<CProducts> filteredProducts = new ArrayList<>();

            for (CProducts product : allProducts) {
                  if (product.getType() == targetType) {
                        filteredProducts.add(product);
                  }
            }

            // Convert the List to an array
            return filteredProducts.toArray(new CProducts[0]);
      }

      public static CQuestions[] getQuestionsByType(CQuestions[] allQuestions, ProductType targetType) {
        List<CQuestions> filteredQuestions = new ArrayList<>();

        for (CQuestions question : allQuestions) {
            if (question.getType() == targetType) {
                filteredQuestions.add(question);
            }
        }

        // Convert the List to an array
        return filteredQuestions.toArray(new CQuestions[0]);
      }
      
      public static CProducts[] avitableProducts(CProducts[] allProducts, CProducts selectedAttributes, CProducts notAttributes) {
            List<CProducts> avitableList = new ArrayList<>();
            CProducts[] filteredProducts = getProductsByType(allProducts,selectedAttributes.getType());
            for (CProducts product : filteredProducts) {
                  boolean hasSelectedAttributes = true;
                  boolean hasNotAttributes = false;

                  // Check selectedAttributes
                  for (ProductAttribute attribute : selectedAttributes.getAttributes()) {
                        if (!product.hasAttribute(attribute)) {
                              hasSelectedAttributes = false;
                              break;
                        }
                  }

                  // Check notAttributes
                  for (ProductAttribute attribute : notAttributes.getAttributes()) {
                        if (product.hasAttribute(attribute)) {
                              hasNotAttributes = true;
                              break;
                        }
                  }

                  // Include the product in the result array if it has selectedAttributes and does not have notAttributes
                  if (hasSelectedAttributes && !hasNotAttributes) {
                        avitableList.add(product);
                  }
            }

            // Convert the List to an array
            return avitableList.toArray(new CProducts[avitableList.size()]);
      }

      public static CQuestions[] aviableQuestions(CQuestions[] allQuestions, CProducts selectedAttributes, CProducts falseAttributes) {
        List<CQuestions> avitableList = new ArrayList<>();
        CQuestions[] filteredquestions = getQuestionsByType(allQuestions, selectedAttributes.getType());
        for (CQuestions question : filteredquestions) {
            boolean hasSelectedAttributes = true;
            boolean hasNotAttributes = false;

            // Check selectedAttributes
            for (ProductAttribute attribute : selectedAttributes.getAttributes()) {
                if (!question.hasAttribute(attribute)) {
                    hasSelectedAttributes = false;
                    break;
                }
            }

            // Check notAttributes
            for (ProductAttribute attribute : falseAttributes.getAttributes()) {
                if (question.hasAttribute(attribute)) {
                    hasNotAttributes = true;
                    break;
                }
            }

            // Include the product in the result array if it has selectedAttributes and does not have notAttributes
            if (hasSelectedAttributes && !hasNotAttributes) {
                avitableList.add(question);
            }
        }
        return avitableList.toArray(new CQuestions[avitableList.size()]);
    }
      
      public static void showQuest(CQuestions[] questions, boolean selectLastQuest) {
            Scanner scanner = new Scanner(System.in);

            // Generar un número aleatorio
            Random random = new Random();
            ArrayList<String> questionsDone = new ArrayList<>();

            boolean hasThis = true;
            do {
                  // Check if we asked all the questions minus one
                  if (questionsDone.size() == questions.length - 1 && selectLastQuest==true) {
                        for (CQuestions question : questions) {
                              if (!questionsDone.contains(question.getQuestionString())) {
                                    //selectedAttributes.setType(question.getType());
                                    insertAttibutes(question, selectedAttributes, notAttributes);
                                    hasThis = false;
                                    break;
                              }
                        }
                  }
                  else if(questionsDone.size() >= questions.length){
                        hasThis = false;
                  }
                  // Ask an other question
                  else {
                        // Rand number for the question
                        int numeroAleatorio;
                        do {
                              numeroAleatorio = random.nextInt(questions.length);
                        } while (questionsDone.contains(questions[numeroAleatorio].getQuestionString()));
                        //do while the answer is not correct
                        boolean validAn = false;
                        do {
                              System.out.println(questions[numeroAleatorio].getQuestionString());
                              String answer = scanner.nextLine();

                              if (answer.toUpperCase().equals("Y")) {
                                    validAn = true;
                                    insertAttibutes(questions[numeroAleatorio], selectedAttributes, notAttributes);
                                    hasThis = false;
                              } else if (answer.toUpperCase().equals("N")) {
                                    insertAttibutes(questions[numeroAleatorio], notAttributes, selectedAttributes);
                                    validAn = true;
                              }
                              CProducts[] possibleProducts=avitableProducts(products, selectedAttributes, notAttributes);
                              if(possibleProducts.length==1){
                              System.out.println("Your product is "+possibleProducts[0].getName()+"!");
                              //hasThis=false;
                              System.exit(0);
                              }
                        } while (validAn == false);
                        questionsDone.add(questions[numeroAleatorio].getQuestionString());
                  }
            } while (hasThis == true);
      };

      public static void insertAttibutes(CQuestions questions, CProducts attributes, CProducts alterAttributes) {
            // Types
            if (attributes.getType() != questions.getType() && questions.getType() != null) {
                  attributes.setType(questions.getType());
            }
            // Attributes
            if (!questions.getAttributes().isEmpty()) {
                  for (ProductAttribute attribute : questions.getAttributes()) {
                        if (!attributes.hasAttribute(attribute) && !alterAttributes.hasAttribute(attribute)) {
                              attributes.addAttribute(attribute);
                        }
                  }
            }
      };
      
      public static void main(String[] args) {
            // TODO code application logic here
            showQuest(primarySectionQuestions, true);
            showQuest(secondarySectionQuestions, false);
            showQuest(thirdSectionQuestions, false);
            showQuest(forthSectionQuestions, false);
      };
}
