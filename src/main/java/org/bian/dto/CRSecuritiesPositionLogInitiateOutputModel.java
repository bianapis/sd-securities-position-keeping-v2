package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogInitiateOutputModel
 */
public class CRSecuritiesPositionLogInitiateOutputModel   {
  private String securitiesPositionLogInstanceReference = null;

  private String securitiesPositionLogInitiateActionReference = null;

  private Object securitiesPositionLogInitiateActionRecord = null;

  private String securitiesPositionLogInstanceStatus = null;

  private CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecord cRSecuritiesPositionLogInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return securitiesPositionLogInitiateActionReference
  **/

  public String getSecuritiesPositionLogInitiateActionReference() {
    return securitiesPositionLogInitiateActionReference;
  }

  public void setSecuritiesPositionLogInitiateActionReference(String securitiesPositionLogInitiateActionReference) {
    this.securitiesPositionLogInitiateActionReference = securitiesPositionLogInitiateActionReference;
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

  public CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecord getCRSecuritiesPositionLogInstanceRecord() {
    return cRSecuritiesPositionLogInstanceRecord;
  }
  @JsonProperty("cRSecuritiesPositionLogInstanceRecord")
  public void setCRSecuritiesPositionLogInstanceRecord(CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecord cRSecuritiesPositionLogInstanceRecord) {
    this.cRSecuritiesPositionLogInstanceRecord = cRSecuritiesPositionLogInstanceRecord;
  }


}

