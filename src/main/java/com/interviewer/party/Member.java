package com.interviewer.party;

import com.interviewer.question.ResolvedQuestion;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * Created by Alastair on 8/22/2015.
 */
public class Member {

    private String name;
    private Party party;
    public List<ResolvedQuestion> pendingQuestions = new ArrayList<>();

    static Logger log = Logger.getLogger(Member.class);

    public Member(String name) {
        this.setName(name);
        log.debug("Member '" + name + "' created");
    }

    public Member(String name, Party party) {
        this.setName(name);
        this.party = party;
        log.debug("Member '" + name + "' created as member of Party '" + party + "'");
    }

    public void ask(Party party, ResolvedQuestion question) {
        log.debug("Member '" + getName() + "' asked question '" + question.getQuestionText() + "' to Party '" + party.getName() + "'");
        for (Member member : party.getMembers()) {
            member.receive(question);
        }

    }

    public void receive(ResolvedQuestion question) {
        pendingQuestions.add(question);
        log.debug("Party '" + party.getName() + "' received question '" + question.getQuestionText() + "' from Member '"  + getName() + "'");
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
