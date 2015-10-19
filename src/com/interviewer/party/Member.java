package com.interviewer.party;

import com.interviewer.ui.ResolvedQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alastair on 8/22/2015.
 */
public class Member {

    private String name;
    private Party party;
    public List<ResolvedQuestion> pendingQuestions = new ArrayList<>();

    public Member(String name) {
        this.setName(name);
        System.out.println("Member '" + name + "' created");
    }

    public Member(String name, Party party) {
        this.setName(name);
        this.party = party;
        System.out.println("Member '" + name + "' created as member of Party '" + party + "'");
    }

    public void ask(Party party, ResolvedQuestion question) {
        for (Member member : party.getMembers()) {
            member.receive(question);
        }
        System.out.println("Member '" + getName() + "' asked question '" + question.getQuestionText() + "' to Party '" + party + "'");
    }

    public void receive(ResolvedQuestion question) {
        pendingQuestions.add(question);
        System.out.println("Member '" + getName() + "' of party '" + party.getName() + "' asked question '" + question.getQuestionText() + "' to Party '" + party.getName() + "'");
    }

    public List<ResolvedQuestion> getPendingQuestions() {
        return pendingQuestions;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
