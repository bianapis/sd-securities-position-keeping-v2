package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionCaptureCaptureInputModelCaptureRecordType;
import org.bian.dto.BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureCaptureInputModel
 */
public class BQTransactionCaptureCaptureInputModel   {
  private String securitiesPositionLogInstanceReference = null;

  private String transactionCaptureInstanceReference = null;

  private BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord = null;

  private Object transactionCaptureCaptureActionTaskRecord = null;

  private BQTransactionCaptureCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Securities Position Log instance 
   * @return securitiesPositionLogInstanceReference
  **/

  public String getSecuritiesPositionLogInstanceReference() {
    return securitiesPositionLogInstanceReference;
  }

  public void setSecuritiesPositionLogInstanceReference(String securitiesPositionLogInstanceReference) {
    this.securitiesPositionLogInstanceReference = securitiesPositionLogInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Capture instance 
   * @return transactionCaptureInstanceReference
  **/

  public String getTransactionCaptureInstanceReference() {
    return transactionCaptureInstanceReference;
  }

  public void setTransactionCaptureInstanceReference(String transactionCaptureInstanceReference) {
    this.transactionCaptureInstanceReference = transactionCaptureInstanceReference;
  }


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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQTransactionCaptureCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQTransactionCaptureCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

