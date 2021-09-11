package LLDProblems.JIRATickting.Concretes;

import LLDProblems.JIRATickting.EnumTicketStatus;
import LLDProblems.JIRATickting.Interfaces.IJiraTicketService;
import LLDProblems.JIRATickting.Interfaces.ITicketState;
import LLDProblems.JIRATickting.JiraTicket;
import LLDProblems.JIRATickting.JiraTicketServiceException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class JiraTicketService implements IJiraTicketService {

    public static Map<String,JiraTicket> jiraTickets=null;
    static{
        jiraTickets=new HashMap<>();
    }

    public JiraTicketService(){

    }
    @Override
    public String createJiraTicket(JiraTicket ticket) {
        ticket.setId(UUID. randomUUID().toString());
        ticket.setTicketStatus(EnumTicketStatus.CREATED);
        ticket.setCreatedAt(LocalDateTime.now());
        ticket.setUpdatedAt(LocalDateTime.now());
        jiraTickets.put(ticket.getId(),ticket);
        return ticket.getId();
    }

    @Override
    public void assignTicket(String jiraId, String name) throws JiraTicketServiceException {
        if(jiraTickets.containsKey(jiraId)){
             jiraTickets.get(jiraId).setAssignee(name);;
        }else{
             throw new JiraTicketServiceException("INVALID JIRA ID");
        }

    }

    @Override
    public void addDueDate(String jiraId, LocalDateTime duetDate) throws JiraTicketServiceException {
        if(jiraTickets.containsKey(jiraId)){
            jiraTickets.get(jiraId).setDueDate(duetDate);
        }else{
            throw new JiraTicketServiceException("INVALID JIRA ID");
        }

    }

    @Override
    public void updateTicketStatus(String jiraId, EnumTicketStatus ticketStatus) throws JiraTicketServiceException {
        if(jiraTickets.containsKey(jiraId)){
            JiraTicket jiraTicket=  jiraTickets.get(jiraId);
            EnumTicketStatus currentTicketState=jiraTicket.getTicketStatus();
            ITicketState ticketState= TicketStateFactory.getInstance(currentTicketState,jiraTicket);
            ticketState.updateStatus(ticketStatus);
        }else{
            throw new JiraTicketServiceException("INVALID JIRA ID");
        }
    }
}
