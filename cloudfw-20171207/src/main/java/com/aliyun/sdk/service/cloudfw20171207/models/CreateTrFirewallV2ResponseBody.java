// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrFirewallV2ResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrFirewallV2ResponseBody</p>
 */
public class CreateTrFirewallV2ResponseBody extends TeaModel {
    @NameInMap("FirewallId")
    private String firewallId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateTrFirewallV2ResponseBody(Builder builder) {
        this.firewallId = builder.firewallId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrFirewallV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return firewallId
     */
    public String getFirewallId() {
        return this.firewallId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String firewallId; 
        private String requestId; 

        /**
         * FirewallId.
         */
        public Builder firewallId(String firewallId) {
            this.firewallId = firewallId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateTrFirewallV2ResponseBody build() {
            return new CreateTrFirewallV2ResponseBody(this);
        } 

    } 

}
