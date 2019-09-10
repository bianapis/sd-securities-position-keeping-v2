package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureUpdateOutputModel
 */
public class BQTransactionCaptureUpdateOutputModel   {
  private BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord transactionCaptureInstanceRecord = null;

  private String transactionCaptureUpdateActionTaskReference = null;

  private Object transactionCaptureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return transactionCaptureUpdateActionTaskReference
  **/

  public String getTransactionCaptureUpdateActionTaskReference() {
    return transactionCaptureUpdateActionTaskReference;
  }

  public void setTransactionCaptureUpdateActionTaskReference(String transactionCaptureUpdateActionTaskReference) {
    this.transactionCaptureUpdateActionTaskReference = transactionCaptureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return transactionCaptureUpdateActionTaskRecord
  **/

  public Object getTransactionCaptureUpdateActionTaskRecord() {
    return transactionCaptureUpdateActionTaskRecord;
  }

  public void setTransactionCaptureUpdateActionTaskRecord(Object transactionCaptureUpdateActionTaskRecord) {
    this.transactionCaptureUpdateActionTaskRecord = transactionCaptureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

