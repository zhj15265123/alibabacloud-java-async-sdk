// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOpenedAccessLogInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOpenedAccessLogInstancesResponseBody</p>
 */
public class ListOpenedAccessLogInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsConfigStatus")
    private java.util.List < SlsConfigStatus> slsConfigStatus;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListOpenedAccessLogInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsConfigStatus = builder.slsConfigStatus;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpenedAccessLogInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsConfigStatus
     */
    public java.util.List < SlsConfigStatus> getSlsConfigStatus() {
        return this.slsConfigStatus;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SlsConfigStatus> slsConfigStatus; 
        private Integer totalCount; 

        /**
         * The ID of the Anti-DDoS Origin instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether log analysis was enabled for the Anti-DDoS Origin instance. Valid values:
         * <p>
         * 
         * *   **true**: Log analysis was enabled.
         * *   **false**: Log analysis was disabled.
         */
        public Builder slsConfigStatus(java.util.List < SlsConfigStatus> slsConfigStatus) {
            this.slsConfigStatus = slsConfigStatus;
            return this;
        }

        /**
         * The configuration of log analysis for the Anti-DDoS Origin instance.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOpenedAccessLogInstancesResponseBody build() {
            return new ListOpenedAccessLogInstancesResponseBody(this);
        } 

    } 

    public static class SlsConfigStatus extends TeaModel {
        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("InstanceId")
        private String instanceId;

        private SlsConfigStatus(Builder builder) {
            this.enable = builder.enable;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsConfigStatus create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Boolean enable; 
            private String instanceId; 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).
             * <p>
             * 
             * For more information about sample requests, see the **"Examples"** section of this topic.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public SlsConfigStatus build() {
                return new SlsConfigStatus(this);
            } 

        } 

    }
}
