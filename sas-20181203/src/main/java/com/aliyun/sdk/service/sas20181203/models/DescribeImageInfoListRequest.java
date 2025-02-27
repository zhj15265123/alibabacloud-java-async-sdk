// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageInfoListRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageInfoListRequest</p>
 */
public class DescribeImageInfoListRequest extends Request {
    @Query
    @NameInMap("Uuids")
    @Validation(required = true)
    private String uuids;

    private DescribeImageInfoListRequest(Builder builder) {
        super(builder);
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageInfoListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeImageInfoListRequest, Builder> {
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageInfoListRequest request) {
            super(request);
            this.uuids = request.uuids;
        } 

        /**
         * Uuids.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeImageInfoListRequest build() {
            return new DescribeImageInfoListRequest(this);
        } 

    } 

}
