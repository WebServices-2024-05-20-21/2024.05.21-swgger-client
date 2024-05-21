package com.comarch.szkolenia.swagger.client.api.model;

import com.comarch.szkolenia.swagger.client.api.model.User;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Order  {
  
  @ApiModelProperty(value = "")
  private Integer id;

  @ApiModelProperty(value = "")
  private Date date;

  @ApiModelProperty(value = "")
  private Double sum;

public enum StateEnum {

NEW(String.valueOf("NEW")), PAID(String.valueOf("PAID")), SENT(String.valueOf("SENT")), DONE(String.valueOf("DONE"));


    private String value;

    StateEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
        for (StateEnum b : StateEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private StateEnum state;

  @ApiModelProperty(value = "")
  private User user;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Order id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get date
   * @return date
  **/
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Order date(Date date) {
    this.date = date;
    return this;
  }

 /**
   * Get sum
   * @return sum
  **/
  @JsonProperty("sum")
  public Double getSum() {
    return sum;
  }

  public void setSum(Double sum) {
    this.sum = sum;
  }

  public Order sum(Double sum) {
    this.sum = sum;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    if (state == null) {
      return null;
    }
    return state.value();
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Order state(StateEnum state) {
    this.state = state;
    return this;
  }

 /**
   * Get user
   * @return user
  **/
  @JsonProperty("user")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Order user(User user) {
    this.user = user;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.date, order.date) &&
        Objects.equals(this.sum, order.sum) &&
        Objects.equals(this.state, order.state) &&
        Objects.equals(this.user, order.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, sum, state, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

