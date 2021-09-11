package LLDProblems.JIRATickting.Interfaces;

import LLDProblems.JIRATickting.EnumTicketStatus;
import LLDProblems.JIRATickting.JiraTicket;
import LLDProblems.JIRATickting.JiraTicketServiceException;

public abstract class AbstractTicketState implements ITicketState {
    protected JiraTicket jiraTicket;
    public AbstractTicketState(JiraTicket jiraTicket){
        this.jiraTicket=jiraTicket;
    }

    public abstract void updateStatus(EnumTicketStatus state) throws JiraTicketServiceException;
}
