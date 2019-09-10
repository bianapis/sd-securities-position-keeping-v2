package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionCaptureCaptureOutputModelTransactionCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureCaptureOutputModel
 */
public class BQTransactionCaptureCaptureOutputModel   {
  private BQTransactionCaptureCaptureOutputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord = null;

  private String transactionCaptureCaptureActionTaskReference = null;

  private Object transactionCaptureCaptureActionTaskRecord = null;

  private String transactionCaptureCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get transactionCaptureInstanceRecord
   * @return transactionCaptureInstanceRecord
  **/

  public BQTransactionCaptureCaptureOutputModelTransactionCaptureInstanceRecord getTransactionCaptureInstanceRecord() {
    return transactionCaptureInstanceRecord;
  }

  public void setTransactionCaptureInstanceRecord(BQTransactionCaptureCaptureOutputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord) {
    this.transactionCaptureInstanceRecord = transactionCaptureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Capture instance capture service call 
   * @return transactionCaptureCaptureActionTaskReference
  **/

  public String getTransactionCaptureCaptureActionTaskReference() {
    return transactionCaptureCaptureActionTaskReference;
  }

  public void setTransactionCaptureCaptureActionTaskReference(String transactionCaptureCaptureActionTaskReference) {
    this.transactionCaptureCaptureActionTaskReference = transactionCaptureCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return transactionCaptureCaptureActionTaskRecord
  **/

  public Object getTransactionCaptureCaptureActionTaskRecord() {
    return transactionCaptureCaptureActionTaskRecord;
  }

  public void setTransactionCaptureCaptureActionTaskRecord(Object transactionCaptureCaptureActionTaskRecord) {
    this.transactionCaptureCaptureActionTaskRecord = transactionCaptureCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Capture structured input transaction/record 
   * @return transactionCaptureCaptureRecordReference
  **/

  public String getTransactionCaptureCaptureRecordReference() {
    return transactionCaptureCaptureRecordReference;
  }

  public void setTransactionCaptureCaptureRecordReference(String transactionCaptureCaptureRecordReference) {
    this.transactionCaptureCaptureRecordReference = transactionCaptureCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

