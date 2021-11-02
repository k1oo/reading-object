package com.chapter01;

public class TicketSeller {
  private TicketOffice ticketOffice;
  
  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }
  
  public void sellTo(Audience audience) {
    this.ticketOffice.sellTicketTo(audience);
  }
}
