// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetricRuleBlackListResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMetricRuleBlackListResponseBody</p>
 */
public class CreateMetricRuleBlackListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Id")
    private String id;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateMetricRuleBlackListResponseBody(Builder builder) {
        this.code = builder.code;
        this.id = builder.id;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetricRuleBlackListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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
        private String id; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The effective scope of the blacklist policy. Valid values:
         * <p>
         * 
         * *   USER: The blacklist policy takes effect only for the current Alibaba Cloud account.
         * 
         * *   GROUP: The blacklist policy takes effect only for the specified application group. This is the default value.
         * 
         *     For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
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
         * For more information about common request parameters, see [Common parameters](~~199331~~).
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateMetricRuleBlackListResponseBody build() {
            return new CreateMetricRuleBlackListResponseBody(this);
        } 

    } 

}
