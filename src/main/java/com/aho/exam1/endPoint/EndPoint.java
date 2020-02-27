package com.aho.exam1.endPoint;

import com.aho.exam1.sequence.SequenceRequest;
import com.aho.exam1.sequence.SequenceResponse;
import com.aho.exam1.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigInteger;

@Endpoint
public class EndPoint {

    private final static String NAMESPACE = "http://www.aho.com/exam1/sequence";

    @Autowired
    private SequenceService sequenceService;


    @PayloadRoot(namespace = NAMESPACE, localPart = "SequenceRequest")
    @ResponsePayload
    public SequenceResponse getCommontSequence(@RequestPayload SequenceRequest request){
        SequenceResponse sr = new SequenceResponse();
        int result = sequenceService.commonPoint(sequenceService.getSequences(request.getSeq1().intValue()),
                                    sequenceService.getSequences(request.getSeq2().intValue()));
        if (result > -1){
            sr.setCommon(BigInteger.valueOf(result));
            sr.setExist(true);
            return sr;
        } else {
            sr.setCommon(BigInteger.valueOf(-1));
            sr.setExist(false);
            return sr;
        }
    }

}
