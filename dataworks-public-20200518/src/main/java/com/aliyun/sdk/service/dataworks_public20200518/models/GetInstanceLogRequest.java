// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceLogRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceLogRequest</p>
 */
public class GetInstanceLogRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("InstanceHistoryId")
    private Long instanceHistoryId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private Long instanceId;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    private GetInstanceLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceHistoryId = builder.instanceHistoryId;
        this.instanceId = builder.instanceId;
        this.projectEnv = builder.projectEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceLogRequest create() {
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
     * @return instanceHistoryId
     */
    public Long getInstanceHistoryId() {
        return this.instanceHistoryId;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public static final class Builder extends Request.Builder<GetInstanceLogRequest, Builder> {
        private String regionId; 
        private Long instanceHistoryId; 
        private Long instanceId; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceHistoryId = request.instanceHistoryId;
            this.instanceId = request.instanceId;
            this.projectEnv = request.projectEnv;
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
         * The historical record number of the instance. You can call the ListInstanceHistory operation to query the ID.
         */
        public Builder instanceHistoryId(Long instanceHistoryId) {
            this.putBodyParameter("InstanceHistoryId", instanceHistoryId);
            this.instanceHistoryId = instanceHistoryId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The environment of the workspace. Valid values: PROD and DEV.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public GetInstanceLogRequest build() {
            return new GetInstanceLogRequest(this);
        } 

    } 

}
