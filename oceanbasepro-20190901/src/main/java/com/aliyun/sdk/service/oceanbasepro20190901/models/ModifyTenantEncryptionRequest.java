// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantEncryptionRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantEncryptionRequest</p>
 */
public class ModifyTenantEncryptionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("EncryptionKeyId")
    private String encryptionKeyId;

    @Body
    @NameInMap("EncryptionType")
    @Validation(required = true)
    private String encryptionType;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private ModifyTenantEncryptionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.encryptionKeyId = builder.encryptionKeyId;
        this.encryptionType = builder.encryptionType;
        this.instanceId = builder.instanceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantEncryptionRequest create() {
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
     * @return encryptionKeyId
     */
    public String getEncryptionKeyId() {
        return this.encryptionKeyId;
    }

    /**
     * @return encryptionType
     */
    public String getEncryptionType() {
        return this.encryptionType;
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

    public static final class Builder extends Request.Builder<ModifyTenantEncryptionRequest, Builder> {
        private String regionId; 
        private String encryptionKeyId; 
        private String encryptionType; 
        private String instanceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantEncryptionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.encryptionKeyId = request.encryptionKeyId;
            this.encryptionType = request.encryptionType;
            this.instanceId = request.instanceId;
            this.tenantId = request.tenantId;
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
         * EncryptionKeyId.
         */
        public Builder encryptionKeyId(String encryptionKeyId) {
            this.putBodyParameter("EncryptionKeyId", encryptionKeyId);
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }

        /**
         * EncryptionType.
         */
        public Builder encryptionType(String encryptionType) {
            this.putBodyParameter("EncryptionType", encryptionType);
            this.encryptionType = encryptionType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ModifyTenantEncryptionRequest build() {
            return new ModifyTenantEncryptionRequest(this);
        } 

    } 

}
