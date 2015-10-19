package com.interviewer.ui;

import com.interviewer.party.Member;
import com.interviewer.party.Party;

/**
 * Created by Alastair on 8/22/2015.
 */
public class CandidateQuestion implements Question {

    private Member questioner;
    private Party receiver;
    private String questionText;

    public CandidateQuestion(Member questioner, Party receiver, String questionText) {
        this.setQuestioner(questioner);
        this.setReceiver(receiver);
        this.setQuestionText(questionText);
    }

    public Member getQuestioner() {
        return questioner;
    }

    public void setQuestioner(Member questioner) {
        this.questioner = questioner;
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
}
