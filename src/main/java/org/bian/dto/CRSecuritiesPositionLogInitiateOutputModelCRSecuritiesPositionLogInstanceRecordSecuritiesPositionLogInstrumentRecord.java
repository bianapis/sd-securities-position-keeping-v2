package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordDateType;
import org.bian.dto.CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesAmountBlock;
import org.bian.dto.CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesPositionLimits;

import javax.validation.Valid;
  
/**
 * CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecord
 */
public class CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecord   {
  private String securitiesInstrumentType = null;

  private String securitiesInstrumentReference = null;

  private CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesPositionLimits securitiesPositionLimits = null;

  private CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesAmountBlock securitiesAmountBlock = null;

  private CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the type of investment instrument being tracked (e.g. equity, commodity, FX/MM, derivative) 
   * @return securitiesInstrumentType
  **/

  public String getSecuritiesInstrumentType() {
    return securitiesInstrumentType;
  }

  public void setSecuritiesInstrumentType(String securitiesInstrumentType) {
    this.securitiesInstrumentType = securitiesInstrumentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The specific instrument trading identifier (e.g. NASDAQ Id) 
   * @return securitiesInstrumentReference
  **/

  public String getSecuritiesInstrumentReference() {
    return securitiesInstrumentReference;
  }

  public void setSecuritiesInstrumentReference(String securitiesInstrumentReference) {
    this.securitiesInstrumentReference = securitiesInstrumentReference;
  }


  /**
   * Get securitiesPositionLimits
   * @return securitiesPositionLimits
  **/

  public CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesPositionLimits getSecuritiesPositionLimits() {
    return securitiesPositionLimits;
  }

  public void setSecuritiesPositionLimits(CRSecuritiesPositionLogInitiateOutputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesPositionLimits securitiesPositionLimits) {
    this.securitiesPositionLimits = securitiesPositionLimits;
  }


  /**
   * Get securitiesAmountBlock
   * @return securitiesAmountBlock
  **/

  public CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesAmountBlock getSecuritiesAmountBlock() {
    return securitiesAmountBlock;
  }

  public void setSecuritiesAmountBlock(CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordSecuritiesAmountBlock securitiesAmountBlock) {
    this.securitiesAmountBlock = securitiesAmountBlock;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRSecuritiesPositionLogInitiateInputModelCRSecuritiesPositionLogInstanceRecordSecuritiesPositionLogInstrumentRecordDateType dateType) {
    this.dateType = dateType;
  }


}

