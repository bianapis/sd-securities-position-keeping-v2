package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecord;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecord
 */
public class CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecord   {
  private String securitiesTransactionLogType = null;

  private String securitiesPositionLogInstrumentProfile = null;

  private CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecord securitiesPositionLogInstrumentRecord = null;

  private String initiationDate = null;

  private String status = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of securities transaction log (e.g. equities, derivatives, all) 
   * @return securitiesTransactionLogType
  **/

  public String getSecuritiesTransactionLogType() {
    return securitiesTransactionLogType;
  }

  public void setSecuritiesTransactionLogType(String securitiesTransactionLogType) {
    this.securitiesTransactionLogType = securitiesTransactionLogType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the range of instruments that are tracked by the log (each instrument has its own transaction record/holding position 
   * @return securitiesPositionLogInstrumentProfile
  **/

  public String getSecuritiesPositionLogInstrumentProfile() {
    return securitiesPositionLogInstrumentProfile;
  }

  public void setSecuritiesPositionLogInstrumentProfile(String securitiesPositionLogInstrumentProfile) {
    this.securitiesPositionLogInstrumentProfile = securitiesPositionLogInstrumentProfile;
  }


  /**
   * Get securitiesPositionLogInstrumentRecord
   * @return securitiesPositionLogInstrumentRecord
  **/

  public CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecord getSecuritiesPositionLogInstrumentRecord() {
    return securitiesPositionLogInstrumentRecord;
  }

  public void setSecuritiesPositionLogInstrumentRecord(CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecord securitiesPositionLogInstrumentRecord) {
    this.securitiesPositionLogInstrumentRecord = securitiesPositionLogInstrumentRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the log was initiated. Note the log will have a complex internal calendar structure for extract and reporting 
   * @return initiationDate
  **/

  public String getInitiationDate() {
    return initiationDate;
  }

  public void setInitiationDate(String initiationDate) {
    this.initiationDate = initiationDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the log entry (e.g. active, in-suspense etc.) 
   * @return status
  **/

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


}

