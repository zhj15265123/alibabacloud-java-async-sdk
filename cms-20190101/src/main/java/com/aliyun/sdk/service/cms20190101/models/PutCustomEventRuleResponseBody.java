// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutCustomEventRuleResponseBody} extends {@link TeaModel}
 *
 * <p>PutCustomEventRuleResponseBody</p>
 */
public class PutCustomEventRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PutCustomEventRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutCustomEventRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error message.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Before you call this operation, call the PutCustomEvent operation to report the monitoring data of the custom event. For more information, see [PutCustomEvent](~~115012~~).
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutCustomEventRuleResponseBody build() {
            return new PutCustomEventRuleResponseBody(this);
        } 

    } 

}
