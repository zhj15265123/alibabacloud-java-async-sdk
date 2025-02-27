// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceTrendingReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceTrendingReportResponseBody</p>
 */
public class GetInstanceTrendingReportResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceTrendingReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceTrendingReportResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetInstanceTrendingReportResponseBody build() {
            return new GetInstanceTrendingReportResponseBody(this);
        } 

    } 

    public static class Inbound extends TeaModel {
        @NameInMap("CallsAbandonedInIVR")
        private Long callsAbandonedInIVR;

        @NameInMap("CallsAbandonedInQueue")
        private Long callsAbandonedInQueue;

        @NameInMap("CallsAbandonedInRing")
        private Long callsAbandonedInRing;

        @NameInMap("CallsHandled")
        private Long callsHandled;

        @NameInMap("CallsQueued")
        private Long callsQueued;

        @NameInMap("StatsTime")
        private Long statsTime;

        @NameInMap("TotalCalls")
        private Long totalCalls;

        private Inbound(Builder builder) {
            this.callsAbandonedInIVR = builder.callsAbandonedInIVR;
            this.callsAbandonedInQueue = builder.callsAbandonedInQueue;
            this.callsAbandonedInRing = builder.callsAbandonedInRing;
            this.callsHandled = builder.callsHandled;
            this.callsQueued = builder.callsQueued;
            this.statsTime = builder.statsTime;
            this.totalCalls = builder.totalCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inbound create() {
            return builder().build();
        }

        /**
         * @return callsAbandonedInIVR
         */
        public Long getCallsAbandonedInIVR() {
            return this.callsAbandonedInIVR;
        }

        /**
         * @return callsAbandonedInQueue
         */
        public Long getCallsAbandonedInQueue() {
            return this.callsAbandonedInQueue;
        }

        /**
         * @return callsAbandonedInRing
         */
        public Long getCallsAbandonedInRing() {
            return this.callsAbandonedInRing;
        }

        /**
         * @return callsHandled
         */
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        /**
         * @return callsQueued
         */
        public Long getCallsQueued() {
            return this.callsQueued;
        }

        /**
         * @return statsTime
         */
        public Long getStatsTime() {
            return this.statsTime;
        }

        /**
         * @return totalCalls
         */
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public static final class Builder {
            private Long callsAbandonedInIVR; 
            private Long callsAbandonedInQueue; 
            private Long callsAbandonedInRing; 
            private Long callsHandled; 
            private Long callsQueued; 
            private Long statsTime; 
            private Long totalCalls; 

            /**
             * CallsAbandonedInIVR.
             */
            public Builder callsAbandonedInIVR(Long callsAbandonedInIVR) {
                this.callsAbandonedInIVR = callsAbandonedInIVR;
                return this;
            }

            /**
             * CallsAbandonedInQueue.
             */
            public Builder callsAbandonedInQueue(Long callsAbandonedInQueue) {
                this.callsAbandonedInQueue = callsAbandonedInQueue;
                return this;
            }

            /**
             * CallsAbandonedInRing.
             */
            public Builder callsAbandonedInRing(Long callsAbandonedInRing) {
                this.callsAbandonedInRing = callsAbandonedInRing;
                return this;
            }

            /**
             * CallsHandled.
             */
            public Builder callsHandled(Long callsHandled) {
                this.callsHandled = callsHandled;
                return this;
            }

            /**
             * CallsQueued.
             */
            public Builder callsQueued(Long callsQueued) {
                this.callsQueued = callsQueued;
                return this;
            }

            /**
             * StatsTime.
             */
            public Builder statsTime(Long statsTime) {
                this.statsTime = statsTime;
                return this;
            }

            /**
             * TotalCalls.
             */
            public Builder totalCalls(Long totalCalls) {
                this.totalCalls = totalCalls;
                return this;
            }

            public Inbound build() {
                return new Inbound(this);
            } 

        } 

    }
    public static class Outbound extends TeaModel {
        @NameInMap("CallsAnswered")
        private Long callsAnswered;

        @NameInMap("StatsTime")
        private Long statsTime;

        @NameInMap("TotalCalls")
        private Long totalCalls;

        private Outbound(Builder builder) {
            this.callsAnswered = builder.callsAnswered;
            this.statsTime = builder.statsTime;
            this.totalCalls = builder.totalCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outbound create() {
            return builder().build();
        }

        /**
         * @return callsAnswered
         */
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        /**
         * @return statsTime
         */
        public Long getStatsTime() {
            return this.statsTime;
        }

        /**
         * @return totalCalls
         */
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public static final class Builder {
            private Long callsAnswered; 
            private Long statsTime; 
            private Long totalCalls; 

            /**
             * CallsAnswered.
             */
            public Builder callsAnswered(Long callsAnswered) {
                this.callsAnswered = callsAnswered;
                return this;
            }

            /**
             * StatsTime.
             */
            public Builder statsTime(Long statsTime) {
                this.statsTime = statsTime;
                return this;
            }

            /**
             * TotalCalls.
             */
            public Builder totalCalls(Long totalCalls) {
                this.totalCalls = totalCalls;
                return this;
            }

            public Outbound build() {
                return new Outbound(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Inbound")
        private java.util.List < Inbound> inbound;

        @NameInMap("Outbound")
        private java.util.List < Outbound> outbound;

        private Data(Builder builder) {
            this.inbound = builder.inbound;
            this.outbound = builder.outbound;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return inbound
         */
        public java.util.List < Inbound> getInbound() {
            return this.inbound;
        }

        /**
         * @return outbound
         */
        public java.util.List < Outbound> getOutbound() {
            return this.outbound;
        }

        public static final class Builder {
            private java.util.List < Inbound> inbound; 
            private java.util.List < Outbound> outbound; 

            /**
             * Inbound.
             */
            public Builder inbound(java.util.List < Inbound> inbound) {
                this.inbound = inbound;
                return this;
            }

            /**
             * Outbound.
             */
            public Builder outbound(java.util.List < Outbound> outbound) {
                this.outbound = outbound;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
