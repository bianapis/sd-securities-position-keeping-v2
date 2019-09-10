package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord
 */
public class BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord   {
  private String securitiesPostingType = null;

  private String securitiesPostingTransaction = null;

  private String securitiesPostingValueDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of securities transaction (e.g. bought amount, sold amount, dividend payment) 
   * @return securitiesPostingType
  **/

  public String getSecuritiesPostingType() {
    return securitiesPostingType;
  }

  public void setSecuritiesPostingType(String securitiesPostingType) {
    this.securitiesPostingType = securitiesPostingType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The logged securities transaction. Note the log can handle a range of transactions covering bought and sold amounts and securities instrument related transactions such as dividend payments 
   * @return securitiesPostingTransaction
  **/

  public String getSecuritiesPostingTransaction() {
    return securitiesPostingTransaction;
  }

  public void setSecuritiesPostingTransaction(String securitiesPostingTransaction) {
    this.securitiesPostingTransaction = securitiesPostingTransaction;
  }


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

