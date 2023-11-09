/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mcakinator;

import java.util.ArrayList;
import java.util.List;

enum QuestionType {
    MAIN_COURSE,
    COMPLEMENT,
    LAST_COURSE,
    //MENU
}

enum QuestionAttribute {
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
    BEEF,
    // Add more attributes as needed
}

public class CQuestions {

    private String questionString;
    private QuestionType type;
    private List<QuestionAttribute> attributes;

    public CQuestions(String questionString, QuestionType type, List<QuestionAttribute> attributes) {
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

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

    public List<QuestionAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<QuestionAttribute> attributes) {
        this.attributes = attributes;
    }
}
