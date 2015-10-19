package com.interviewer.party;

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

    public Party(String name) {
        this.setName(name);
        System.out.println("Party '" + name + "' created");
    }

    public void addMember(Member member) {
        member.setParty(this);
        memberMap.put(member.getName(), member);
        System.out.println("Member '" + member.getName() + "' added to Party '" + name + "'");
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
