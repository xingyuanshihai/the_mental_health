package com.medical.the_mental_health.entity;


public class TPermission {

  private long id;
  private String name;
  private String keyword;
  private String description;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
