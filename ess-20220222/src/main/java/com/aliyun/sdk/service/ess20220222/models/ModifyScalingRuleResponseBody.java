// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyScalingRuleResponseBody</p>
 */
public class ModifyScalingRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyScalingRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * 4454
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyScalingRuleResponseBody build() {
            return new ModifyScalingRuleResponseBody(this);
        } 

    } 

}
