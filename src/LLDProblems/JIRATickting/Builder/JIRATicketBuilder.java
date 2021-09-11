package LLDProblems.JIRATickting.Builder;

import LLDProblems.JIRATickting.EnumProductName;
import LLDProblems.JIRATickting.EnumTicketStatus;
import LLDProblems.JIRATickting.JiraTicket;

import java.time.LocalDateTime;

public class JIRATicketBuilder {

    private JiraTicket ticket;

    public  JIRATicketBuilder(){
        ticket=new JiraTicket();
    }

    public JiraTicket build(){
        return ticket;
    }

    public String getId() {
        return ticket.getId();
    }

//    public JIRATicketBuilder setId(String id) {
//        ticket.setId(id);
//        return this;
//    }

    public String getName() {
        return ticket.getName();
    }

    public JIRATicketBuilder setName(String name) {
        ticket.setName(name);
        return this;
    }

    public String getDesc() {
        return ticket.getDesc();
    }

    public JIRATicketBuilder setDesc(String desc) {
        ticket.setDesc(desc);
        return this;
    }

    public EnumProductName getProductName() {
        return ticket.getProductName();
    }

    public JIRATicketBuilder setProductName(EnumProductName productName) {
        ticket.setProductName(productName);
        return this;
    }

    public EnumTicketStatus getTicketStatus() {
        return ticket.getTicketStatus();
    }

    public JIRATicketBuilder setTicketStatus(EnumTicketStatus ticketStatus) {
        ticket.setTicketStatus(ticketStatus);
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return ticket.getCreatedAt();
    }

//    public JIRATicketBuilder setCreatedAt(LocalDateTime createdAt) {
//        ticket.setCreatedAt(createdAt);
//        return this;
//    }

    public LocalDateTime getUpdatedAt() {
        return ticket.getUpdatedAt();
    }

//    public JIRATicketBuilder setUpdatedAt(LocalDateTime updatedAt) {
//        ticket.setUpdatedAt(updatedAt);
//        return this;
//    }

    public String getReporter() {
        return ticket.getReporter();
    }

    public JIRATicketBuilder setReporter(String reporter) {
        ticket.setReporter(reporter);
        return this;
    }

    public String getAssignee() {
        return ticket.getAssignee();
    }

    public JIRATicketBuilder setAssignee(String assignee) {
        ticket.setAssignee(assignee);
        return this;
    }

    public LocalDateTime getDueDate() {
        return ticket.getDueDate();
    }

    public JIRATicketBuilder setDueDate(LocalDateTime dueDate) {
        ticket.setDueDate(dueDate);
        return this;
    }


}
