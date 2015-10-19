package com.interviewer.question;

import com.interviewer.party.Party;
import org.apache.log4j.Logger;

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

    static Logger log = Logger.getLogger(ResolvedQuestion.class);

    public ResolvedQuestion(Party sender, Party receiver, String questionText) {
        this.setSender(sender);
        this.setReceiver(receiver);
        this.setQuestionText(questionText);
    }

    public ResolvedQuestion(CandidateQuestion candidateQuestion) {
        this.setSender(candidateQuestion.getQuestioner().getParty());
        this.setReceiver(candidateQuestion.getReceiver());
        this.setQuestionText(candidateQuestion.getQuestionText());
        log.debug("ResolvedQuestion created, text '" + candidateQuestion.getQuestionText() +
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