package com.interviewer.ui;

/**
 * Created by Alastair on 8/22/2015.
 */
public class Question {

    private String questionText;
    private String attributeId;
    private String value;
    private String entityId;

    public Question(String questionText, String attributeId, String entityId) {
        this.questionText = questionText;
        this.attributeId = attributeId;
        this.entityId = entityId;
    }

    public String determineEntity() {
        //find the noun(s)
        return null;
    }
}
