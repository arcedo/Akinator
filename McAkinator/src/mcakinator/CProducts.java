/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mcakinator;

/**
 *
 * @author arcedo & ilJacob
 */
import java.util.ArrayList;
import java.util.List;

enum ProductType {
      MAIN_COURSE,
      COMPLEMENT,
      LAST_COURSE,
      UNSPECIFIED
      //MENU
}

 enum ProductAttribute {
       //HEALTHY,
       VEGETABLES,
       LIQUID,
       FRUIT,
       MULTIPLE_FRUIT,
       HARD_SKIN,
       SOUR,
       ICE_CREAM,
       CONE,
       CELIAC,
       RED,
       POTATO,
       PIE,
       BACON,
       CHEESE,
       SOUR_CREAM,
       //IS_HEALTHY,
       BONE,
       DELUXE,
       SHARE,
       MULTIPLE_PRODUCTS,
       BALL_SHAPED,
       MULTIPLE_MEAT,
       MULTIPLE_CHEESE,
       DIFERENT_CHEESE,
       MCEXTREME,
       EGG,
       MCCRISPY,
       FLAT_BREAD,
       SALAD,
       MUSTARD,
       FISH,
       CHICKEN,
       BBQ_SAUCE,
       SEED_BREAD,
       CESAR,
       BEEF
      // Add more attributes as needed
}
public class CProducts {
      private String name;
      private ProductType type;
      private List<ProductAttribute> attributes;

      public CProducts(String name, ProductType type, List<ProductAttribute> attributes) {
            this.name = name;
            this.type = type;
            this.attributes=attributes;
      }
      
      public CProducts() {
            this.name = "";
            this.type=ProductType.UNSPECIFIED;
            this.attributes=new ArrayList<>();
      }
      
      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public void setType(ProductType type) {
        this.type = type;
      }
      
      public ProductType getType() {
        return type;
      }
      
      public List<ProductAttribute> getAttributes() {
          if (attributes == null) {
            attributes = new ArrayList<>();
        }
        return attributes;
    }
      
      public void addAttribute(ProductAttribute attribute) {
            attributes.add(attribute);
      }

      public void removeAttribute(ProductAttribute attribute) {
            attributes.remove(attribute);
      }

      public boolean hasAttribute(ProductAttribute attribute) {
            return attributes.contains(attribute);
      }
      
      public String toString() {
        return "CProducts{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", attributes=" + attributes +
                '}';
    }
}
