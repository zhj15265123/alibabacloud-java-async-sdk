// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIpResponseBody} extends {@link TeaModel}
 *
 * <p>AddIpResponseBody</p>
 */
public class AddIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AddIpResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpResponseBody create() {
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
         * Adds IP addresses to an Anti-DDoS Origin Enterprise instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddIpResponseBody build() {
            return new AddIpResponseBody(this);
        } 

    } 

}
