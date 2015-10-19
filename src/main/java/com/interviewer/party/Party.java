package com.interviewer.party;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Alastair on 8/22/2015.
 */
public class Party {

    private String name;
    private Map<String, Member> memberMap = new HashMap<>();

    static Logger log = Logger.getLogger(Party.class);

    public Party(String name) {
        this.setName(name);
        log.debug("Party '" + name + "' created");
    }

    public void addMember(Member member) {
        member.setParty(this);
        memberMap.put(member.getName(), member);
        log.debug("Member '" + member.getName() + "' added to Party '" + name + "'");
    }

    public List<Member> getMembers() {
        return new ArrayList<Member>(memberMap.values());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
