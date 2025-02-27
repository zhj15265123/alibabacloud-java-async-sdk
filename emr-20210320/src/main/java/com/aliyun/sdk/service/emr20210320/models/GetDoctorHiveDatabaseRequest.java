// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDoctorHiveDatabaseRequest} extends {@link RequestModel}
 *
 * <p>GetDoctorHiveDatabaseRequest</p>
 */
public class GetDoctorHiveDatabaseRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DatabaseName")
    @Validation(required = true)
    private String databaseName;

    @Query
    @NameInMap("DateTime")
    @Validation(required = true)
    private String dateTime;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetDoctorHiveDatabaseRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.databaseName = builder.databaseName;
        this.dateTime = builder.dateTime;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHiveDatabaseRequest create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
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

    public static final class Builder extends Request.Builder<GetDoctorHiveDatabaseRequest, Builder> {
        private String clusterId; 
        private String databaseName; 
        private String dateTime; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDoctorHiveDatabaseRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.databaseName = request.databaseName;
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
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
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
        public GetDoctorHiveDatabaseRequest build() {
            return new GetDoctorHiveDatabaseRequest(this);
        } 

    } 

}
