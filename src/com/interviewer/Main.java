package com.interviewer;

import com.interviewer.party.Member;
import com.interviewer.ui.Question;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Member person1 = new Member();
        Member person2 = new Member();
        Member person3 = new Member();
        Member person4 = new Member();
        Member person5 = new Member();
        Member person6 = new Member();
        Member person7 = new Member();
        Member person8 = new Member();

        List<Member> allMembers = new ArrayList<>();
        Question question = new Question("Is the house overlooked by a neighbouring property?", "isOverlooked", "property");
        person2.ask(allMembers, question);

    }
}
