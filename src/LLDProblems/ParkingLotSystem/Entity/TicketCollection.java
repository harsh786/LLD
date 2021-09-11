package LLDProblems.ParkingLotSystem.Entity;

import java.util.HashMap;
import java.util.Map;

public class TicketCollection {
    private Map<String,Ticket> ticketMap;
    public TicketCollection(){
        ticketMap=new HashMap<>();
    }
    public Map<String, Ticket> getTicketMap() {
        return ticketMap;
    }

    public void setTicketMap(Map<String, Ticket> ticketMap) {
        this.ticketMap = ticketMap;
    }

    public void addTicket(Ticket ticket){
        ticketMap.put(ticket.getTicketId(),ticket);
    }



}
