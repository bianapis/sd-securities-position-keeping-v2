package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesAmountBlock
 */
public class CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesAmountBlock   {
  private String securitiesAmountBlockType = null;

  private String priority = null;

  private String amount = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of block applied to the tracked securities position (e.g. pending, final) 
   * @return securitiesAmountBlockType
  **/

  public String getSecuritiesAmountBlockType() {
    return securitiesAmountBlockType;
  }

  public void setSecuritiesAmountBlockType(String securitiesAmountBlockType) {
    this.securitiesAmountBlockType = securitiesAmountBlockType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Priority classification for the block 
   * @return priority
  **/

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount of the block 
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


}

