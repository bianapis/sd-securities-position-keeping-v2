package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceAnalysis;
import org.bian.dto.BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceReport;
import org.bian.dto.BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureRetrieveOutputModel
 */
public class BQTransactionCaptureRetrieveOutputModel   {
  private BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord = null;

  private String transactionCaptureRetrieveActionTaskReference = null;

  private Object transactionCaptureRetrieveActionTaskRecord = null;

  private String transactionCaptureRetrieveActionResponse = null;

  private BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceReport transactionCaptureInstanceReport = null;

  private BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceAnalysis transactionCaptureInstanceAnalysis = null;


  /**
   * Get transactionCaptureInstanceRecord
   * @return transactionCaptureInstanceRecord
  **/

  public BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord getTransactionCaptureInstanceRecord() {
    return transactionCaptureInstanceRecord;
  }

  public void setTransactionCaptureInstanceRecord(BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord) {
    this.transactionCaptureInstanceRecord = transactionCaptureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Capture instance retrieve service call 
   * @return transactionCaptureRetrieveActionTaskReference
  **/

  public String getTransactionCaptureRetrieveActionTaskReference() {
    return transactionCaptureRetrieveActionTaskReference;
  }

  public void setTransactionCaptureRetrieveActionTaskReference(String transactionCaptureRetrieveActionTaskReference) {
    this.transactionCaptureRetrieveActionTaskReference = transactionCaptureRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return transactionCaptureRetrieveActionResponse
  **/

  public String getTransactionCaptureRetrieveActionResponse() {
    return transactionCaptureRetrieveActionResponse;
  }

  public void setTransactionCaptureRetrieveActionResponse(String transactionCaptureRetrieveActionResponse) {
    this.transactionCaptureRetrieveActionResponse = transactionCaptureRetrieveActionResponse;
  }


  /**
   * Get transactionCaptureInstanceReport
   * @return transactionCaptureInstanceReport
  **/

  public BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceReport getTransactionCaptureInstanceReport() {
    return transactionCaptureInstanceReport;
  }

  public void setTransactionCaptureInstanceReport(BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceReport transactionCaptureInstanceReport) {
    this.transactionCaptureInstanceReport = transactionCaptureInstanceReport;
  }


  /**
   * Get transactionCaptureInstanceAnalysis
   * @return transactionCaptureInstanceAnalysis
  **/

  public BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceAnalysis getTransactionCaptureInstanceAnalysis() {
    return transactionCaptureInstanceAnalysis;
  }

  public void setTransactionCaptureInstanceAnalysis(BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceAnalysis transactionCaptureInstanceAnalysis) {
    this.transactionCaptureInstanceAnalysis = transactionCaptureInstanceAnalysis;
  }


}

