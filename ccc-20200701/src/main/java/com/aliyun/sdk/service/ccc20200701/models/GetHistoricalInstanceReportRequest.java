// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoricalInstanceReportRequest} extends {@link RequestModel}
 *
 * <p>GetHistoricalInstanceReportRequest</p>
 */
public class GetHistoricalInstanceReportRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(maximum = 4133952000000D)
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("StartTime")
    @Validation(maximum = 4133952000000D)
    private Long startTime;

    private GetHistoricalInstanceReportRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoricalInstanceReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetHistoricalInstanceReportRequest, Builder> {
        private Long endTime; 
        private String instanceId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetHistoricalInstanceReportRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetHistoricalInstanceReportRequest build() {
            return new GetHistoricalInstanceReportRequest(this);
        } 

    } 

}
