package LLDProblems.JIRATickting;

import java.time.LocalDateTime;
import java.util.*;

public class JiraTicket {

    private String id;

    private String name;

    private String desc;

    private EnumProductName productName;

    private EnumTicketStatus ticketStatus;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String reporter;

    private String assignee;

    private LocalDateTime dueDate;

    private List<Comment> comment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public EnumProductName getProductName() {
        return productName;
    }

    public void setProductName(EnumProductName productName) {
        this.productName = productName;
    }

    public EnumTicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(EnumTicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JiraTicket that = (JiraTicket) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(desc, that.desc) && productName == that.productName && ticketStatus == that.ticketStatus && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(reporter, that.reporter) && Objects.equals(assignee, that.assignee) && Objects.equals(dueDate, that.dueDate) && Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, desc, productName, ticketStatus, createdAt, updatedAt, reporter, assignee, dueDate, comment);
    }

    @Override
    public String toString() {
        return "JiraTicket{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", productName=" + productName +
                ", ticketStatus=" + ticketStatus +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", reporter='" + reporter + '\'' +
                ", assignee='" + assignee + '\'' +
                ", dueDate=" + dueDate +
                ", comment=" + comment +
                '}';
    }
}
