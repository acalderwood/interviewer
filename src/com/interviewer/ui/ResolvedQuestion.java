package com.interviewer.ui;

import com.interviewer.party.Party;

/**
 * Created by Alastair on 8/22/2015.
 */
public class ResolvedQuestion implements Question {

    private Party sender;
    private Party receiver;
    private String questionText;
    private String attributeId;
    private String value;
    private String entityId;

    public ResolvedQuestion(Party sender, Party receiver, String questionText) {
        this.setEntityId(getEntityId());
        this.setAttributeId(getAttributeId());
    }

    public ResolvedQuestion(CandidateQuestion candidateQuestion) {
        this.setSender(candidateQuestion.getQuestioner().getParty());
        this.setReceiver(candidateQuestion.getReceiver());
        this.setQuestionText(candidateQuestion.getQuestionText());
        System.out.println("ResolvedQuestion created, text '" + candidateQuestion.getQuestionText() +
                " from CandidateQuestion");
    }

    public Party getSender() {
        return sender;
    }

    public void setSender(Party sender) {
        this.sender = sender;
    }

    public Party getReceiver() {
        return receiver;
    }

    public void setReceiver(Party receiver) {
        this.receiver = receiver;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
}