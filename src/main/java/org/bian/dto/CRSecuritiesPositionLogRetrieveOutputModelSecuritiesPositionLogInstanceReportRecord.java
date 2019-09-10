package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceReportRecord
 */
public class CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceReportRecord   {
  private String securitiesPositionLogInstanceReportData = null;

  private String securitiesPositionLogInstanceReportType = null;

  private Object securitiesPositionLogInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return securitiesPositionLogInstanceReportData
  **/

  public String getSecuritiesPositionLogInstanceReportData() {
    return securitiesPositionLogInstanceReportData;
  }

  public void setSecuritiesPositionLogInstanceReportData(String securitiesPositionLogInstanceReportData) {
    this.securitiesPositionLogInstanceReportData = securitiesPositionLogInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return securitiesPositionLogInstanceReport
  **/

  public Object getSecuritiesPositionLogInstanceReport() {
    return securitiesPositionLogInstanceReport;
  }

  public void setSecuritiesPositionLogInstanceReport(Object securitiesPositionLogInstanceReport) {
    this.securitiesPositionLogInstanceReport = securitiesPositionLogInstanceReport;
  }


}

