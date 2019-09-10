package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSecuritiesPositionLogUpdateInputModelCRSecuritiesPositionLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogUpdateOutputModel
 */
public class CRSecuritiesPositionLogUpdateOutputModel   {
  private CRSecuritiesPositionLogUpdateInputModelCRSecuritiesPositionLogInstanceRecord cRSecuritiesPositionLogInstanceRecord = null;

  private String securitiesPositionLogUpdateActionTaskReference = null;

  private Object securitiesPositionLogUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRSecuritiesPositionLogInstanceRecord
   * @return cRSecuritiesPositionLogInstanceRecord
  **/

  public CRSecuritiesPositionLogUpdateInputModelCRSecuritiesPositionLogInstanceRecord getCRSecuritiesPositionLogInstanceRecord() {
    return cRSecuritiesPositionLogInstanceRecord;
  }
  @JsonProperty("cRSecuritiesPositionLogInstanceRecord")
  public void setCRSecuritiesPositionLogInstanceRecord(CRSecuritiesPositionLogUpdateInputModelCRSecuritiesPositionLogInstanceRecord cRSecuritiesPositionLogInstanceRecord) {
    this.cRSecuritiesPositionLogInstanceRecord = cRSecuritiesPositionLogInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return securitiesPositionLogUpdateActionTaskReference
  **/

  public String getSecuritiesPositionLogUpdateActionTaskReference() {
    return securitiesPositionLogUpdateActionTaskReference;
  }

  public void setSecuritiesPositionLogUpdateActionTaskReference(String securitiesPositionLogUpdateActionTaskReference) {
    this.securitiesPositionLogUpdateActionTaskReference = securitiesPositionLogUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

