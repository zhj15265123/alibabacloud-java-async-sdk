// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrganizationalUnitParentsRequest} extends {@link RequestModel}
 *
 * <p>ListOrganizationalUnitParentsRequest</p>
 */
public class ListOrganizationalUnitParentsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    @Query
    @NameInMap("OrganizationalUnitId")
    @Validation(required = true, maxLength = 64)
    private String organizationalUnitId;

    private ListOrganizationalUnitParentsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.organizationalUnitId = builder.organizationalUnitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationalUnitParentsRequest create() {
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
     * @return organizationalUnitId
     */
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    public static final class Builder extends Request.Builder<ListOrganizationalUnitParentsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String organizationalUnitId; 

        private Builder() {
            super();
        } 

        private Builder(ListOrganizationalUnitParentsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.organizationalUnitId = request.organizationalUnitId;
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
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 组织ID。
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.putQueryParameter("OrganizationalUnitId", organizationalUnitId);
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }

        @Override
        public ListOrganizationalUnitParentsRequest build() {
            return new ListOrganizationalUnitParentsRequest(this);
        } 

    } 

}
