package com.rukspot.samples.analytics.publisher;

import com.google.gson.Gson;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.apimgt.api.APIManagementException;
import org.wso2.carbon.apimgt.usage.publisher.APIMgtUsageDataBridgeDataPublisher;
import org.wso2.carbon.apimgt.usage.publisher.dto.AlertTypeDTO;
import org.wso2.carbon.apimgt.usage.publisher.dto.FaultPublisherDTO;
import org.wso2.carbon.apimgt.usage.publisher.dto.RequestResponseStreamDTO;
import org.wso2.carbon.apimgt.usage.publisher.dto.ThrottlePublisherDTO;

public class FilePublisher extends APIMgtUsageDataBridgeDataPublisher {
    private static final Log log = LogFactory.getLog(FilePublisher.class);
    private Gson gson = new Gson();

    public FilePublisher() {
        // Do nothing
    }

    @Override
    public void init() {
        // Do nothing
    }

    @Override
    public void publishEvent(FaultPublisherDTO faultPublisherDTO) {
        log.info(gson.toJson(faultPublisherDTO));
    }

    @Override
    public void publishEvent(ThrottlePublisherDTO throttPublisherDTO) {
        log.info(gson.toJson(throttPublisherDTO));
    }

    @Override
    public void publishEvent(AlertTypeDTO alertTypeDTO) throws APIManagementException {
        // Required only to log alert configurations
        // log.info(gson.toJson(alertTypeDTO));
    }

    @Override
    public void publishEvent(RequestResponseStreamDTO requestStream) {
        log.info(gson.toJson(requestStream));
    }
}
