// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsResourceUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsResourceUsageRequest</p>
 */
public class DescribeEnsResourceUsageRequest extends Request {
    @Query
    @NameInMap("ExpiredEndTime")
    private String expiredEndTime;

    @Query
    @NameInMap("ExpiredStartTime")
    private String expiredStartTime;

    private DescribeEnsResourceUsageRequest(Builder builder) {
        super(builder);
        this.expiredEndTime = builder.expiredEndTime;
        this.expiredStartTime = builder.expiredStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsResourceUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expiredEndTime
     */
    public String getExpiredEndTime() {
        return this.expiredEndTime;
    }

    /**
     * @return expiredStartTime
     */
    public String getExpiredStartTime() {
        return this.expiredStartTime;
    }

    public static final class Builder extends Request.Builder<DescribeEnsResourceUsageRequest, Builder> {
        private String expiredEndTime; 
        private String expiredStartTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsResourceUsageRequest request) {
            super(request);
            this.expiredEndTime = request.expiredEndTime;
            this.expiredStartTime = request.expiredStartTime;
        } 

        /**
         * ExpiredEndTime.
         */
        public Builder expiredEndTime(String expiredEndTime) {
            this.putQueryParameter("ExpiredEndTime", expiredEndTime);
            this.expiredEndTime = expiredEndTime;
            return this;
        }

        /**
         * ExpiredStartTime.
         */
        public Builder expiredStartTime(String expiredStartTime) {
            this.putQueryParameter("ExpiredStartTime", expiredStartTime);
            this.expiredStartTime = expiredStartTime;
            return this;
        }

        @Override
        public DescribeEnsResourceUsageRequest build() {
            return new DescribeEnsResourceUsageRequest(this);
        } 

    } 

}
