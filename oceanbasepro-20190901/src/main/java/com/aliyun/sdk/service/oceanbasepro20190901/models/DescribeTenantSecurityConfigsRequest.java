// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantSecurityConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTenantSecurityConfigsRequest</p>
 */
public class DescribeTenantSecurityConfigsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("CheckId")
    private String checkId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private DescribeTenantSecurityConfigsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkId = builder.checkId;
        this.instanceId = builder.instanceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantSecurityConfigsRequest create() {
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
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
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

    public static final class Builder extends Request.Builder<DescribeTenantSecurityConfigsRequest, Builder> {
        private String regionId; 
        private String checkId; 
        private String instanceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTenantSecurityConfigsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkId = request.checkId;
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
         * CheckId.
         */
        public Builder checkId(String checkId) {
            this.putBodyParameter("CheckId", checkId);
            this.checkId = checkId;
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
        public DescribeTenantSecurityConfigsRequest build() {
            return new DescribeTenantSecurityConfigsRequest(this);
        } 

    } 

}
