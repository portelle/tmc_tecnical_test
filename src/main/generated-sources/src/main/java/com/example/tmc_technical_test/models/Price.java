package com.example.tmc_technical_test.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Price model that represents the applicable price duringa period of time for a product
 */
@Schema(description = "Price model that represents the applicable price duringa period of time for a product")
@Validated


public class Price   {
  @JsonProperty("brandId")
  private Integer brandId = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("priceList")
  private Integer priceList = null;

  @JsonProperty("productId")
  private Integer productId = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  @JsonProperty("currency")
  private String currency = null;

  public Price brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Foreign key that represents the brand
   * @return brandId
   **/
  @Schema(example = "1", description = "Foreign key that represents the brand")
  
    public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public Price startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Beginning of the price validity
   * @return startDate
   **/
  @Schema(description = "Beginning of the price validity")
  
    @Valid
    public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Price endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Ending of the price validity
   * @return endDate
   **/
  @Schema(description = "Ending of the price validity")
  
    @Valid
    public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Price priceList(Integer priceList) {
    this.priceList = priceList;
    return this;
  }

  /**
   * Identifier of the applicable price list
   * @return priceList
   **/
  @Schema(example = "1", description = "Identifier of the applicable price list")
  
    public Integer getPriceList() {
    return priceList;
  }

  public void setPriceList(Integer priceList) {
    this.priceList = priceList;
  }

  public Price productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Product identifier code
   * @return productId
   **/
  @Schema(example = "12345", description = "Product identifier code")
  
    public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public Price priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * If there are two coincident prices on the same data range highest priority (highest number) should be used.
   * @return priority
   **/
  @Schema(example = "9", description = "If there are two coincident prices on the same data range highest priority (highest number) should be used.")
  
    public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Price price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Final selling price
   * @return price
   **/
  @Schema(example = "99.99", description = "Final selling price")
  
    @Valid
    public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Price currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency name as defined on the ISO 4217
   * @return currency
   **/
  @Schema(example = "EUR", description = "Currency name as defined on the ISO 4217")
  
  @Pattern(regexp="^[A-Z]{3}$")   public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.brandId, price.brandId) &&
        Objects.equals(this.startDate, price.startDate) &&
        Objects.equals(this.endDate, price.endDate) &&
        Objects.equals(this.priceList, price.priceList) &&
        Objects.equals(this.productId, price.productId) &&
        Objects.equals(this.priority, price.priority) &&
        Objects.equals(this.price, price.price) &&
        Objects.equals(this.currency, price.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, startDate, endDate, priceList, productId, priority, price, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
