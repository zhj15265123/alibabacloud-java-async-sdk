// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link StartEventStreamingResponseBody} extends {@link TeaModel}
 *
 * <p>StartEventStreamingResponseBody</p>
 */
public class StartEventStreamingResponseBody extends TeaModel {
    @NameInMap("Code")
    private Boolean code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private StartEventStreamingResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartEventStreamingResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Boolean getCode() {
        return this.code;
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
        private Boolean code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The returned response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For more information about error codes, see Error codes.
         */
        public Builder code(Boolean code) {
            this.code = code;
            return this;
        }

        /**
         * The error message that is returned if the request failed.
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

        public StartEventStreamingResponseBody build() {
            return new StartEventStreamingResponseBody(this);
        } 

    } 

}
