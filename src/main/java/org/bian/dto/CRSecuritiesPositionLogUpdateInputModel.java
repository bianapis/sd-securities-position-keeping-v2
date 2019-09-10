package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSecuritiesPositionLogUpdateInputModelCRSecuritiesPositionLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogUpdateInputModel
 */
public class CRSecuritiesPositionLogUpdateInputModel   {
  private String securitiesPositionKeepingServicingSessionReference = null;

  private String securitiesPositionLogInstanceReference = null;

  private CRSecuritiesPositionLogUpdateInputModelCRSecuritiesPositionLogInstanceRecord cRSecuritiesPositionLogInstanceRecord = null;

  private Object securitiesPositionLogUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return securitiesPositionKeepingServicingSessionReference
  **/

  public String getSecuritiesPositionKeepingServicingSessionReference() {
    return securitiesPositionKeepingServicingSessionReference;
  }

  public void setSecuritiesPositionKeepingServicingSessionReference(String securitiesPositionKeepingServicingSessionReference) {
    this.securitiesPositionKeepingServicingSessionReference = securitiesPositionKeepingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Securities Position Log instance 
   * @return securitiesPositionLogInstanceReference
  **/

  public String getSecuritiesPositionLogInstanceReference() {
    return securitiesPositionLogInstanceReference;
  }

  public void setSecuritiesPositionLogInstanceReference(String securitiesPositionLogInstanceReference) {
    this.securitiesPositionLogInstanceReference = securitiesPositionLogInstanceReference;
  }


  /**
   * Get cRSecuritiesPositionLogInstanceRecord
   * @return cRSecuritiesPositionLogInstanceRecord
  **/

  public CRSecuritiesPositionLogUpdateInputModelCRSecuritiesPositionLogInstanceRecord getCRSecuritiesPositionLogInstanceRecord() {
    return cRSecuritiesPositionLogInstanceRecord;
  }

  public void setCRSecuritiesPositionLogInstanceRecord(CRSecuritiesPositionLogUpdateInputModelCRSecuritiesPositionLogInstanceRecord cRSecuritiesPositionLogInstanceRecord) {
    this.cRSecuritiesPositionLogInstanceRecord = cRSecuritiesPositionLogInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return securitiesPositionLogUpdateActionTaskRecord
  **/

  public Object getSecuritiesPositionLogUpdateActionTaskRecord() {
    return securitiesPositionLogUpdateActionTaskRecord;
  }

  public void setSecuritiesPositionLogUpdateActionTaskRecord(Object securitiesPositionLogUpdateActionTaskRecord) {
    this.securitiesPositionLogUpdateActionTaskRecord = securitiesPositionLogUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

