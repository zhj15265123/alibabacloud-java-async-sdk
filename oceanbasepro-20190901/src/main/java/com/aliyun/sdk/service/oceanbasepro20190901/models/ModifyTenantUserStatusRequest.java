// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantUserStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantUserStatusRequest</p>
 */
public class ModifyTenantUserStatusRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    @Body
    @NameInMap("UserStatus")
    @Validation(required = true)
    private String userStatus;

    private ModifyTenantUserStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.tenantId = builder.tenantId;
        this.userName = builder.userName;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantUserStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userStatus
     */
    public String getUserStatus() {
        return this.userStatus;
    }

    public static final class Builder extends Request.Builder<ModifyTenantUserStatusRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String tenantId; 
        private String userName; 
        private String userStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantUserStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.tenantId = request.tenantId;
            this.userName = request.userName;
            this.userStatus = request.userStatus;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The operation that you want to perform.   
         * <p>
         * Set the value to **ModifyTenantUserStatus**.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The list of database accounts in the tenant.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * The status of the database account. Valid values:   
         * <p>
         * - Locked: The account is locked. 
         * - Online: The account is unlocked.
         */
        public Builder userStatus(String userStatus) {
            this.putBodyParameter("UserStatus", userStatus);
            this.userStatus = userStatus;
            return this;
        }

        @Override
        public ModifyTenantUserStatusRequest build() {
            return new ModifyTenantUserStatusRequest(this);
        } 

    } 

}
