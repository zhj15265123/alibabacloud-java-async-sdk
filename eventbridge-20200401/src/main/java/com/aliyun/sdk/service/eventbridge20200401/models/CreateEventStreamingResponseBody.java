// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link CreateEventStreamingResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEventStreamingResponseBody</p>
 */
public class CreateEventStreamingResponseBody extends TeaModel {
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

    private CreateEventStreamingResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventStreamingResponseBody create() {
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
         * The HTTP status code. The HTTP status code 200 indicates that the request is successful. Other HTTP codes indicate that the request failed. For more information about error codes, see Error codes.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values: true and false.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateEventStreamingResponseBody build() {
            return new CreateEventStreamingResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EventStreamingARN")
        private String eventStreamingARN;

        private Data(Builder builder) {
            this.eventStreamingARN = builder.eventStreamingARN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventStreamingARN
         */
        public String getEventStreamingARN() {
            return this.eventStreamingARN;
        }

        public static final class Builder {
            private String eventStreamingARN; 

            /**
             * The ARN of the event stream.
             */
            public Builder eventStreamingARN(String eventStreamingARN) {
                this.eventStreamingARN = eventStreamingARN;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
