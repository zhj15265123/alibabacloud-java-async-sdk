// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateK8sIngressRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateK8sIngressRuleResponseBody</p>
 */
public class CreateK8sIngressRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    private CreateK8sIngressRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateK8sIngressRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public CreateK8sIngressRuleResponseBody build() {
            return new CreateK8sIngressRuleResponseBody(this);
        } 

    } 

}
