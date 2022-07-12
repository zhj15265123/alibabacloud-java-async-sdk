// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpDdosThresholdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpDdosThresholdResponseBody</p>
 */
public class DescribeIpDdosThresholdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Threshold")
    private Threshold threshold;

    private DescribeIpDdosThresholdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpDdosThresholdResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return threshold
     */
    public Threshold getThreshold() {
        return this.threshold;
    }

    public static final class Builder {
        private String requestId; 
        private Threshold threshold; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Threshold threshold) {
            this.threshold = threshold;
            return this;
        }

        public DescribeIpDdosThresholdResponseBody build() {
            return new DescribeIpDdosThresholdResponseBody(this);
        } 

    } 

    public static class Threshold extends TeaModel {
        @NameInMap("Bps")
        private Integer bps;

        @NameInMap("DdosType")
        private String ddosType;

        @NameInMap("ElasticBps")
        private Integer elasticBps;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IsAuto")
        private Boolean isAuto;

        @NameInMap("MaxBps")
        private Integer maxBps;

        @NameInMap("MaxPps")
        private Integer maxPps;

        @NameInMap("Pps")
        private Integer pps;

        private Threshold(Builder builder) {
            this.bps = builder.bps;
            this.ddosType = builder.ddosType;
            this.elasticBps = builder.elasticBps;
            this.instanceId = builder.instanceId;
            this.internetIp = builder.internetIp;
            this.isAuto = builder.isAuto;
            this.maxBps = builder.maxBps;
            this.maxPps = builder.maxPps;
            this.pps = builder.pps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Threshold create() {
            return builder().build();
        }

        /**
         * @return bps
         */
        public Integer getBps() {
            return this.bps;
        }

        /**
         * @return ddosType
         */
        public String getDdosType() {
            return this.ddosType;
        }

        /**
         * @return elasticBps
         */
        public Integer getElasticBps() {
            return this.elasticBps;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return isAuto
         */
        public Boolean getIsAuto() {
            return this.isAuto;
        }

        /**
         * @return maxBps
         */
        public Integer getMaxBps() {
            return this.maxBps;
        }

        /**
         * @return maxPps
         */
        public Integer getMaxPps() {
            return this.maxPps;
        }

        /**
         * @return pps
         */
        public Integer getPps() {
            return this.pps;
        }

        public static final class Builder {
            private Integer bps; 
            private String ddosType; 
            private Integer elasticBps; 
            private String instanceId; 
            private String internetIp; 
            private Boolean isAuto; 
            private Integer maxBps; 
            private Integer maxPps; 
            private Integer pps; 

            /**
             * Bps.
             */
            public Builder bps(Integer bps) {
                this.bps = bps;
                return this;
            }

            /**
             * DdosType.
             */
            public Builder ddosType(String ddosType) {
                this.ddosType = ddosType;
                return this;
            }

            /**
             * ElasticBps.
             */
            public Builder elasticBps(Integer elasticBps) {
                this.elasticBps = elasticBps;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IsAuto.
             */
            public Builder isAuto(Boolean isAuto) {
                this.isAuto = isAuto;
                return this;
            }

            /**
             * MaxBps.
             */
            public Builder maxBps(Integer maxBps) {
                this.maxBps = maxBps;
                return this;
            }

            /**
             * MaxPps.
             */
            public Builder maxPps(Integer maxPps) {
                this.maxPps = maxPps;
                return this;
            }

            /**
             * Pps.
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            public Threshold build() {
                return new Threshold(this);
            } 

        } 

    }
}
