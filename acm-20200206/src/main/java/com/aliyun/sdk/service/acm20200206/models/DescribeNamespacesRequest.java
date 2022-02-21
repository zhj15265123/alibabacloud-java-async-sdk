// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespacesRequest} extends {@link RequestModel}
 *
 * <p>DescribeNamespacesRequest</p>
 */
public class DescribeNamespacesRequest extends Request {
    private DescribeNamespacesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespacesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeNamespacesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeNamespacesRequest response) {
            super(response);
        } 

        @Override
        public DescribeNamespacesRequest build() {
            return new DescribeNamespacesRequest(this);
        } 

    } 

}
