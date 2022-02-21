// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTraceResponseBody} extends {@link TeaModel}
 *
 * <p>GetTraceResponseBody</p>
 */
public class GetTraceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Spans")
    private Spans spans;

    private GetTraceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spans = builder.spans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTraceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spans
     */
    public Spans getSpans() {
        return this.spans;
    }

    public static final class Builder {
        private String requestId; 
        private Spans spans; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Spans.
         */
        public Builder spans(Spans spans) {
            this.spans = spans;
            return this;
        }

        public GetTraceResponseBody build() {
            return new GetTraceResponseBody(this);
        } 

    } 

    public static class TagEntry extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private TagEntry(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagEntry create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagEntry build() {
                return new TagEntry(this);
            } 

        } 

    }
    public static class TagEntryList extends TeaModel {
        @NameInMap("TagEntry")
        private java.util.List < TagEntry> tagEntry;

        private TagEntryList(Builder builder) {
            this.tagEntry = builder.tagEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagEntryList create() {
            return builder().build();
        }

        /**
         * @return tagEntry
         */
        public java.util.List < TagEntry> getTagEntry() {
            return this.tagEntry;
        }

        public static final class Builder {
            private java.util.List < TagEntry> tagEntry; 

            /**
             * TagEntry.
             */
            public Builder tagEntry(java.util.List < TagEntry> tagEntry) {
                this.tagEntry = tagEntry;
                return this;
            }

            public TagEntryList build() {
                return new TagEntryList(this);
            } 

        } 

    }
    public static class LogEvent extends TeaModel {
        @NameInMap("TagEntryList")
        private TagEntryList tagEntryList;

        @NameInMap("Timestamp")
        private Long timestamp;

        private LogEvent(Builder builder) {
            this.tagEntryList = builder.tagEntryList;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogEvent create() {
            return builder().build();
        }

        /**
         * @return tagEntryList
         */
        public TagEntryList getTagEntryList() {
            return this.tagEntryList;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private TagEntryList tagEntryList; 
            private Long timestamp; 

            /**
             * TagEntryList.
             */
            public Builder tagEntryList(TagEntryList tagEntryList) {
                this.tagEntryList = tagEntryList;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public LogEvent build() {
                return new LogEvent(this);
            } 

        } 

    }
    public static class LogEventList extends TeaModel {
        @NameInMap("LogEvent")
        private java.util.List < LogEvent> logEvent;

        private LogEventList(Builder builder) {
            this.logEvent = builder.logEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogEventList create() {
            return builder().build();
        }

        /**
         * @return logEvent
         */
        public java.util.List < LogEvent> getLogEvent() {
            return this.logEvent;
        }

        public static final class Builder {
            private java.util.List < LogEvent> logEvent; 

            /**
             * LogEvent.
             */
            public Builder logEvent(java.util.List < LogEvent> logEvent) {
                this.logEvent = logEvent;
                return this;
            }

            public LogEventList build() {
                return new LogEventList(this);
            } 

        } 

    }
    public static class TagEntryListTagEntry extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private TagEntryListTagEntry(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagEntryListTagEntry create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagEntryListTagEntry build() {
                return new TagEntryListTagEntry(this);
            } 

        } 

    }
    public static class SpanTagEntryList extends TeaModel {
        @NameInMap("TagEntry")
        private java.util.List < TagEntryListTagEntry> tagEntry;

        private SpanTagEntryList(Builder builder) {
            this.tagEntry = builder.tagEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpanTagEntryList create() {
            return builder().build();
        }

        /**
         * @return tagEntry
         */
        public java.util.List < TagEntryListTagEntry> getTagEntry() {
            return this.tagEntry;
        }

        public static final class Builder {
            private java.util.List < TagEntryListTagEntry> tagEntry; 

            /**
             * TagEntry.
             */
            public Builder tagEntry(java.util.List < TagEntryListTagEntry> tagEntry) {
                this.tagEntry = tagEntry;
                return this;
            }

            public SpanTagEntryList build() {
                return new SpanTagEntryList(this);
            } 

        } 

    }
    public static class Span extends TeaModel {
        @NameInMap("Duration")
        private Long duration;

        @NameInMap("HaveStack")
        private Boolean haveStack;

        @NameInMap("LogEventList")
        private LogEventList logEventList;

        @NameInMap("OperationName")
        private String operationName;

        @NameInMap("ParentSpanId")
        private String parentSpanId;

        @NameInMap("ResultCode")
        private String resultCode;

        @NameInMap("RpcId")
        private String rpcId;

        @NameInMap("ServiceIp")
        private String serviceIp;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("SpanId")
        private String spanId;

        @NameInMap("TagEntryList")
        private SpanTagEntryList tagEntryList;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("TraceID")
        private String traceID;

        private Span(Builder builder) {
            this.duration = builder.duration;
            this.haveStack = builder.haveStack;
            this.logEventList = builder.logEventList;
            this.operationName = builder.operationName;
            this.parentSpanId = builder.parentSpanId;
            this.resultCode = builder.resultCode;
            this.rpcId = builder.rpcId;
            this.serviceIp = builder.serviceIp;
            this.serviceName = builder.serviceName;
            this.spanId = builder.spanId;
            this.tagEntryList = builder.tagEntryList;
            this.timestamp = builder.timestamp;
            this.traceID = builder.traceID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Span create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return haveStack
         */
        public Boolean getHaveStack() {
            return this.haveStack;
        }

        /**
         * @return logEventList
         */
        public LogEventList getLogEventList() {
            return this.logEventList;
        }

        /**
         * @return operationName
         */
        public String getOperationName() {
            return this.operationName;
        }

        /**
         * @return parentSpanId
         */
        public String getParentSpanId() {
            return this.parentSpanId;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        /**
         * @return rpcId
         */
        public String getRpcId() {
            return this.rpcId;
        }

        /**
         * @return serviceIp
         */
        public String getServiceIp() {
            return this.serviceIp;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return spanId
         */
        public String getSpanId() {
            return this.spanId;
        }

        /**
         * @return tagEntryList
         */
        public SpanTagEntryList getTagEntryList() {
            return this.tagEntryList;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return traceID
         */
        public String getTraceID() {
            return this.traceID;
        }

        public static final class Builder {
            private Long duration; 
            private Boolean haveStack; 
            private LogEventList logEventList; 
            private String operationName; 
            private String parentSpanId; 
            private String resultCode; 
            private String rpcId; 
            private String serviceIp; 
            private String serviceName; 
            private String spanId; 
            private SpanTagEntryList tagEntryList; 
            private Long timestamp; 
            private String traceID; 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * HaveStack.
             */
            public Builder haveStack(Boolean haveStack) {
                this.haveStack = haveStack;
                return this;
            }

            /**
             * LogEventList.
             */
            public Builder logEventList(LogEventList logEventList) {
                this.logEventList = logEventList;
                return this;
            }

            /**
             * OperationName.
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            /**
             * ParentSpanId.
             */
            public Builder parentSpanId(String parentSpanId) {
                this.parentSpanId = parentSpanId;
                return this;
            }

            /**
             * ResultCode.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * RpcId.
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * ServiceIp.
             */
            public Builder serviceIp(String serviceIp) {
                this.serviceIp = serviceIp;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SpanId.
             */
            public Builder spanId(String spanId) {
                this.spanId = spanId;
                return this;
            }

            /**
             * TagEntryList.
             */
            public Builder tagEntryList(SpanTagEntryList tagEntryList) {
                this.tagEntryList = tagEntryList;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * TraceID.
             */
            public Builder traceID(String traceID) {
                this.traceID = traceID;
                return this;
            }

            public Span build() {
                return new Span(this);
            } 

        } 

    }
    public static class Spans extends TeaModel {
        @NameInMap("Span")
        private java.util.List < Span> span;

        private Spans(Builder builder) {
            this.span = builder.span;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spans create() {
            return builder().build();
        }

        /**
         * @return span
         */
        public java.util.List < Span> getSpan() {
            return this.span;
        }

        public static final class Builder {
            private java.util.List < Span> span; 

            /**
             * Span.
             */
            public Builder span(java.util.List < Span> span) {
                this.span = span;
                return this;
            }

            public Spans build() {
                return new Spans(this);
            } 

        } 

    }
}
