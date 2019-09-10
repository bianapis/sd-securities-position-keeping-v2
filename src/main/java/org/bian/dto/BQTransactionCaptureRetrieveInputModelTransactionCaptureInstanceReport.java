package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureRetrieveInputModelTransactionCaptureInstanceReport
 */
public class BQTransactionCaptureRetrieveInputModelTransactionCaptureInstanceReport   {
  private String transactionCaptureInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return transactionCaptureInstanceReportReference
  **/

  public String getTransactionCaptureInstanceReportReference() {
    return transactionCaptureInstanceReportReference;
  }

  public void setTransactionCaptureInstanceReportReference(String transactionCaptureInstanceReportReference) {
    this.transactionCaptureInstanceReportReference = transactionCaptureInstanceReportReference;
  }


}

