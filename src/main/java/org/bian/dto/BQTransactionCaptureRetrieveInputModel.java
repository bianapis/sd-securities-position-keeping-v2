package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionCaptureRetrieveInputModelTransactionCaptureInstanceAnalysis;
import org.bian.dto.BQTransactionCaptureRetrieveInputModelTransactionCaptureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureRetrieveInputModel
 */
public class BQTransactionCaptureRetrieveInputModel   {
  private Object transactionCaptureRetrieveActionTaskRecord = null;

  private String transactionCaptureRetrieveActionRequest = null;

  private BQTransactionCaptureRetrieveInputModelTransactionCaptureInstanceReport transactionCaptureInstanceReport = null;

  private BQTransactionCaptureRetrieveInputModelTransactionCaptureInstanceAnalysis transactionCaptureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionCaptureRetrieveActionTaskRecord
  **/

  public Object getTransactionCaptureRetrieveActionTaskRecord() {
    return transactionCaptureRetrieveActionTaskRecord;
  }

  public void setTransactionCaptureRetrieveActionTaskRecord(Object transactionCaptureRetrieveActionTaskRecord) {
    this.transactionCaptureRetrieveActionTaskRecord = transactionCaptureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return transactionCaptureRetrieveActionRequest
  **/

  public String getTransactionCaptureRetrieveActionRequest() {
    return transactionCaptureRetrieveActionRequest;
  }

  public void setTransactionCaptureRetrieveActionRequest(String transactionCaptureRetrieveActionRequest) {
    this.transactionCaptureRetrieveActionRequest = transactionCaptureRetrieveActionRequest;
  }


  /**
   * Get transactionCaptureInstanceReport
   * @return transactionCaptureInstanceReport
  **/

  public BQTransactionCaptureRetrieveInputModelTransactionCaptureInstanceReport getTransactionCaptureInstanceReport() {
    return transactionCaptureInstanceReport;
  }

  public void setTransactionCaptureInstanceReport(BQTransactionCaptureRetrieveInputModelTransactionCaptureInstanceReport transactionCaptureInstanceReport) {
    this.transactionCaptureInstanceReport = transactionCaptureInstanceReport;
  }


  /**
   * Get transactionCaptureInstanceAnalysis
   * @return transactionCaptureInstanceAnalysis
  **/

  public BQTransactionCaptureRetrieveInputModelTransactionCaptureInstanceAnalysis getTransactionCaptureInstanceAnalysis() {
    return transactionCaptureInstanceAnalysis;
  }

  public void setTransactionCaptureInstanceAnalysis(BQTransactionCaptureRetrieveInputModelTransactionCaptureInstanceAnalysis transactionCaptureInstanceAnalysis) {
    this.transactionCaptureInstanceAnalysis = transactionCaptureInstanceAnalysis;
  }


}

