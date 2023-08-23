// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTrFirewallV2RoutePolicyScopeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTrFirewallV2RoutePolicyScopeResponseBody</p>
 */
public class ModifyTrFirewallV2RoutePolicyScopeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrFirewallRoutePolicyId")
    private String trFirewallRoutePolicyId;

    private ModifyTrFirewallV2RoutePolicyScopeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trFirewallRoutePolicyId = builder.trFirewallRoutePolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTrFirewallV2RoutePolicyScopeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trFirewallRoutePolicyId
     */
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

    public static final class Builder {
        private String requestId; 
        private String trFirewallRoutePolicyId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrFirewallRoutePolicyId.
         */
        public Builder trFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
            this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
            return this;
        }

        public ModifyTrFirewallV2RoutePolicyScopeResponseBody build() {
            return new ModifyTrFirewallV2RoutePolicyScopeResponseBody(this);
        } 

    } 

}
