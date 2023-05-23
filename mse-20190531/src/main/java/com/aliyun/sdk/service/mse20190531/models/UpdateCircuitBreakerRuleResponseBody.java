// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCircuitBreakerRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCircuitBreakerRuleResponseBody</p>
 */
public class UpdateCircuitBreakerRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private UpdateCircuitBreakerRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCircuitBreakerRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * 请求结果。
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateCircuitBreakerRuleResponseBody build() {
            return new UpdateCircuitBreakerRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("HalfOpenBaseAmountPerStep")
        private Integer halfOpenBaseAmountPerStep;

        @NameInMap("HalfOpenRecoveryStepNum")
        private Integer halfOpenRecoveryStepNum;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MaxAllowedRtMs")
        private Integer maxAllowedRtMs;

        @NameInMap("MinRequestAmount")
        private Integer minRequestAmount;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("RetryTimeoutMs")
        private Integer retryTimeoutMs;

        @NameInMap("StatIntervalMs")
        private Integer statIntervalMs;

        @NameInMap("Strategy")
        private Integer strategy;

        @NameInMap("Threshold")
        private Float threshold;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.enable = builder.enable;
            this.halfOpenBaseAmountPerStep = builder.halfOpenBaseAmountPerStep;
            this.halfOpenRecoveryStepNum = builder.halfOpenRecoveryStepNum;
            this.id = builder.id;
            this.maxAllowedRtMs = builder.maxAllowedRtMs;
            this.minRequestAmount = builder.minRequestAmount;
            this.namespace = builder.namespace;
            this.resource = builder.resource;
            this.retryTimeoutMs = builder.retryTimeoutMs;
            this.statIntervalMs = builder.statIntervalMs;
            this.strategy = builder.strategy;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return halfOpenBaseAmountPerStep
         */
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        /**
         * @return halfOpenRecoveryStepNum
         */
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return maxAllowedRtMs
         */
        public Integer getMaxAllowedRtMs() {
            return this.maxAllowedRtMs;
        }

        /**
         * @return minRequestAmount
         */
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return retryTimeoutMs
         */
        public Integer getRetryTimeoutMs() {
            return this.retryTimeoutMs;
        }

        /**
         * @return statIntervalMs
         */
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        /**
         * @return strategy
         */
        public Integer getStrategy() {
            return this.strategy;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Boolean enable; 
            private Integer halfOpenBaseAmountPerStep; 
            private Integer halfOpenRecoveryStepNum; 
            private Long id; 
            private Integer maxAllowedRtMs; 
            private Integer minRequestAmount; 
            private String namespace; 
            private String resource; 
            private Integer retryTimeoutMs; 
            private Integer statIntervalMs; 
            private Integer strategy; 
            private Float threshold; 

            /**
             * 应用ID。
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * 应用名称。
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * 规则的启用状态。
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * 熔断恢复每步最小通过数目。
             */
            public Builder halfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
                this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
                return this;
            }

            /**
             * 熔断恢复阶段数。
             */
            public Builder halfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
                this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
                return this;
            }

            /**
             * 规则ID。
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 慢调用RT（单位毫秒）：超过该时长则判定为慢请求，阈值类型为慢调用比例时必填。
             */
            public Builder maxAllowedRtMs(Integer maxAllowedRtMs) {
                this.maxAllowedRtMs = maxAllowedRtMs;
                return this;
            }

            /**
             * 触发熔断的最小请求数目，若当前统计窗口请求数小于此值，即使达到熔断条件规则也不会触发。
             */
            public Builder minRequestAmount(Integer minRequestAmount) {
                this.minRequestAmount = minRequestAmount;
                return this;
            }

            /**
             * 应用所属的微服务命名空间。
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * 接口名称：适用该规则的应用资源。需要与控制台接口详情处接口名称一致。
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * 熔断时长（单位毫秒）：即熔断触发后持续的时间。资源进入熔断状态后，在配置的熔断时长内，请求都会快速失败。
             */
            public Builder retryTimeoutMs(Integer retryTimeoutMs) {
                this.retryTimeoutMs = retryTimeoutMs;
                return this;
            }

            /**
             * 统计窗口时长（单位毫秒）：统计的时间窗口长度，取值范围为1秒~120分钟。
             */
            public Builder statIntervalMs(Integer statIntervalMs) {
                this.statIntervalMs = statIntervalMs;
                return this;
            }

            /**
             * 阈值类型：选择以慢调用比例或异常比例作为阈值。
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * 熔断比例阈值：触发熔断的比例阈值，取值范围为0 - 1，代表0% - 100%。
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
