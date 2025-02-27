// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartShiftLoadBalancerZonesResponseBody} extends {@link TeaModel}
 *
 * <p>StartShiftLoadBalancerZonesResponseBody</p>
 */
public class StartShiftLoadBalancerZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StartShiftLoadBalancerZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartShiftLoadBalancerZonesResponseBody create() {
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

        public StartShiftLoadBalancerZonesResponseBody build() {
            return new StartShiftLoadBalancerZonesResponseBody(this);
        } 

    } 

}
