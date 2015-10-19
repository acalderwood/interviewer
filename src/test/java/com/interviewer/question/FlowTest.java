package com.interviewer.question;

import com.interviewer.datamodel.Attribute;
import com.interviewer.datamodel.Entity;
import com.interviewer.party.Member;
import com.interviewer.party.Party;
import org.junit.Test;

public class FlowTest {

    @Test
    public void testFlow() {
        //Set up members
        //Add members to party
        //Member 1 asks question
        //Inform other party - expect answer
        //Ask member's party if question relevant
        //Member 2 says yes => update the number of people asking question


        Member lessee1 = new Member("lessee_1");
        Member lessee2 = new Member("lessee_2");
        Member landlord1 = new Member("landlord_1");
        Member landlord2 = new Member("landlord_2");

        Party lessees = new Party("lessees");
        lessees.addMember(lessee1);
        lessees.addMember(lessee2);

        Party landlords = new Party("landlords");
        landlords.addMember(landlord1);
        landlords.addMember(landlord2);

        Entity property = new Entity("property");
        Attribute isOverlooked = new Attribute("isOverlooked");
        property.setAttribute(isOverlooked);

        CandidateQuestion candidateQuestion = new CandidateQuestion(lessee1, landlords, "Is the house overlooked by a neighbouring property?");
//        lessee1.ask(landlords, question1);

        // Already existing question
        ResolvedQuestion resolvedQuestion = new ResolvedQuestion(lessees, landlords, "Do the neighbours overlook the property?");
//        lessee1.ask(landlords, question1);

        //Search
        //""Is the house overlooked by a neighbouring property?" has has several answers.
        // Ask "Do the neighbours overlook the property?" again?"

        //searchService.match(candidateQuestion, questionBank);
        boolean questionAlreadyAsked = false;

        ResolvedQuestion question;
        //Answer = yes
        if (!questionAlreadyAsked) {
            question = new ResolvedQuestion(candidateQuestion);
            candidateQuestion = null;
            //questionBank.add(question)
        } else {
            //Answer = no
            question = resolvedQuestion;
        }

        lessee1.ask(landlords, question);
    }
}
