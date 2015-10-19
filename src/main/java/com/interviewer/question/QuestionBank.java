package com.interviewer.question;

import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Alastair on 8/22/2015.
 */
public class QuestionBank {

    static Logger log = Logger.getLogger(QuestionBank.class);

    private List<ResolvedQuestion> questions;

    public void addQuestion(ResolvedQuestion question) {
        questions.add(question);
    }

    public ResolvedQuestion match(CandidateQuestion candidateQuestion) {
        return null;
    }
}
