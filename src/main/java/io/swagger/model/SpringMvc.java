package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-03-07T13:33:03.650Z")
public class SpringMvc  {
  
  private String springMvcId = null;

  
  /**
   * Data field of spring-mvc_id
   **/
  @ApiModelProperty(value = "Data field of spring-mvc_id")
  @JsonProperty("spring-mvc_id")
  public String getSpringMvcId() {
    return springMvcId;
  }
  public void setSpringMvcId(String springMvcId) {
    this.springMvcId = springMvcId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpringMvc springMvc = (SpringMvc) o;
    return Objects.equals(springMvcId, springMvc.springMvcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(springMvcId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpringMvc {\n");
    
    sb.append("  springMvcId: ").append(springMvcId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
