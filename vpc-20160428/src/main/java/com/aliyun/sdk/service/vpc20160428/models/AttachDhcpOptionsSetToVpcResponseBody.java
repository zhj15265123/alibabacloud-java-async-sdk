// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDhcpOptionsSetToVpcResponseBody} extends {@link TeaModel}
 *
 * <p>AttachDhcpOptionsSetToVpcResponseBody</p>
 */
public class AttachDhcpOptionsSetToVpcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AttachDhcpOptionsSetToVpcResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDhcpOptionsSetToVpcResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AttachDhcpOptionsSetToVpcResponseBody build() {
            return new AttachDhcpOptionsSetToVpcResponseBody(this);
        } 

    } 

}
