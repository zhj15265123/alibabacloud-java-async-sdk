// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserVpc} extends {@link TeaModel}
 *
 * <p>UserVpc</p>
 */
public class UserVpc extends TeaModel {
    @NameInMap("ExtendedCIDRs")
    private java.util.List < String > extendedCIDRs;

    @NameInMap("RoleArn")
    private String roleArn;

    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @NameInMap("SwitchId")
    private String switchId;

    @NameInMap("VpcId")
    private String vpcId;

    private UserVpc(Builder builder) {
        this.extendedCIDRs = builder.extendedCIDRs;
        this.roleArn = builder.roleArn;
        this.securityGroupId = builder.securityGroupId;
        this.switchId = builder.switchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserVpc create() {
        return builder().build();
    }

    /**
     * @return extendedCIDRs
     */
    public java.util.List < String > getExtendedCIDRs() {
        return this.extendedCIDRs;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return switchId
     */
    public String getSwitchId() {
        return this.switchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private java.util.List < String > extendedCIDRs; 
        private String roleArn; 
        private String securityGroupId; 
        private String switchId; 
        private String vpcId; 

        /**
         * ExtendedCIDRs.
         */
        public Builder extendedCIDRs(java.util.List < String > extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SwitchId.
         */
        public Builder switchId(String switchId) {
            this.switchId = switchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public UserVpc build() {
            return new UserVpc(this);
        } 

    } 

}
