package com.interviewer.ui;

import java.util.List;

/**
 * Created by Alastair on 8/22/2015.
 */
public class QuestionBank {

    private List<CandidateQuestion> questionsInFlow;

    public void addQuestion(CandidateQuestion question) {
        questionsInFlow.add(question);
    }
}
