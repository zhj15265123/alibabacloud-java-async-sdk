// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDoctorComputeSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetDoctorComputeSummaryRequest</p>
 */
public class GetDoctorComputeSummaryRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComponentInfo")
    private ComponentInfo componentInfo;

    @Query
    @NameInMap("DateTime")
    @Validation(required = true)
    private String dateTime;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetDoctorComputeSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentInfo = builder.componentInfo;
        this.dateTime = builder.dateTime;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorComputeSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return componentInfo
     */
    public ComponentInfo getComponentInfo() {
        return this.componentInfo;
    }

    /**
     * @return dateTime
     */
    public String getDateTime() {
        return this.dateTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDoctorComputeSummaryRequest, Builder> {
        private String clusterId; 
        private ComponentInfo componentInfo; 
        private String dateTime; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDoctorComputeSummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentInfo = request.componentInfo;
            this.dateTime = request.dateTime;
            this.regionId = request.regionId;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ComponentInfo.
         */
        public Builder componentInfo(ComponentInfo componentInfo) {
            this.putQueryParameter("ComponentInfo", componentInfo);
            this.componentInfo = componentInfo;
            return this;
        }

        /**
         * DateTime.
         */
        public Builder dateTime(String dateTime) {
            this.putQueryParameter("DateTime", dateTime);
            this.dateTime = dateTime;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetDoctorComputeSummaryRequest build() {
            return new GetDoctorComputeSummaryRequest(this);
        } 

    } 

    public static class ComponentInfo extends TeaModel {
        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("ComponentType")
        private String componentType;

        private ComponentInfo(Builder builder) {
            this.componentName = builder.componentName;
            this.componentType = builder.componentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentInfo create() {
            return builder().build();
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        public static final class Builder {
            private String componentName; 
            private String componentType; 

            /**
             * ComponentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            public ComponentInfo build() {
                return new ComponentInfo(this);
            } 

        } 

    }
}
