/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcakinator;

/**
 *
 * @author marcel y arcedo
 */
import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class McAkinator {

      public static CProducts[] products = new CProducts[]{
            //Last Course
            new CProducts("Danonino", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.LIQUID, ProductAttribute.CELIAC, ProductAttribute.FRUIT)),
            //FRUTA
            new CProducts("Apple Pie", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.PIE)),
            new CProducts("Frutibrocheta", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.MULTIPLE_PRODUCTS, ProductAttribute.CELIAC)),
            new CProducts("Melon", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.HARD_SKIN, ProductAttribute.CELIAC)),
            new CProducts("Pineapple", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.HARD_SKIN, ProductAttribute.SOUR, ProductAttribute.CELIAC)),
            new CProducts("Apple", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.CELIAC)),
            //Ice Cream
            new CProducts("Ice cream Cone", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM, ProductAttribute.CONE)),
            new CProducts("Sundae", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM, ProductAttribute.CELIAC)),
            new CProducts("McFlurry", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM)),
            //Complements
            //Healthy
            new CProducts("Field salad", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SALAD, ProductAttribute.VEGETABLES, ProductAttribute.CELIAC)),
            new CProducts("Happy Cherritos", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.RED, ProductAttribute.VEGETABLES, ProductAttribute.CELIAC)),
            new CProducts("Gazpacho", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.RED, ProductAttribute.LIQUID, ProductAttribute.VEGETABLES, ProductAttribute.CELIAC)),
            //Potatoes
            //Normal Fries
            new CProducts("Potato Fries", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.VEGETABLES, ProductAttribute.CELIAC)),
            new CProducts("Top Fries Bacon & Cheese", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.VEGETABLES, ProductAttribute.CHEESE, ProductAttribute.BACON, ProductAttribute.CELIAC)),
            new CProducts("McShaker Fries Sour Cream", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.VEGETABLES, ProductAttribute.SOUR)),
            //Deluxe Fries
            new CProducts("Potato Fries Deluxe", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.DELUXE, ProductAttribute.VEGETABLES, ProductAttribute.CELIAC)),
            new CProducts("Top Fries Bacon & Cheese Deluxe", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.BACON, ProductAttribute.DELUXE,ProductAttribute.CELIAC)),
            new CProducts("Fries Sour Cream", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.SOUR, ProductAttribute.VEGETABLES, ProductAttribute.DELUXE)),
            //Chicken 
            new CProducts("ShareBox 25 McNuggets", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SHARE, ProductAttribute.CHICKEN)),
            new CProducts("ShareBox 10 McNuggets y 10  Chicken wings", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SHARE, ProductAttribute.MULTIPLE_PRODUCTS, ProductAttribute.CHICKEN)),
            new CProducts("McBites", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.BALL_SHAPED, ProductAttribute.CHICKEN)),
            new CProducts("Chicken wings", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.BONE, ProductAttribute.CHICKEN)),
            new CProducts("McNuggets", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHICKEN)),
            //Main Course
            //Salad 
            //Cesar
            new CProducts("Salad Chicken Cesar", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES, ProductAttribute.CHICKEN, ProductAttribute.SALAD, ProductAttribute.CESAR, ProductAttribute.CHEESE)),
            new CProducts("Salad Cesar", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES, ProductAttribute.SALAD, ProductAttribute.CESAR, ProductAttribute.CHEESE)),
            //Honey Mustad
            new CProducts("Salad Chicken Honey Mustad", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES, ProductAttribute.CHICKEN, ProductAttribute.SALAD, ProductAttribute.MUSTARD, ProductAttribute.CHEESE)),
            new CProducts("Salad Honey Mustad", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.VEGETABLES, ProductAttribute.SALAD, ProductAttribute.MUSTARD, ProductAttribute.CHEESE)),
            // BURGIR
            //ALL THE HAMBURGERS MUST HAVE BEEF, CHICKEN OR FISH AND MOST OF THEM MAY HAVE VEGETABLES, CHEESE AND SEED_BREAD.
            //BEEF
            new CProducts("Big Mac", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.MULTIPLE_MEAT, ProductAttribute.SEED_BREAD, ProductAttribute.CELIAC)),
            new CProducts("MCRoyal Deluxe", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.DELUXE, ProductAttribute.BEEF, ProductAttribute.CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.SEED_BREAD, ProductAttribute.CELIAC)),
            new CProducts("Quarter Pounder", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.CHEESE, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.SEED_BREAD, ProductAttribute.MUSTARD, ProductAttribute.CELIAC)),
            new CProducts("Duoble Quarter Punder", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MULTIPLE_MEAT, ProductAttribute.BEEF, ProductAttribute.CHEESE, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.SEED_BREAD, ProductAttribute.MUSTARD, ProductAttribute.CELIAC)),
            new CProducts("Happy Meal Burguer", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.VEGETABLES, ProductAttribute.MUSTARD, ProductAttribute.CELIAC)),
            new CProducts("Cheeseburger", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.VEGETABLES, ProductAttribute.MUSTARD, ProductAttribute.CHEESE, ProductAttribute.CELIAC)),
            // DOUBLE AND TRIPLE CHEESE BURGUER ARE THE SAME.
            new CProducts("Double or Triple Cheeseburguer", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.MULTIPLE_MEAT, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.MUSTARD, ProductAttribute.CHEESE, ProductAttribute.CELIAC)),
            //new CProducts("Triple Cheeseburguer", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.MULTIPLE_MEAT, ProductAttribute.MULTIPLE_CHEESE,  ProductAttribute.VEGETABLES, ProductAttribute.MUSTARD, ProductAttribute.CHEESE, ProductAttribute.CELIAC)),
            new CProducts("McExtreme Bacon", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.CHEESE, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.BEEF, ProductAttribute.SEED_BREAD, ProductAttribute.CELIAC)),
            new CProducts("Double McExtreme Bacon", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.CHEESE, ProductAttribute.MULTIPLE_MEAT, ProductAttribute.BEEF, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.SEED_BREAD, ProductAttribute.CELIAC)),
            new CProducts("McExtreme Three Cheeses", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.CHEESE, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.DIFERENT_CHEESE, ProductAttribute.BEEF, ProductAttribute.SEED_BREAD)),
            new CProducts("Duoble McExtreme Three Cheeses", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.CHEESE, ProductAttribute.MULTIPLE_MEAT, ProductAttribute.MULTIPLE_CHEESE, ProductAttribute.DIFERENT_CHEESE, ProductAttribute.BEEF, ProductAttribute.SEED_BREAD)),
            new CProducts("McExtreme BBQ Bourbon Egg", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.CHEESE, ProductAttribute.BEEF, ProductAttribute.EGG, ProductAttribute.BBQ_SAUCE)),
            new CProducts("Duoble McExtreme BBQ Bourbon Egg", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCEXTREME, ProductAttribute.BACON, ProductAttribute.VEGETABLES, ProductAttribute.CHEESE, ProductAttribute.BEEF, ProductAttribute.MULTIPLE_MEAT, ProductAttribute.EGG, ProductAttribute.BBQ_SAUCE)),
            //CHICKEN
            new CProducts("McChicken", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.VEGETABLES, ProductAttribute.SEED_BREAD)),
            new CProducts("CBO", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.VEGETABLES, ProductAttribute.CHEESE, ProductAttribute.BACON, ProductAttribute.SEED_BREAD)),
            new CProducts("McCrispy Original", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCCRISPY, ProductAttribute.VEGETABLES, ProductAttribute.CHICKEN, ProductAttribute.CHEESE)),
            new CProducts("McCrispy BBQ&Bacon", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MCCRISPY, ProductAttribute.BACON, ProductAttribute.CHICKEN, ProductAttribute.CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.BBQ_SAUCE)),
            new CProducts("Chicken & Cheese", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.BBQ_SAUCE)),
            new CProducts("McWrap Crispy Chicken & Bacon", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.FLAT_BREAD, ProductAttribute.CHICKEN, ProductAttribute.CHEESE, ProductAttribute.VEGETABLES, ProductAttribute.BACON)),
            new CProducts("Chicken Burguer BBQ", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.VEGETABLES, ProductAttribute.BBQ_SAUCE)),
            new CProducts("Chiken Burger Kids", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN)),
            new CProducts("Chicken Mayo", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.VEGETABLES)),
            // DOUBLE AND TRIPLE CHIKEN MAYO ARE THE SAME
            new CProducts("Double or Triple Chicken Mayo", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.VEGETABLES, ProductAttribute.MULTIPLE_MEAT)),
            //new CProducts("Triple Chicken Mayo", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.VEGETABLES, ProductAttribute.MULTIPLE_MEAT)),
            //FISH
            new CProducts("Filet-O-Fish", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.FISH, ProductAttribute.CHEESE)),
            new CProducts("McFish", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.FISH)),};

      //QUESTIONS
      public static CQuestions[] primarySectionQuestions = new CQuestions[]{
            //MAIN QUESTIONS
            new CQuestions("Are you thinking about a dessert?", ProductType.LAST_COURSE, null),
            new CQuestions("Are you thinking about a complement?", ProductType.COMPLEMENT, null),
            new CQuestions("Are you thinking about a main course?", ProductType.MAIN_COURSE, null),};

      //Esta podria ser la primera pregunta porque solo hay dos productos liquidos y sabiendo el type se puede adivinar
      public static CQuestions[] secondarySectionQuestions = new CQuestions[]{
            //SECONDARY QUESTIONS
            new CQuestions("Does your product have a liquid consistency?", null, Arrays.asList(ProductAttribute.LIQUID)),
            new CQuestions("Does your product contain vegetables?", null, Arrays.asList(ProductAttribute.VEGETABLES)),
            new CQuestions("Does it have bacon?", null, Arrays.asList(ProductAttribute.BACON)),
            new CQuestions("Does it have cheese?", null, Arrays.asList(ProductAttribute.CHEESE)),
            new CQuestions("Is the product sour?", null, Arrays.asList(ProductAttribute.SOUR)),
            new CQuestions("Does it include multiple products?", null, Arrays.asList(ProductAttribute.MULTIPLE_PRODUCTS)),
            new CQuestions("Is your product for people with celiac disease?", null, Arrays.asList(ProductAttribute.CELIAC)),
            new CQuestions("Does it include multiple slices of meat?", null, Arrays.asList(ProductAttribute.MULTIPLE_MEAT)),
            new CQuestions("Does it have egg?", null, Arrays.asList(ProductAttribute.EGG)),
            new CQuestions("Does it include different types of cheese?", null, Arrays.asList(ProductAttribute.DIFERENT_CHEESE)),
            new CQuestions("Does it include mustard sauce?", null, Arrays.asList( ProductAttribute.MUSTARD)),
      };

      public static CQuestions[] thirdSectionQuestions = new CQuestions[]{
            //Last course
            // Solo hacer una pregunta de estas dos porque si no es una cosa es la otra
            new CQuestions("Is your product a fruit?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT)),
            new CQuestions("Is your product an ice cream?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM)),
            // Complements
            new CQuestions("Is your product red?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.RED)),
            //Ponemos esta pregunta como secundaria?? Porque se repite con la de main course
            new CQuestions("Is your product a salad?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.SALAD)),
            new CQuestions("Does your product have potatoes?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO)),
            new CQuestions("Does your product have chicken?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHICKEN)),
            //Main course
            new CQuestions("Is your product a salad?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.SALAD)),
            new CQuestions("Does the product contain chicken?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN)),
            new CQuestions("Does the product contain fish?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.FISH)),
            new CQuestions("Does the product contain beef?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF)),};

      public static CQuestions[] forthSectionQuestions = new CQuestions[]{
            //Last course
            //Fruit
            new CQuestions("Does your product contain multiple fruits?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.MULTIPLE_FRUIT)),
            new CQuestions("Is your product a pie?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.PIE)),
            new CQuestions("Does the fruit have a hard skin?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT, ProductAttribute.HARD_SKIN)),
            //new CQuestions("Your fruit is sour?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.FRUIT,ProductAttribute.SOUR)),
            //Ice cream
            new CQuestions("Does the ice cream come in a cone?", ProductType.LAST_COURSE, Arrays.asList(ProductAttribute.ICE_CREAM, ProductAttribute.CONE)),
            //Complements
            // Potato
            new CQuestions("Are the potatoes Deluxe?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.POTATO, ProductAttribute.DELUXE, ProductAttribute.VEGETABLES)),
            //Chicken
            new CQuestions("Does the product name have \"Share\"?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.SHARE)),
            new CQuestions("Does it come in a ball shaped form?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.BALL_SHAPED)),
            new CQuestions("Does the product have bones in it?", ProductType.COMPLEMENT, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.BONE)),
            //Main Course
            //SALADS
            new CQuestions("Does it include cesar sauce?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.SALAD, ProductAttribute.CESAR)),
            //BEEF
            //new CQuestions("Does your hamburger have mustard sauce in it?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.MUSTARD)),
            new CQuestions("Does the product have seed bread?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.SEED_BREAD)),
            new CQuestions("Does it include multiple slices of cheese?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.MULTIPLE_MEAT)),
            new CQuestions("Does the product belong to the familly McExtreme?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.MCEXTREME)),
            new CQuestions("Does the product have BBQ sauce?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.BEEF, ProductAttribute.BBQ_SAUCE)),
            //Chicken
            new CQuestions("Does the product have seed bread?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.SEED_BREAD)),
            new CQuestions("Does the product belong to the familly McCrispy?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.MCCRISPY)),
            new CQuestions("Does the product have flat bread?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.FLAT_BREAD)),
            new CQuestions("Does the product have BBQ sauce?", ProductType.MAIN_COURSE, Arrays.asList(ProductAttribute.CHICKEN, ProductAttribute.BBQ_SAUCE)),};

      static Scanner scanner = new Scanner(System.in);
      public static CProducts selectedAttributes = new CProducts();
      public static CProducts notAttributes = new CProducts();
      public static CQuestions[] avtQuestions;

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

            if (targetType == ProductType.UNSPECIFIED) {
                  filteredQuestions = Arrays.asList(allQuestions);
            } else {
                  for (CQuestions question : allQuestions) {
                        if (question.getType() == targetType || question.getType() == null) {
                              filteredQuestions.add(question);
                        }
                  }
            }
            // Convert the List to an array
            return filteredQuestions.toArray(new CQuestions[0]);
      }

      public static CProducts[] aviableProducts(CProducts[] allProducts, CProducts selectedAttributes, CProducts notAttributes) {
            List<CProducts> avitableList = new ArrayList<>();
            CProducts[] filteredProducts = getProductsByType(allProducts, selectedAttributes.getType());
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

      public static CQuestions[] aviableQuestionsV2(CQuestions[] allQuestions, CProducts selectedAttributes, CProducts falseAttributes, boolean filter1, boolean filter2, boolean filter3, boolean filter4) {
            //PRIMERO CREAMOS DONDE ALMAZENAR LAS POSIBLES PREGUNTAS
            List<CQuestions> aviableList = new ArrayList<>();
            CQuestions[] filteredquestions = getQuestionsByType(allQuestions, selectedAttributes.getType());
            CProducts[] possibleProducts;
            //LLAMAMOS A QUE NOS DEN LOS POSIBLES PRODUCTOS

            //possibleProducts = aviableProducts(products, selectedAttributes, falseAttributes);
            /*for (int i = 0; i < possibleProducts.length; i++) {
                System.out.println(" - " + i + ": " + possibleProducts[i].toString());
            }*/
            if (filter1 == true) {
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
                              aviableList.add(question);
                        }
                  }
            } else if (filter2 == true) {
                  for (CQuestions question : filteredquestions) {
                        boolean hasSelectedAttributes = false;
                        boolean hasNotAttributes = false;
                        boolean hasAttributesProducts = false;

                        // Check selectedAttributes
                        for (ProductAttribute attribute : selectedAttributes.getAttributes()) {
                              if (question.hasAttribute(attribute)) {
                                    hasSelectedAttributes = true;
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

                        possibleProducts = aviableProducts(products, selectedAttributes, falseAttributes);
                        for (int i = 0; i < possibleProducts.length; i++) {
                              for (ProductAttribute attribute : possibleProducts[i].getAttributes()) {
                                    if (question.hasAttribute(attribute)) {
                                          hasAttributesProducts = true;
                                          break;
                                    }
                              }
                        }

                        // Include the product in the result array if it has selectedAttributes and does not have notAttributes
                        if (!hasSelectedAttributes && hasAttributesProducts) {
                              aviableList.add(question);
                        }
                  }
            } else if (filter3 == true) {
                  for (CQuestions question : filteredquestions) {
                        boolean hasSelectedAttributes = false;
                        boolean hasNotAttributes = false;
                        boolean hasAttributesProducts = false;

                        // Check selectedAttributes
                        for (ProductAttribute attribute : selectedAttributes.getAttributes()) {
                              if (question.hasAttribute(attribute)) {
                                    hasSelectedAttributes = true;
                                    break;
                              }
                        }

                        possibleProducts = aviableProducts(products, selectedAttributes, falseAttributes);
                        for (int i = 0; i < possibleProducts.length; i++) {
                              for (ProductAttribute attribute : possibleProducts[i].getAttributes()) {
                                    //System.out.println("Product Attribute: " + attribute);
                                    //System.out.println("Question attribute: " + question.getAttributes());
                                    if (question.hasAttribute(attribute)) {
                                          hasAttributesProducts = true;
                                          break;
                                    }
                              }
                        }

                        // Include the product in the result array if it has selectedAttributes and does not have notAttributes
                        if (!hasSelectedAttributes && hasAttributesProducts == true) {
                              aviableList.add(question);
                        }
                  }
            } else if (filter4 == true) {
                  for (CQuestions question : filteredquestions) {
                        boolean hasSelectedAttributes = false;
                        boolean hasNotAttributes = false;
                        boolean hasAttributesProducts = false;

                        // Check selectedAttributes
                        for (ProductAttribute attribute : selectedAttributes.getAttributes()) {
                              if (question.hasAttribute(attribute)) {
                                    hasSelectedAttributes = true;
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
                        //System.out.println("\n");

                        possibleProducts = aviableProducts(products, selectedAttributes, falseAttributes);
                        for (int i = 0; i < possibleProducts.length; i++) {
                              for (ProductAttribute attribute : possibleProducts[i].getAttributes()) {
                                    //System.out.println("Product Attribute: " + attribute);
                                    //System.out.println("Question attribute: " + question.getAttributes());
                                    if (question.hasAttribute(attribute)) {
                                          hasAttributesProducts = true;
                                          break;
                                    }
                              }
                        }

                        // Include the product in the result array if it has selectedAttributes and does not have notAttributes
                        if (hasSelectedAttributes == true && hasAttributesProducts == true) {
                              aviableList.add(question);
                        }
                  }
            }
            return aviableList.toArray(new CQuestions[aviableList.size()]);
      }

      public static boolean showQuestionV3(CQuestions[] questions, boolean filter1, boolean filter2, boolean filter3, boolean filter4) {
            // Generar un número aleatorio
            Random random = new Random();
            ArrayList<String> questionsDone = new ArrayList<>();
            boolean foundProduct = false;
            //Iniciamos primer buvle
            boolean hasThis = true;
            do {
                  avtQuestions = aviableQuestionsV2(questions, selectedAttributes, notAttributes, filter1, filter2, filter3, filter4);
                  // Check if we asked all the questions minus one
                  if (questionsDone.size() == questions.length - 1 && filter1 == true) {
                        for (CQuestions question : questions) {
                              if (!questionsDone.contains(question.getQuestionString())) {
                                    //selectedAttributes.setType(question.getType());
                                    insertAttibutes(question, selectedAttributes, notAttributes);
                                    hasThis = false;
                                    break;
                              }
                        }
                  } else if (questionsDone.size() >= questions.length) {
                        hasThis = false;
                  } // Ask an other question
                  else if (avtQuestions.length > 0) {
                        //System.out.println("Possible Questions" + Arrays.toString(avtQuestions));
                        // Rand number for the question
                        int numeroAleatorio;
                        do {
                              numeroAleatorio = random.nextInt(avtQuestions.length);
                        } while (questionsDone.contains(avtQuestions[numeroAleatorio].getQuestionString()));

                        boolean validAn = false;
                        do {
                              System.out.printf("  " + avtQuestions[numeroAleatorio].getQuestionString() + " ");
                              String answer = scanner.nextLine();

                              if (answer.toUpperCase().equals("Y")) {
                                    validAn = true;
                                    insertAttibutes(avtQuestions[numeroAleatorio], selectedAttributes, notAttributes);
                                    if (filter1 == true) {
                                          hasThis = false;
                                    }
                              } else if (answer.toUpperCase().equals("N")) {
                                    insertAttibutes(avtQuestions[numeroAleatorio], notAttributes, selectedAttributes);
                                    validAn = true;
                              }
                              CProducts[] possibleProducts = aviableProducts(products, selectedAttributes, notAttributes);
                              if (possibleProducts.length == 1) {
                                    System.out.println("  ~ Your product is " + possibleProducts[0].getName() + "!");
                                    //hasThis=false;
                                    //System.exit(0);
                                    foundProduct = true;
                                    hasThis = false;
                                    break;
                              }
                        } while (validAn == false);
                        questionsDone.add(avtQuestions[numeroAleatorio].getQuestionString());
                  } else {
                        hasThis = false;
                        CProducts[] possibleProducts = aviableProducts(products, selectedAttributes, notAttributes);
                        if (possibleProducts.length == 1) {
                              System.out.println("  ~ Your product is " + possibleProducts[0].getName() + "!");
                              foundProduct = true;
                              break;
                        } else if (possibleProducts.length == 0 && notFound == false) {
                              System.out.println("  ~ There's no product with those characteristics! :(");
                              notFound = true;
                        }
                  }
            } while (hasThis == true);
            return foundProduct;
      }

      //public static void showQuestForSecondaryState
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
      }

      public static void audioMcDonalds() {
            try {
                  // Cargar el archivo de audio
                  File archivoDeAudio = new File("src/mcakinator/mcSound.wav");
                  AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoDeAudio);

                  // Obtener el clip
                  Clip clip = AudioSystem.getClip();

                  // Abrir el flujo de audio y asignarlo al clip
                  clip.open(audioInputStream);

                  // Iniciar la reproducción
                  clip.start();

                  // Esperar hasta que la reproducción finalice
                  while (!clip.isRunning()) {
                        Thread.sleep(0);
                  }
                  while (clip.isRunning()) {
                        Thread.sleep(0);
                  }

                  // Cerrar el clip y el flujo de audio
                  clip.close();
                  audioInputStream.close();
            } catch (Exception e) {
                  e.printStackTrace();
            }
      }
      static boolean notFound = false;

      public static void main(String[] args) {
            // TODO code application logic here
            boolean stilPlaying = true;
            audioMcDonalds();
            System.out.println("<McKinator/>");
            System.out.println(" *All the questions must be answered with Y/y (yes) or N/n (no)*\n");
            while (stilPlaying == true) {
                  boolean founded;
                  founded = showQuestionV3(primarySectionQuestions, true, false, false, false);
                  //System.out.println("\n secondary Section ------\n");
                  if (founded == false) {
                        founded = showQuestionV3(secondarySectionQuestions, false, true, false, false);
                  }
                  //System.out.println("\nthird Section ------ \n");
                  if (founded == false) {
                        founded = showQuestionV3(thirdSectionQuestions, false, false, true, false);
                  }
                  //System.out.println("\n Forth Section ------ \n");
                  if (founded == false) {
                        showQuestionV3(forthSectionQuestions, false, false, false, true);
                  }
                  boolean validAnsw = false;
                  do {
                        System.out.printf("\n - Do you want to play again? ");
                        String answer = scanner.nextLine();
                        if (answer.toUpperCase().equals("N") || answer.toUpperCase().equals("Y")) {
                              if ("N".equals(answer.toUpperCase())) {
                                    System.out.println("I'm loving it!");
                                    stilPlaying = false;
                              }
                              validAnsw = true;
                        }
                  } while (validAnsw == false);
                  if (stilPlaying == true) {
                        selectedAttributes = new CProducts();
                        notAttributes = new CProducts();
                        notFound = false;
                  }
            }
      }
;
}
