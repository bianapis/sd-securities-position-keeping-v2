package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceReportRecord
 */
public class CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceReportRecord   {
  private String securitiesPositionLogInstanceReportReference = null;

  private String securitiesPositionLogInstanceReportType = null;

  private String securitiesPositionLogInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return securitiesPositionLogInstanceReportReference
  **/

  public String getSecuritiesPositionLogInstanceReportReference() {
    return securitiesPositionLogInstanceReportReference;
  }

  public void setSecuritiesPositionLogInstanceReportReference(String securitiesPositionLogInstanceReportReference) {
    this.securitiesPositionLogInstanceReportReference = securitiesPositionLogInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return securitiesPositionLogInstanceReportType
  **/

  public String getSecuritiesPositionLogInstanceReportType() {
    return securitiesPositionLogInstanceReportType;
  }

  public void setSecuritiesPositionLogInstanceReportType(String securitiesPositionLogInstanceReportType) {
    this.securitiesPositionLogInstanceReportType = securitiesPositionLogInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return securitiesPositionLogInstanceReportParameters
  **/

  public String getSecuritiesPositionLogInstanceReportParameters() {
    return securitiesPositionLogInstanceReportParameters;
  }

  public void setSecuritiesPositionLogInstanceReportParameters(String securitiesPositionLogInstanceReportParameters) {
    this.securitiesPositionLogInstanceReportParameters = securitiesPositionLogInstanceReportParameters;
  }


}

