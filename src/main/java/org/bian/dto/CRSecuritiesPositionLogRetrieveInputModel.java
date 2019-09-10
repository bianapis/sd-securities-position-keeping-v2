package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceAnalysis;
import org.bian.dto.CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogRetrieveInputModel
 */
public class CRSecuritiesPositionLogRetrieveInputModel   {
  private Object securitiesPositionLogRetrieveActionTaskRecord = null;

  private String securitiesPositionLogRetrieveActionRequest = null;

  private CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceReportRecord securitiesPositionLogInstanceReportRecord = null;

  private CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceAnalysis securitiesPositionLogInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return securitiesPositionLogRetrieveActionTaskRecord
  **/

  public Object getSecuritiesPositionLogRetrieveActionTaskRecord() {
    return securitiesPositionLogRetrieveActionTaskRecord;
  }

  public void setSecuritiesPositionLogRetrieveActionTaskRecord(Object securitiesPositionLogRetrieveActionTaskRecord) {
    this.securitiesPositionLogRetrieveActionTaskRecord = securitiesPositionLogRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return securitiesPositionLogRetrieveActionRequest
  **/

  public String getSecuritiesPositionLogRetrieveActionRequest() {
    return securitiesPositionLogRetrieveActionRequest;
  }

  public void setSecuritiesPositionLogRetrieveActionRequest(String securitiesPositionLogRetrieveActionRequest) {
    this.securitiesPositionLogRetrieveActionRequest = securitiesPositionLogRetrieveActionRequest;
  }


  /**
   * Get securitiesPositionLogInstanceReportRecord
   * @return securitiesPositionLogInstanceReportRecord
  **/

  public CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceReportRecord getSecuritiesPositionLogInstanceReportRecord() {
    return securitiesPositionLogInstanceReportRecord;
  }

  public void setSecuritiesPositionLogInstanceReportRecord(CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceReportRecord securitiesPositionLogInstanceReportRecord) {
    this.securitiesPositionLogInstanceReportRecord = securitiesPositionLogInstanceReportRecord;
  }


  /**
   * Get securitiesPositionLogInstanceAnalysis
   * @return securitiesPositionLogInstanceAnalysis
  **/

  public CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceAnalysis getSecuritiesPositionLogInstanceAnalysis() {
    return securitiesPositionLogInstanceAnalysis;
  }

  public void setSecuritiesPositionLogInstanceAnalysis(CRSecuritiesPositionLogRetrieveInputModelSecuritiesPositionLogInstanceAnalysis securitiesPositionLogInstanceAnalysis) {
    this.securitiesPositionLogInstanceAnalysis = securitiesPositionLogInstanceAnalysis;
  }


}

