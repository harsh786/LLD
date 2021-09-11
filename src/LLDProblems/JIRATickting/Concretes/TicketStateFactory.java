package LLDProblems.JIRATickting.Concretes;

import LLDProblems.JIRATickting.EnumTicketStatus;
import LLDProblems.JIRATickting.Interfaces.ITicketState;
import LLDProblems.JIRATickting.JiraTicket;

public class TicketStateFactory {

    public static ITicketState getInstance(EnumTicketStatus ticketStatus, JiraTicket jiraTicket){
        ITicketState ticketState=null;
        switch (ticketStatus){
            case CREATED:
                ticketState=new CreatedTicketState(jiraTicket);
            case QA:
                ticketState=new CreatedTicketState(jiraTicket);


        }
        return ticketState;
    }
}
