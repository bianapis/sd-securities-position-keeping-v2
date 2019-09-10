package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceAnalysis
 */
public class CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceAnalysis   {
  private String securitiesPositionLogInstanceAnalysisData = null;

  private String securitiesPositionLogInstanceAnalysisReportType = null;

  private Object securitiesPositionLogInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return securitiesPositionLogInstanceAnalysisData
  **/

  public String getSecuritiesPositionLogInstanceAnalysisData() {
    return securitiesPositionLogInstanceAnalysisData;
  }

  public void setSecuritiesPositionLogInstanceAnalysisData(String securitiesPositionLogInstanceAnalysisData) {
    this.securitiesPositionLogInstanceAnalysisData = securitiesPositionLogInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return securitiesPositionLogInstanceAnalysisReportType
  **/

  public String getSecuritiesPositionLogInstanceAnalysisReportType() {
    return securitiesPositionLogInstanceAnalysisReportType;
  }

  public void setSecuritiesPositionLogInstanceAnalysisReportType(String securitiesPositionLogInstanceAnalysisReportType) {
    this.securitiesPositionLogInstanceAnalysisReportType = securitiesPositionLogInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return securitiesPositionLogInstanceAnalysisReport
  **/

  public Object getSecuritiesPositionLogInstanceAnalysisReport() {
    return securitiesPositionLogInstanceAnalysisReport;
  }

  public void setSecuritiesPositionLogInstanceAnalysisReport(Object securitiesPositionLogInstanceAnalysisReport) {
    this.securitiesPositionLogInstanceAnalysisReport = securitiesPositionLogInstanceAnalysisReport;
  }


}

