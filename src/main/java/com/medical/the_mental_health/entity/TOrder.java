package com.sample;


public class TOrder {

  private long id;
  private long memberId;
  private java.sql.Date orderDate;
  private String orderType;
  private String orderStatus;
  private long setmealId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMemberId() {
    return memberId;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }


  public java.sql.Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(java.sql.Date orderDate) {
    this.orderDate = orderDate;
  }


  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public long getSetmealId() {
    return setmealId;
  }

  public void setSetmealId(long setmealId) {
    this.setmealId = setmealId;
  }

}
