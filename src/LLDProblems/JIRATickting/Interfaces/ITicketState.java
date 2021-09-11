package LLDProblems.JIRATickting.Interfaces;

import LLDProblems.JIRATickting.EnumTicketStatus;
import LLDProblems.JIRATickting.JiraTicketServiceException;

public interface ITicketState {

    public void updateStatus(EnumTicketStatus ticketStatus) throws JiraTicketServiceException;
}
