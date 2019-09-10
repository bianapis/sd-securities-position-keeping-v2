package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceReport
 */
public class BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceReport   {
  private Object transactionCaptureInstanceReportRecord = null;

  private String transactionCaptureInstanceReportType = null;

  private String transactionCaptureInstanceReportParameters = null;

  private Object transactionCaptureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return transactionCaptureInstanceReportRecord
  **/

  public Object getTransactionCaptureInstanceReportRecord() {
    return transactionCaptureInstanceReportRecord;
  }

  public void setTransactionCaptureInstanceReportRecord(Object transactionCaptureInstanceReportRecord) {
    this.transactionCaptureInstanceReportRecord = transactionCaptureInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return transactionCaptureInstanceReportType
  **/

  public String getTransactionCaptureInstanceReportType() {
    return transactionCaptureInstanceReportType;
  }

  public void setTransactionCaptureInstanceReportType(String transactionCaptureInstanceReportType) {
    this.transactionCaptureInstanceReportType = transactionCaptureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return transactionCaptureInstanceReportParameters
  **/

  public String getTransactionCaptureInstanceReportParameters() {
    return transactionCaptureInstanceReportParameters;
  }

  public void setTransactionCaptureInstanceReportParameters(String transactionCaptureInstanceReportParameters) {
    this.transactionCaptureInstanceReportParameters = transactionCaptureInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return transactionCaptureInstanceReport
  **/

  public Object getTransactionCaptureInstanceReport() {
    return transactionCaptureInstanceReport;
  }

  public void setTransactionCaptureInstanceReport(Object transactionCaptureInstanceReport) {
    this.transactionCaptureInstanceReport = transactionCaptureInstanceReport;
  }


}

