package LLDProblems.JIRATickting.Interfaces;

import LLDProblems.JIRATickting.EnumTicketStatus;
import LLDProblems.JIRATickting.JiraTicket;
import LLDProblems.JIRATickting.JiraTicketServiceException;

import java.time.LocalDateTime;

public interface IJiraTicketService {

    public String createJiraTicket(JiraTicket ticket);

    public void assignTicket(String jiraId, String name) throws JiraTicketServiceException;

    public void addDueDate(String jiraId, LocalDateTime duetDate) throws JiraTicketServiceException;

    public void updateTicketStatus(String jiraId, EnumTicketStatus ticketStatus) throws JiraTicketServiceException;
}
