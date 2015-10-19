package com.interviewer.question;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alastair on 8/22/2015.
 */
public class QuestionBank {

    static Logger log = Logger.getLogger(QuestionBank.class);

    private List<ResolvedQuestion> questions = new ArrayList<>();

    public void addQuestion(ResolvedQuestion question) {
        questions.add(question);
        log.debug("Added question '" + question.getQuestionText() + "' to QuestionBank");
    }

    public ResolvedQuestion match(CandidateQuestion candidateQuestion) {
        log.debug("Match '" + candidateQuestion.getQuestionText() + "' with question '" + questions.get(0).getQuestionText() + "'");
        return questions.get(0);
    }
}
