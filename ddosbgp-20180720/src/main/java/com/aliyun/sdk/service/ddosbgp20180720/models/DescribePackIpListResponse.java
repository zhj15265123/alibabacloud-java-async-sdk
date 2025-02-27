// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackIpListResponse} extends {@link TeaModel}
 *
 * <p>DescribePackIpListResponse</p>
 */
public class DescribePackIpListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePackIpListResponseBody body;

    private DescribePackIpListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePackIpListResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public DescribePackIpListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePackIpListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePackIpListResponseBody body);

        @Override
        DescribePackIpListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePackIpListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePackIpListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePackIpListResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribePackIpListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePackIpListResponse build() {
            return new DescribePackIpListResponse(this);
        } 

    } 

}
