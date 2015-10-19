package com.interviewer.question;

import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Alastair on 8/22/2015.
 */
public class QuestionBank {

    static Logger log = Logger.getLogger(QuestionBank.class);

    private List<CandidateQuestion> questionsInFlow;

    public void addQuestion(CandidateQuestion question) {
        questionsInFlow.add(question);
    }
}
