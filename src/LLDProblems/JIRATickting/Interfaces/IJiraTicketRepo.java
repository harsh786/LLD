package LLDProblems.JIRATickting.Interfaces;

import LLDProblems.JIRATickting.EnumTicketStatus;
import LLDProblems.JIRATickting.JiraTicket;

public interface IJiraTicketRepo {

    public void createJiraTicket(JiraTicket ticket);

    public void assignTicket(String ticketId, String name);

    public void addDueDate(String dueDate);

    public void updateTicketStatus(String ticketState, EnumTicketStatus ticketStatus);

}
