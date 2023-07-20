// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UdpCheck} extends {@link TeaModel}
 *
 * <p>UdpCheck</p>
 */
public class UdpCheck extends TeaModel {
    @NameInMap("HealthCheckConnectPort")
    @Validation(maximum = 65535, minimum = 1)
    private Integer healthCheckConnectPort;

    @NameInMap("HealthCheckConnectTimeout")
    @Validation(maximum = 300, minimum = 1)
    private Integer healthCheckConnectTimeout;

    @NameInMap("HealthCheckInterval")
    @Validation(maximum = 50, minimum = 1)
    private Integer healthCheckInterval;

    @NameInMap("HealthyThreshold")
    @Validation(maximum = 10, minimum = 2)
    private Integer healthyThreshold;

    @NameInMap("UnhealthyThreshold")
    @Validation(maximum = 10, minimum = 2)
    private Integer unhealthyThreshold;

    private UdpCheck(Builder builder) {
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthyThreshold = builder.healthyThreshold;
        this.unhealthyThreshold = builder.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UdpCheck create() {
        return builder().build();
    }

    /**
     * @return healthCheckConnectPort
     */
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    /**
     * @return healthCheckConnectTimeout
     */
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
    }

    /**
     * @return healthCheckInterval
     */
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    /**
     * @return healthyThreshold
     */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static final class Builder {
        private Integer healthCheckConnectPort; 
        private Integer healthCheckConnectTimeout; 
        private Integer healthCheckInterval; 
        private Integer healthyThreshold; 
        private Integer unhealthyThreshold; 

        /**
         * HealthCheckConnectPort.
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * HealthCheckConnectTimeout.
         */
        public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }

        /**
         * HealthCheckInterval.
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * HealthyThreshold.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * UnhealthyThreshold.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public UdpCheck build() {
            return new UdpCheck(this);
        } 

    } 

}
