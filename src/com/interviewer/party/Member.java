package com.interviewer.party;

import com.interviewer.ui.Question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alastair on 8/22/2015.
 */
public class Member {

    public List<Question> pendingQuestions = new ArrayList<>();

    public void ask(List<Member> members, Question question) {
        for (Member member: members) {
            member.receive(question);
        }
    }

    public void receive(Question question) {
        pendingQuestions.add(question);
    }

    public List<Question> getPendingQuestions() {
        return pendingQuestions;
    }
}
