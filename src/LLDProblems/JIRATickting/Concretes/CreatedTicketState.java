package LLDProblems.JIRATickting.Concretes;

import LLDProblems.JIRATickting.EnumTicketStatus;
import LLDProblems.JIRATickting.Interfaces.AbstractTicketState;
import LLDProblems.JIRATickting.Interfaces.ITicketState;
import LLDProblems.JIRATickting.JiraTicket;
import LLDProblems.JIRATickting.JiraTicketServiceException;

import java.util.*;

public class CreatedTicketState extends AbstractTicketState {
    List<EnumTicketStatus>nextValidState=null;
    public CreatedTicketState(JiraTicket jiraTicket) {
        super(jiraTicket);
        nextValidState= Arrays.asList(EnumTicketStatus.BLOCKED,EnumTicketStatus.DEVELOPMENT);
    }

    @Override
    public void updateStatus(EnumTicketStatus ticketStatus) throws JiraTicketServiceException {
        if(nextValidState.contains(ticketStatus)){
            this.jiraTicket.setTicketStatus(ticketStatus);
        }else{
            throw new JiraTicketServiceException("INVALID STATE");
        }
    }
}
