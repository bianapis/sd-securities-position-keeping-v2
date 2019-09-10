package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogInitiateInputModel
 */
public class CRSecuritiesPositionLogInitiateInputModel   {
  private String securitiesPositionKeepingServicingSessionReference = null;

  private Object securitiesPositionLogInitiateActionRecord = null;

  private String securitiesPositionLogInstanceStatus = null;

  private CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecord cRSecuritiesPositionLogInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return securitiesPositionLogInitiateActionRecord
  **/

  public Object getSecuritiesPositionLogInitiateActionRecord() {
    return securitiesPositionLogInitiateActionRecord;
  }

  public void setSecuritiesPositionLogInitiateActionRecord(Object securitiesPositionLogInitiateActionRecord) {
    this.securitiesPositionLogInitiateActionRecord = securitiesPositionLogInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Securities Position Log instance (e.g. initialised, pending, active) 
   * @return securitiesPositionLogInstanceStatus
  **/

  public String getSecuritiesPositionLogInstanceStatus() {
    return securitiesPositionLogInstanceStatus;
  }

  public void setSecuritiesPositionLogInstanceStatus(String securitiesPositionLogInstanceStatus) {
    this.securitiesPositionLogInstanceStatus = securitiesPositionLogInstanceStatus;
  }


  /**
   * Get cRSecuritiesPositionLogInstanceRecord
   * @return cRSecuritiesPositionLogInstanceRecord
  **/

  public CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecord getCRSecuritiesPositionLogInstanceRecord() {
    return cRSecuritiesPositionLogInstanceRecord;
  }

  public void setCRSecuritiesPositionLogInstanceRecord(CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecord cRSecuritiesPositionLogInstanceRecord) {
    this.cRSecuritiesPositionLogInstanceRecord = cRSecuritiesPositionLogInstanceRecord;
  }


}

