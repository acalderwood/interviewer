package com.interviewer.question;

import com.interviewer.party.Member;
import com.interviewer.party.Party;
import org.apache.log4j.Logger;

/**
 * Created by Alastair on 8/22/2015.
 */
public class CandidateQuestion implements Question {

    private Member questioner;
    private Party receiver;
    private String questionText;

    static Logger log = Logger.getLogger(CandidateQuestion.class);

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
