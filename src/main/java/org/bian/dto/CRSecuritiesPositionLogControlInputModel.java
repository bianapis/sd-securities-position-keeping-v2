package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSecuritiesPositionLogControlInputModelSecuritiesPositionLogControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogControlInputModel
 */
public class CRSecuritiesPositionLogControlInputModel   {
  private String securitiesPositionKeepingServicingSessionReference = null;

  private String securitiesPositionLogInstanceReference = null;

  private Object securitiesPositionLogControlActionTaskRecord = null;

  private CRSecuritiesPositionLogControlInputModelSecuritiesPositionLogControlActionRequest securitiesPositionLogControlActionRequest = null;


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
   * Get securitiesPositionLogControlActionRequest
   * @return securitiesPositionLogControlActionRequest
  **/

  public CRSecuritiesPositionLogControlInputModelSecuritiesPositionLogControlActionRequest getSecuritiesPositionLogControlActionRequest() {
    return securitiesPositionLogControlActionRequest;
  }

  public void setSecuritiesPositionLogControlActionRequest(CRSecuritiesPositionLogControlInputModelSecuritiesPositionLogControlActionRequest securitiesPositionLogControlActionRequest) {
    this.securitiesPositionLogControlActionRequest = securitiesPositionLogControlActionRequest;
  }


}

