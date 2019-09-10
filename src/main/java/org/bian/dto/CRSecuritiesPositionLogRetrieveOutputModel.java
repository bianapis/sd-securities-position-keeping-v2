package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSecuritiesPositionLogRetrieveOutputModelCRSecuritiesPositionLogInstanceRecord;
import org.bian.dto.CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceAnalysis;
import org.bian.dto.CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogRetrieveOutputModel
 */
public class CRSecuritiesPositionLogRetrieveOutputModel   {
  private CRSecuritiesPositionLogRetrieveOutputModelCRSecuritiesPositionLogInstanceRecord cRSecuritiesPositionLogInstanceRecord = null;

  private String securitiesPositionLogRetrieveActionTaskReference = null;

  private Object securitiesPositionLogRetrieveActionTaskRecord = null;

  private String securitiesPositionLogRetrieveActionResponse = null;

  private CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceReportRecord securitiesPositionLogInstanceReportRecord = null;

  private CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceAnalysis securitiesPositionLogInstanceAnalysis = null;


  /**
   * Get cRSecuritiesPositionLogInstanceRecord
   * @return cRSecuritiesPositionLogInstanceRecord
  **/

  public CRSecuritiesPositionLogRetrieveOutputModelCRSecuritiesPositionLogInstanceRecord getCRSecuritiesPositionLogInstanceRecord() {
    return cRSecuritiesPositionLogInstanceRecord;
  }
  @JsonProperty("cRSecuritiesPositionLogInstanceRecord")
  public void setCRSecuritiesPositionLogInstanceRecord(CRSecuritiesPositionLogRetrieveOutputModelCRSecuritiesPositionLogInstanceRecord cRSecuritiesPositionLogInstanceRecord) {
    this.cRSecuritiesPositionLogInstanceRecord = cRSecuritiesPositionLogInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Securities Position Log instance retrieve service call 
   * @return securitiesPositionLogRetrieveActionTaskReference
  **/

  public String getSecuritiesPositionLogRetrieveActionTaskReference() {
    return securitiesPositionLogRetrieveActionTaskReference;
  }

  public void setSecuritiesPositionLogRetrieveActionTaskReference(String securitiesPositionLogRetrieveActionTaskReference) {
    this.securitiesPositionLogRetrieveActionTaskReference = securitiesPositionLogRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return securitiesPositionLogRetrieveActionResponse
  **/

  public String getSecuritiesPositionLogRetrieveActionResponse() {
    return securitiesPositionLogRetrieveActionResponse;
  }

  public void setSecuritiesPositionLogRetrieveActionResponse(String securitiesPositionLogRetrieveActionResponse) {
    this.securitiesPositionLogRetrieveActionResponse = securitiesPositionLogRetrieveActionResponse;
  }


  /**
   * Get securitiesPositionLogInstanceReportRecord
   * @return securitiesPositionLogInstanceReportRecord
  **/

  public CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceReportRecord getSecuritiesPositionLogInstanceReportRecord() {
    return securitiesPositionLogInstanceReportRecord;
  }

  public void setSecuritiesPositionLogInstanceReportRecord(CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceReportRecord securitiesPositionLogInstanceReportRecord) {
    this.securitiesPositionLogInstanceReportRecord = securitiesPositionLogInstanceReportRecord;
  }


  /**
   * Get securitiesPositionLogInstanceAnalysis
   * @return securitiesPositionLogInstanceAnalysis
  **/

  public CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceAnalysis getSecuritiesPositionLogInstanceAnalysis() {
    return securitiesPositionLogInstanceAnalysis;
  }

  public void setSecuritiesPositionLogInstanceAnalysis(CRSecuritiesPositionLogRetrieveOutputModelSecuritiesPositionLogInstanceAnalysis securitiesPositionLogInstanceAnalysis) {
    this.securitiesPositionLogInstanceAnalysis = securitiesPositionLogInstanceAnalysis;
  }


}

