// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrailStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrailStatusResponseBody</p>
 */
public class GetTrailStatusResponseBody extends TeaModel {
    @NameInMap("IsLogging")
    private Boolean isLogging;

    @NameInMap("LatestDeliveryError")
    private String latestDeliveryError;

    @NameInMap("LatestDeliveryLogServiceError")
    private String latestDeliveryLogServiceError;

    @NameInMap("LatestDeliveryLogServiceTime")
    private String latestDeliveryLogServiceTime;

    @NameInMap("LatestDeliveryTime")
    private String latestDeliveryTime;

    @NameInMap("OssBucketStatus")
    private Boolean ossBucketStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsLogStoreStatus")
    private Boolean slsLogStoreStatus;

    @NameInMap("StartLoggingTime")
    private String startLoggingTime;

    @NameInMap("StopLoggingTime")
    private String stopLoggingTime;

    private GetTrailStatusResponseBody(Builder builder) {
        this.isLogging = builder.isLogging;
        this.latestDeliveryError = builder.latestDeliveryError;
        this.latestDeliveryLogServiceError = builder.latestDeliveryLogServiceError;
        this.latestDeliveryLogServiceTime = builder.latestDeliveryLogServiceTime;
        this.latestDeliveryTime = builder.latestDeliveryTime;
        this.ossBucketStatus = builder.ossBucketStatus;
        this.requestId = builder.requestId;
        this.slsLogStoreStatus = builder.slsLogStoreStatus;
        this.startLoggingTime = builder.startLoggingTime;
        this.stopLoggingTime = builder.stopLoggingTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrailStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return isLogging
     */
    public Boolean getIsLogging() {
        return this.isLogging;
    }

    /**
     * @return latestDeliveryError
     */
    public String getLatestDeliveryError() {
        return this.latestDeliveryError;
    }

    /**
     * @return latestDeliveryLogServiceError
     */
    public String getLatestDeliveryLogServiceError() {
        return this.latestDeliveryLogServiceError;
    }

    /**
     * @return latestDeliveryLogServiceTime
     */
    public String getLatestDeliveryLogServiceTime() {
        return this.latestDeliveryLogServiceTime;
    }

    /**
     * @return latestDeliveryTime
     */
    public String getLatestDeliveryTime() {
        return this.latestDeliveryTime;
    }

    /**
     * @return ossBucketStatus
     */
    public Boolean getOssBucketStatus() {
        return this.ossBucketStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsLogStoreStatus
     */
    public Boolean getSlsLogStoreStatus() {
        return this.slsLogStoreStatus;
    }

    /**
     * @return startLoggingTime
     */
    public String getStartLoggingTime() {
        return this.startLoggingTime;
    }

    /**
     * @return stopLoggingTime
     */
    public String getStopLoggingTime() {
        return this.stopLoggingTime;
    }

    public static final class Builder {
        private Boolean isLogging; 
        private String latestDeliveryError; 
        private String latestDeliveryLogServiceError; 
        private String latestDeliveryLogServiceTime; 
        private String latestDeliveryTime; 
        private Boolean ossBucketStatus; 
        private String requestId; 
        private Boolean slsLogStoreStatus; 
        private String startLoggingTime; 
        private String stopLoggingTime; 

        /**
         * IsLogging.
         */
        public Builder isLogging(Boolean isLogging) {
            this.isLogging = isLogging;
            return this;
        }

        /**
         * LatestDeliveryError.
         */
        public Builder latestDeliveryError(String latestDeliveryError) {
            this.latestDeliveryError = latestDeliveryError;
            return this;
        }

        /**
         * LatestDeliveryLogServiceError.
         */
        public Builder latestDeliveryLogServiceError(String latestDeliveryLogServiceError) {
            this.latestDeliveryLogServiceError = latestDeliveryLogServiceError;
            return this;
        }

        /**
         * LatestDeliveryLogServiceTime.
         */
        public Builder latestDeliveryLogServiceTime(String latestDeliveryLogServiceTime) {
            this.latestDeliveryLogServiceTime = latestDeliveryLogServiceTime;
            return this;
        }

        /**
         * LatestDeliveryTime.
         */
        public Builder latestDeliveryTime(String latestDeliveryTime) {
            this.latestDeliveryTime = latestDeliveryTime;
            return this;
        }

        /**
         * OssBucketStatus.
         */
        public Builder ossBucketStatus(Boolean ossBucketStatus) {
            this.ossBucketStatus = ossBucketStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlsLogStoreStatus.
         */
        public Builder slsLogStoreStatus(Boolean slsLogStoreStatus) {
            this.slsLogStoreStatus = slsLogStoreStatus;
            return this;
        }

        /**
         * StartLoggingTime.
         */
        public Builder startLoggingTime(String startLoggingTime) {
            this.startLoggingTime = startLoggingTime;
            return this;
        }

        /**
         * StopLoggingTime.
         */
        public Builder stopLoggingTime(String stopLoggingTime) {
            this.stopLoggingTime = stopLoggingTime;
            return this;
        }

        public GetTrailStatusResponseBody build() {
            return new GetTrailStatusResponseBody(this);
        } 

    } 

}
