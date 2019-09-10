/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class SecuritiesPositionKeepingApiServiceImpl implements SecuritiesPositionKeepingApiService {

	public SDSecuritiesPositionKeepingActivateOutputModel activate(SDSecuritiesPositionKeepingActivateInputModel request){
		return JsonReader.read("activate-SDSecuritiesPositionKeepingActivateOutputModel.json",new TypeReference<SDSecuritiesPositionKeepingActivateOutputModel>(){});
	}
	
	public BQTransactionCaptureCaptureOutputModel captureTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionCaptureCaptureInputModel request){
		return JsonReader.read("capture-BQTransactionCaptureCaptureOutputModel.json",new TypeReference<BQTransactionCaptureCaptureOutputModel>(){});
	}
	
	public SDSecuritiesPositionKeepingConfigureOutputModel configure(String sdReferenceId, SDSecuritiesPositionKeepingConfigureInputModel request){
		return JsonReader.read("configure-SDSecuritiesPositionKeepingConfigureOutputModel.json",new TypeReference<SDSecuritiesPositionKeepingConfigureOutputModel>(){});
	}
	
	public CRSecuritiesPositionLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRSecuritiesPositionLogControlInputModel request){
		return JsonReader.read("control-CRSecuritiesPositionLogControlOutputModel.json",new TypeReference<CRSecuritiesPositionLogControlOutputModel>(){});
	}
	
	public SDSecuritiesPositionKeepingFeedbackOutputModel feedback(String sdReferenceId, SDSecuritiesPositionKeepingFeedbackInputModel request){
		return JsonReader.read("feedback-SDSecuritiesPositionKeepingFeedbackOutputModel.json",new TypeReference<SDSecuritiesPositionKeepingFeedbackOutputModel>(){});
	}
	
	public CRSecuritiesPositionLogInitiateOutputModel initiate(String sdReferenceId, CRSecuritiesPositionLogInitiateInputModel request){
		return JsonReader.read("initiate-CRSecuritiesPositionLogInitiateOutputModel.json",new TypeReference<CRSecuritiesPositionLogInitiateOutputModel>(){});
	}
	
	public SDSecuritiesPositionKeepingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDSecuritiesPositionKeepingRetrieveOutputModel.json",new TypeReference<SDSecuritiesPositionKeepingRetrieveOutputModel>(){});
	}
	
	public CRSecuritiesPositionLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRSecuritiesPositionLogRetrieveOutputModel.json",new TypeReference<CRSecuritiesPositionLogRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQTransactionCaptureRetrieveOutputModel retrieveTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionCaptureRetrieveOutputModel.json",new TypeReference<BQTransactionCaptureRetrieveOutputModel>(){});
	}
	
	public CRSecuritiesPositionLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSecuritiesPositionLogUpdateInputModel request){
		return JsonReader.read("update-CRSecuritiesPositionLogUpdateOutputModel.json",new TypeReference<CRSecuritiesPositionLogUpdateOutputModel>(){});
	}
	
	public BQTransactionCaptureUpdateOutputModel updateTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionCaptureUpdateInputModel request){
		return JsonReader.read("update-BQTransactionCaptureUpdateOutputModel.json",new TypeReference<BQTransactionCaptureUpdateOutputModel>(){});
	}
	
}
