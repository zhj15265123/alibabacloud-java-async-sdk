// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyActionEventPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyActionEventPolicyResponseBody</p>
 */
public class ModifyActionEventPolicyResponseBody extends TeaModel {
    @NameInMap("EnableEventLog")
    private String enableEventLog;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyActionEventPolicyResponseBody(Builder builder) {
        this.enableEventLog = builder.enableEventLog;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyActionEventPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return enableEventLog
     */
    public String getEnableEventLog() {
        return this.enableEventLog;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String enableEventLog; 
        private String regionId; 
        private String requestId; 

        /**
         * Indicates whether the event history feature is enabled.
         */
        public Builder enableEventLog(String enableEventLog) {
            this.enableEventLog = enableEventLog;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyActionEventPolicyResponseBody build() {
            return new ModifyActionEventPolicyResponseBody(this);
        } 

    } 

}
