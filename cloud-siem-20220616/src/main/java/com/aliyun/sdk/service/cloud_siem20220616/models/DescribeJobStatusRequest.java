// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobStatusRequest</p>
 */
public class DescribeJobStatusRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SubmitId")
    @Validation(required = true)
    private String submitId;

    private DescribeJobStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.submitId = builder.submitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobStatusRequest create() {
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
     * @return submitId
     */
    public String getSubmitId() {
        return this.submitId;
    }

    public static final class Builder extends Request.Builder<DescribeJobStatusRequest, Builder> {
        private String regionId; 
        private String submitId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.submitId = request.submitId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SubmitId.
         */
        public Builder submitId(String submitId) {
            this.putBodyParameter("SubmitId", submitId);
            this.submitId = submitId;
            return this;
        }

        @Override
        public DescribeJobStatusRequest build() {
            return new DescribeJobStatusRequest(this);
        } 

    } 

}
