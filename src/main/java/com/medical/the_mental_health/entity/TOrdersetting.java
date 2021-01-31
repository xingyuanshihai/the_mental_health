package com.sample;


public class TOrdersetting {

  private long id;
  private java.sql.Date orderDate;
  private long number;
  private long reservations;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public java.sql.Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(java.sql.Date orderDate) {
    this.orderDate = orderDate;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public long getReservations() {
    return reservations;
  }

  public void setReservations(long reservations) {
    this.reservations = reservations;
  }

}
