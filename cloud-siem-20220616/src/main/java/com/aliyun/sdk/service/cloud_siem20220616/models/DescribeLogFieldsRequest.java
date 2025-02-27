// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogFieldsRequest} extends {@link RequestModel}
 *
 * <p>DescribeLogFieldsRequest</p>
 */
public class DescribeLogFieldsRequest extends Request {
    @Body
    @NameInMap("LogSource")
    private String logSource;

    @Body
    @NameInMap("LogType")
    private String logType;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DescribeLogFieldsRequest(Builder builder) {
        super(builder);
        this.logSource = builder.logSource;
        this.logType = builder.logType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogFieldsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logSource
     */
    public String getLogSource() {
        return this.logSource;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeLogFieldsRequest, Builder> {
        private String logSource; 
        private String logType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLogFieldsRequest request) {
            super(request);
            this.logSource = request.logSource;
            this.logType = request.logType;
            this.regionId = request.regionId;
        } 

        /**
         * LogSource.
         */
        public Builder logSource(String logSource) {
            this.putBodyParameter("LogSource", logSource);
            this.logSource = logSource;
            return this;
        }

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.putBodyParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeLogFieldsRequest build() {
            return new DescribeLogFieldsRequest(this);
        } 

    } 

}
