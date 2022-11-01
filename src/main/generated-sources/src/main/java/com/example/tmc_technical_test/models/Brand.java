package com.example.tmc_technical_test.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Brand model
 */
@Schema(description = "Brand model")
@Validated


public class Brand   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("brandName")
  private String brandName = null;

  public Brand id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Product identifier code
   * @return id
   **/
  @Schema(example = "1", description = "Product identifier code")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Brand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * Product identifier code
   * @return brandName
   **/
  @Schema(example = "Zara", description = "Product identifier code")
  
    public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Brand brand = (Brand) o;
    return Objects.equals(this.id, brand.id) &&
        Objects.equals(this.brandName, brand.brandName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, brandName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Brand {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
