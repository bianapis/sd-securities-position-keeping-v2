/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SecuritiesPositionKeepingApiService {

	SDSecuritiesPositionKeepingActivateOutputModel activate(SDSecuritiesPositionKeepingActivateInputModel request);
	
	BQTransactionCaptureCaptureOutputModel captureTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionCaptureCaptureInputModel request);
	
	SDSecuritiesPositionKeepingConfigureOutputModel configure(String sdReferenceId, SDSecuritiesPositionKeepingConfigureInputModel request);
	
	CRSecuritiesPositionLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRSecuritiesPositionLogControlInputModel request);
	
	SDSecuritiesPositionKeepingFeedbackOutputModel feedback(String sdReferenceId, SDSecuritiesPositionKeepingFeedbackInputModel request);
	
	CRSecuritiesPositionLogInitiateOutputModel initiate(String sdReferenceId, CRSecuritiesPositionLogInitiateInputModel request);
	
	SDSecuritiesPositionKeepingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRSecuritiesPositionLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQTransactionCaptureRetrieveOutputModel retrieveTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRSecuritiesPositionLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSecuritiesPositionLogUpdateInputModel request);
	
	BQTransactionCaptureUpdateOutputModel updateTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionCaptureUpdateInputModel request);
	
}
