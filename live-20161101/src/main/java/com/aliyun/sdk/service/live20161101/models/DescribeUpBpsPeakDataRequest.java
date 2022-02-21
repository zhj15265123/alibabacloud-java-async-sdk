// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpBpsPeakDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeUpBpsPeakDataRequest</p>
 */
public class DescribeUpBpsPeakDataRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("DomainSwitch")
    private String domainSwitch;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeUpBpsPeakDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.domainSwitch = builder.domainSwitch;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpBpsPeakDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainSwitch
     */
    public String getDomainSwitch() {
        return this.domainSwitch;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeUpBpsPeakDataRequest, Builder> {
        private String domainName; 
        private String domainSwitch; 
        private String endTime; 
        private Long ownerId; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUpBpsPeakDataRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.domainSwitch = response.domainSwitch;
            this.endTime = response.endTime;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainSwitch.
         */
        public Builder domainSwitch(String domainSwitch) {
            this.putQueryParameter("DomainSwitch", domainSwitch);
            this.domainSwitch = domainSwitch;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeUpBpsPeakDataRequest build() {
            return new DescribeUpBpsPeakDataRequest(this);
        } 

    } 

}
