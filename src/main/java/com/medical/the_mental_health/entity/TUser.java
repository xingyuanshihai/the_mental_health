package com.medical.the_mental_health.entity;


public class TUser {

  private long id;
  private java.sql.Date birthday;
  private String gender;
  private String username;
  private String password;
  private String remark;
  private String station;
  private String telephone;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getStation() {
    return station;
  }

  public void setStation(String station) {
    this.station = station;
  }


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

}
