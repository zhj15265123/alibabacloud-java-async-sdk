// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigsResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigsResponse</p>
 */
public class DescribeConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigsResponseBody body;

    private DescribeConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigsResponse create() {
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
    public DescribeConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigsResponseBody body);

        @Override
        DescribeConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigsResponse response) {
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
        public Builder body(DescribeConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigsResponse build() {
            return new DescribeConfigsResponse(this);
        } 

    } 

}
