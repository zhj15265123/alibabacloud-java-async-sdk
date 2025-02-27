// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceVpcAuthModeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceVpcAuthModeResponseBody</p>
 */
public class ModifyInstanceVpcAuthModeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceVpcAuthModeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceVpcAuthModeResponseBody create() {
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
         * Specifies whether to enable authentication to allow access within a VPC. Valid values:
         * <p>
         * 
         * *   **Open**: enables password-free access.
         * *   **Close**: disables password-free access.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceVpcAuthModeResponseBody build() {
            return new ModifyInstanceVpcAuthModeResponseBody(this);
        } 

    } 

}
