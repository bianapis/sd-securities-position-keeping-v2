package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceAnalysis
 */
public class CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceAnalysis   {
  private String securitiesPositionLogInstanceAnalysisReference = null;

  private String securitiesPositionLogInstanceAnalysisReportType = null;

  private String securitiesPositionLogInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return securitiesPositionLogInstanceAnalysisReference
  **/

  public String getSecuritiesPositionLogInstanceAnalysisReference() {
    return securitiesPositionLogInstanceAnalysisReference;
  }

  public void setSecuritiesPositionLogInstanceAnalysisReference(String securitiesPositionLogInstanceAnalysisReference) {
    this.securitiesPositionLogInstanceAnalysisReference = securitiesPositionLogInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return securitiesPositionLogInstanceAnalysisParameters
  **/

  public String getSecuritiesPositionLogInstanceAnalysisParameters() {
    return securitiesPositionLogInstanceAnalysisParameters;
  }

  public void setSecuritiesPositionLogInstanceAnalysisParameters(String securitiesPositionLogInstanceAnalysisParameters) {
    this.securitiesPositionLogInstanceAnalysisParameters = securitiesPositionLogInstanceAnalysisParameters;
  }


}

