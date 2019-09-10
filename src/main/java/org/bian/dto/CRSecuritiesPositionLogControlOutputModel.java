package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogControlOutputModel
 */
public class CRSecuritiesPositionLogControlOutputModel   {
  private String securitiesPositionLogControlActionTaskReference = null;

  private Object securitiesPositionLogControlActionTaskRecord = null;

  private String securitiesPositionLogControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Securities Position Log instance control processing service call 
   * @return securitiesPositionLogControlActionTaskReference
  **/

  public String getSecuritiesPositionLogControlActionTaskReference() {
    return securitiesPositionLogControlActionTaskReference;
  }

  public void setSecuritiesPositionLogControlActionTaskReference(String securitiesPositionLogControlActionTaskReference) {
    this.securitiesPositionLogControlActionTaskReference = securitiesPositionLogControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return securitiesPositionLogControlActionTaskRecord
  **/

  public Object getSecuritiesPositionLogControlActionTaskRecord() {
    return securitiesPositionLogControlActionTaskRecord;
  }

  public void setSecuritiesPositionLogControlActionTaskRecord(Object securitiesPositionLogControlActionTaskRecord) {
    this.securitiesPositionLogControlActionTaskRecord = securitiesPositionLogControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return securitiesPositionLogControlActionResponse
  **/

  public String getSecuritiesPositionLogControlActionResponse() {
    return securitiesPositionLogControlActionResponse;
  }

  public void setSecuritiesPositionLogControlActionResponse(String securitiesPositionLogControlActionResponse) {
    this.securitiesPositionLogControlActionResponse = securitiesPositionLogControlActionResponse;
  }


}

