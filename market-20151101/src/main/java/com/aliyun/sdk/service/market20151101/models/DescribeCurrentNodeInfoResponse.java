// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCurrentNodeInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeCurrentNodeInfoResponse</p>
 */
public class DescribeCurrentNodeInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCurrentNodeInfoResponseBody body;

    private DescribeCurrentNodeInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCurrentNodeInfoResponse create() {
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
    public DescribeCurrentNodeInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCurrentNodeInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCurrentNodeInfoResponseBody body);

        @Override
        DescribeCurrentNodeInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCurrentNodeInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCurrentNodeInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCurrentNodeInfoResponse response) {
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
        public Builder body(DescribeCurrentNodeInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCurrentNodeInfoResponse build() {
            return new DescribeCurrentNodeInfoResponse(this);
        } 

    } 

}
