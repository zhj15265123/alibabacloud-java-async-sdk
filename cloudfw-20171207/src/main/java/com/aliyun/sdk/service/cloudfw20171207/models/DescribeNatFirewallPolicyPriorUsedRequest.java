// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNatFirewallPolicyPriorUsedRequest} extends {@link RequestModel}
 *
 * <p>DescribeNatFirewallPolicyPriorUsedRequest</p>
 */
public class DescribeNatFirewallPolicyPriorUsedRequest extends Request {
    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("IpVersion")
    private String ipVersion;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    private DescribeNatFirewallPolicyPriorUsedRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.ipVersion = builder.ipVersion;
        this.lang = builder.lang;
        this.natGatewayId = builder.natGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallPolicyPriorUsedRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public static final class Builder extends Request.Builder<DescribeNatFirewallPolicyPriorUsedRequest, Builder> {
        private String direction; 
        private String ipVersion; 
        private String lang; 
        private String natGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNatFirewallPolicyPriorUsedRequest request) {
            super(request);
            this.direction = request.direction;
            this.ipVersion = request.ipVersion;
            this.lang = request.lang;
            this.natGatewayId = request.natGatewayId;
        } 

        /**
         * The direction of the traffic to which the access control policy applies.
         * <p>
         * 
         * Valid values:
         * 
         * *   **out**: outbound traffic
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The IP version supported by the access control policy. Valid values:
         * <p>
         * 
         * *   **4**: IPv4 (default)
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the NAT gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        @Override
        public DescribeNatFirewallPolicyPriorUsedRequest build() {
            return new DescribeNatFirewallPolicyPriorUsedRequest(this);
        } 

    } 

}
