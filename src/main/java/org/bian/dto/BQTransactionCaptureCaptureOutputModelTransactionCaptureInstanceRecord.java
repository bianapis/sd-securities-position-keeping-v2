package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureCaptureOutputModelTransactionCaptureInstanceRecord
 */
public class BQTransactionCaptureCaptureOutputModelTransactionCaptureInstanceRecord   {
  private String securitiesPostingValueDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date of the securities transaction  
   * @return securitiesPostingValueDate
  **/

  public String getSecuritiesPostingValueDate() {
    return securitiesPostingValueDate;
  }

  public void setSecuritiesPostingValueDate(String securitiesPostingValueDate) {
    this.securitiesPostingValueDate = securitiesPostingValueDate;
  }


}

