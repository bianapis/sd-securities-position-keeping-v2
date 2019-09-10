/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Track;

@BianRestController
public class SecuritiesPositionKeepingApiController {

	@Autowired
	SecuritiesPositionKeepingApiService service;
	
	@Track.Activate
	public BianResponse<SDSecuritiesPositionKeepingActivateOutputModel> activate(@RequestBody BianRequest<SDSecuritiesPositionKeepingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("transactioncapture")
	@Track.Capture
	public BianResponse<BQTransactionCaptureCaptureOutputModel> captureTransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionCaptureCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureTransactioncapture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Track.Configure
	public BianResponse<SDSecuritiesPositionKeepingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSecuritiesPositionKeepingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.Control
	public BianResponse<CRSecuritiesPositionLogControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSecuritiesPositionLogControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Track.Feedback
	public BianResponse<SDSecuritiesPositionKeepingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSecuritiesPositionKeepingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.Initiate
	public BianResponse<CRSecuritiesPositionLogInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRSecuritiesPositionLogInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.RetrieveSD
	public BianResponse<SDSecuritiesPositionKeepingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Track.Retrieve
	public BianResponse<CRSecuritiesPositionLogRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Track.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Track.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Track.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("transactioncapture")
	@Track.Retrieve
	public BianResponse<BQTransactionCaptureRetrieveOutputModel> retrieveTransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTransactioncapture(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Track.Update
	public BianResponse<CRSecuritiesPositionLogUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSecuritiesPositionLogUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("transactioncapture")
	@Track.Update
	public BianResponse<BQTransactionCaptureUpdateOutputModel> updateTransactioncapture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQTransactionCaptureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateTransactioncapture(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
