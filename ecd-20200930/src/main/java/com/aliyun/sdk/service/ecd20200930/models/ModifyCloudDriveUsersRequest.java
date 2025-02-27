// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCloudDriveUsersRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudDriveUsersRequest</p>
 */
public class ModifyCloudDriveUsersRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("EndUserId")
    @Validation(required = true)
    private java.util.List < String > endUserId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("UserMaxSize")
    private Long userMaxSize;

    private ModifyCloudDriveUsersRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.endUserId = builder.endUserId;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.userMaxSize = builder.userMaxSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudDriveUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return endUserId
     */
    public java.util.List < String > getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userMaxSize
     */
    public Long getUserMaxSize() {
        return this.userMaxSize;
    }

    public static final class Builder extends Request.Builder<ModifyCloudDriveUsersRequest, Builder> {
        private String cdsId; 
        private java.util.List < String > endUserId; 
        private String regionId; 
        private String status; 
        private Long userMaxSize; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudDriveUsersRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.endUserId = request.endUserId;
            this.regionId = request.regionId;
            this.status = request.status;
            this.userMaxSize = request.userMaxSize;
        } 

        /**
         * CdsId.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(java.util.List < String > endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UserMaxSize.
         */
        public Builder userMaxSize(Long userMaxSize) {
            this.putQueryParameter("UserMaxSize", userMaxSize);
            this.userMaxSize = userMaxSize;
            return this;
        }

        @Override
        public ModifyCloudDriveUsersRequest build() {
            return new ModifyCloudDriveUsersRequest(this);
        } 

    } 

}
