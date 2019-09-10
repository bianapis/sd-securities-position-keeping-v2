package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesPositionLimits
 */
public class CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesPositionLimits   {
  private String securitiesPositionLimitType = null;

  private String securitiesPositionLimitSettings = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of position maintained for the log (e.g. cumulative balance) 
   * @return securitiesPositionLimitType
  **/

  public String getSecuritiesPositionLimitType() {
    return securitiesPositionLimitType;
  }

  public void setSecuritiesPositionLimitType(String securitiesPositionLimitType) {
    this.securitiesPositionLimitType = securitiesPositionLimitType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The position definition, associated limit settings and rules 
   * @return securitiesPositionLimitSettings
  **/

  public String getSecuritiesPositionLimitSettings() {
    return securitiesPositionLimitSettings;
  }

  public void setSecuritiesPositionLimitSettings(String securitiesPositionLimitSettings) {
    this.securitiesPositionLimitSettings = securitiesPositionLimitSettings;
  }


}

