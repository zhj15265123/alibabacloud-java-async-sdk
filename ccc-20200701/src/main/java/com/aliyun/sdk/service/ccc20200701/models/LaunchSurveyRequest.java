// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LaunchSurveyRequest} extends {@link RequestModel}
 *
 * <p>LaunchSurveyRequest</p>
 */
public class LaunchSurveyRequest extends Request {
    @Query
    @NameInMap("ContactFlowId")
    @Validation(required = true)
    private String contactFlowId;

    @Query
    @NameInMap("ContactFlowVariables")
    private String contactFlowVariables;

    @Query
    @NameInMap("DeviceId")
    private String deviceId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("SmsMetadataId")
    private String smsMetadataId;

    @Query
    @NameInMap("SurveyChannel")
    private String surveyChannel;

    @Query
    @NameInMap("UserId")
    private String userId;

    private LaunchSurveyRequest(Builder builder) {
        super(builder);
        this.contactFlowId = builder.contactFlowId;
        this.contactFlowVariables = builder.contactFlowVariables;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.smsMetadataId = builder.smsMetadataId;
        this.surveyChannel = builder.surveyChannel;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LaunchSurveyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactFlowId
     */
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * @return contactFlowVariables
     */
    public String getContactFlowVariables() {
        return this.contactFlowVariables;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return smsMetadataId
     */
    public String getSmsMetadataId() {
        return this.smsMetadataId;
    }

    /**
     * @return surveyChannel
     */
    public String getSurveyChannel() {
        return this.surveyChannel;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<LaunchSurveyRequest, Builder> {
        private String contactFlowId; 
        private String contactFlowVariables; 
        private String deviceId; 
        private String instanceId; 
        private String jobId; 
        private String smsMetadataId; 
        private String surveyChannel; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(LaunchSurveyRequest request) {
            super(request);
            this.contactFlowId = request.contactFlowId;
            this.contactFlowVariables = request.contactFlowVariables;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.smsMetadataId = request.smsMetadataId;
            this.surveyChannel = request.surveyChannel;
            this.userId = request.userId;
        } 

        /**
         * ContactFlowId.
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
            return this;
        }

        /**
         * ContactFlowVariables.
         */
        public Builder contactFlowVariables(String contactFlowVariables) {
            this.putQueryParameter("ContactFlowVariables", contactFlowVariables);
            this.contactFlowVariables = contactFlowVariables;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * SmsMetadataId.
         */
        public Builder smsMetadataId(String smsMetadataId) {
            this.putQueryParameter("SmsMetadataId", smsMetadataId);
            this.smsMetadataId = smsMetadataId;
            return this;
        }

        /**
         * SurveyChannel.
         */
        public Builder surveyChannel(String surveyChannel) {
            this.putQueryParameter("SurveyChannel", surveyChannel);
            this.surveyChannel = surveyChannel;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public LaunchSurveyRequest build() {
            return new LaunchSurveyRequest(this);
        } 

    } 

}
