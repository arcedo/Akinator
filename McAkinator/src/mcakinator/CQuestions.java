/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mcakinator;

import java.util.ArrayList;
import java.util.List;

public class CQuestions {

    private String questionString;
    private ProductType type;
    private List<ProductAttribute> attributes;

    public CQuestions(String questionString, ProductType type, List<ProductAttribute> attributes) {
        this.questionString = questionString;
        this.type = type;
        this.attributes = attributes;
    }
    
    public String getQuestionString() {
        return questionString;
    }

    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public List<ProductAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<>();
        }
        return attributes;
    }

    public void setAttributes(List<ProductAttribute> attributes) {
        this.attributes = attributes;
    }

    public boolean hasAttribute(ProductAttribute attribute) {
            return attributes.contains(attribute);
    }
    public String toString() {
        return "CQuestions{" +
                "name='" + questionString + '\'' +
                ", type=" + type +
                ", attributes=" + attributes +
                '}';
    }
}
