// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAuditSecurityIpRequest} extends {@link RequestModel}
 *
 * <p>SetAuditSecurityIpRequest</p>
 */
public class SetAuditSecurityIpRequest extends Request {
    @Query
    @NameInMap("Ips")
    @Validation(required = true)
    private String ips;

    @Query
    @NameInMap("OperateMode")
    private String operateMode;

    @Query
    @NameInMap("SecurityGroupName")
    private String securityGroupName;

    private SetAuditSecurityIpRequest(Builder builder) {
        super(builder);
        this.ips = builder.ips;
        this.operateMode = builder.operateMode;
        this.securityGroupName = builder.securityGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAuditSecurityIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ips
     */
    public String getIps() {
        return this.ips;
    }

    /**
     * @return operateMode
     */
    public String getOperateMode() {
        return this.operateMode;
    }

    /**
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public static final class Builder extends Request.Builder<SetAuditSecurityIpRequest, Builder> {
        private String ips; 
        private String operateMode; 
        private String securityGroupName; 

        private Builder() {
            super();
        } 

        private Builder(SetAuditSecurityIpRequest request) {
            super(request);
            this.ips = request.ips;
            this.operateMode = request.operateMode;
            this.securityGroupName = request.securityGroupName;
        } 

        /**
         * The IP addresses to be added to a review security group. You can add a maximum of 100 IP addresses to each review security group. Separate multiple IP addresses with commas (,). You can enter individual IP addresses or a CIDR block.
         * <p>
         * 
         * *   Individual IP address: for example, 10.23.12.24
         * *   CIDR block: for example, 10.23.12.24/24, where /24 indicates that the prefix of the CIDR block is 24 bits in length. You can replace 24 with a value that ranges from `1 to 32`.
         */
        public Builder ips(String ips) {
            this.putQueryParameter("Ips", ips);
            this.ips = ips;
            return this;
        }

        /**
         * The operation type. Valid values:
         * <p>
         * 
         * *   **Append**: adds the IP addresses to the original whitelist. This is the default value.
         * *   **Cover**: overwrites the original whitelist.
         * *   **Delete**: removes the IP addresses from the original whitelist.
         */
        public Builder operateMode(String operateMode) {
            this.putQueryParameter("OperateMode", operateMode);
            this.operateMode = operateMode;
            return this;
        }

        /**
         * The name of the review security group. Default value: **Default**. You can specify a maximum of 10 review security groups.
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        @Override
        public SetAuditSecurityIpRequest build() {
            return new SetAuditSecurityIpRequest(this);
        } 

    } 

}
