// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorGroupNotifyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMonitorGroupNotifyPolicyResponseBody</p>
 */
public class CreateMonitorGroupNotifyPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Integer result;

    @NameInMap("Success")
    private String success;

    private CreateMonitorGroupNotifyPolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorGroupNotifyPolicyResponseBody create() {
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
     * @return result
     */
    public Integer getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Integer result; 
        private String success; 

        /**
         * The number of entries that are returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the call succeeds. Valid values:
         * <p>
         * 
         * *   true: The call succeeds.
         * *   false: The call fails.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * If the policy is valid, no alert notifications are sent for the application group.
         * <p>
         * 
         * This topic describes how to create the `PauseNotify` policy to pause alert notifications for the `7301****` application group. The StartTime parameter is set to `1622949300000` and the EndTime parameter is set to `1623208500000`. This indicates that the policy is valid from `2021-06-06 11:15:00 UTC+8` to `2021-06-09 11:15:00 UTC+8`.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * For more information about common request parameters, see [Common parameters](~~199331~~).
         */
        public Builder result(Integer result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateMonitorGroupNotifyPolicyResponseBody build() {
            return new CreateMonitorGroupNotifyPolicyResponseBody(this);
        } 

    } 

}
