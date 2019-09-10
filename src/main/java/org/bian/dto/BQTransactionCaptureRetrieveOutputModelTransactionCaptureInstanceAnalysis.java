package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceAnalysis
 */
public class BQTransactionCaptureRetrieveOutputModelTransactionCaptureInstanceAnalysis   {
  private Object transactionCaptureInstanceAnalysisRecord = null;

  private String transactionCaptureInstanceAnalysisReportType = null;

  private String transactionCaptureInstanceAnalysisParameters = null;

  private Object transactionCaptureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return transactionCaptureInstanceAnalysisRecord
  **/

  public Object getTransactionCaptureInstanceAnalysisRecord() {
    return transactionCaptureInstanceAnalysisRecord;
  }

  public void setTransactionCaptureInstanceAnalysisRecord(Object transactionCaptureInstanceAnalysisRecord) {
    this.transactionCaptureInstanceAnalysisRecord = transactionCaptureInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return transactionCaptureInstanceAnalysisReportType
  **/

  public String getTransactionCaptureInstanceAnalysisReportType() {
    return transactionCaptureInstanceAnalysisReportType;
  }

  public void setTransactionCaptureInstanceAnalysisReportType(String transactionCaptureInstanceAnalysisReportType) {
    this.transactionCaptureInstanceAnalysisReportType = transactionCaptureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return transactionCaptureInstanceAnalysisParameters
  **/

  public String getTransactionCaptureInstanceAnalysisParameters() {
    return transactionCaptureInstanceAnalysisParameters;
  }

  public void setTransactionCaptureInstanceAnalysisParameters(String transactionCaptureInstanceAnalysisParameters) {
    this.transactionCaptureInstanceAnalysisParameters = transactionCaptureInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return transactionCaptureInstanceAnalysisReport
  **/

  public Object getTransactionCaptureInstanceAnalysisReport() {
    return transactionCaptureInstanceAnalysisReport;
  }

  public void setTransactionCaptureInstanceAnalysisReport(Object transactionCaptureInstanceAnalysisReport) {
    this.transactionCaptureInstanceAnalysisReport = transactionCaptureInstanceAnalysisReport;
  }


}

