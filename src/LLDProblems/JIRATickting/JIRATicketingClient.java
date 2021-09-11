package LLDProblems.JIRATickting;

import LLDProblems.JIRATickting.Builder.JIRATicketBuilder;
import LLDProblems.JIRATickting.Concretes.JiraTicketService;
import LLDProblems.JIRATickting.Interfaces.IJiraTicketService;

import java.time.LocalDateTime;

public class JIRATicketingClient {
    public static void main(String[] args) {

        IJiraTicketService jiraTicketService=new JiraTicketService();

        JIRATicketBuilder jiraTicketBuilder=new JIRATicketBuilder();
        JiraTicket jiraTicket=  jiraTicketBuilder
                .setName("JIRA-1 Test Issue")
                .setDesc("JIRA-1 Test Desc")
                .setReporter("harsh")
                .setTicketStatus(EnumTicketStatus.CREATED)
                .setProductName(EnumProductName.ONLINE_PAYMENT)
                .build();

        String id= jiraTicketService.createJiraTicket(jiraTicket);
        System.out.println("JIRA ID is:"+id);

        try {
            jiraTicketService.assignTicket(id,"harsh");
        } catch (JiraTicketServiceException e) {
            e.printStackTrace();
        }
        try {
            jiraTicketService.addDueDate(id, LocalDateTime.now().plusDays(2));
        } catch (JiraTicketServiceException e) {
            e.printStackTrace();
        }
        System.out.println("JIRA Ticket:"+jiraTicket.toString());
        try {
            jiraTicketService.updateTicketStatus(id,EnumTicketStatus.DEVELOPMENT);
        } catch (JiraTicketServiceException e) {
            e.printStackTrace();
        }
        System.out.println("JIRA Ticket after updating state:"+jiraTicket.toString());


    }
}
