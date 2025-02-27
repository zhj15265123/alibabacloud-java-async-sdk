// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdvicesPageResponse} extends {@link TeaModel}
 *
 * <p>DescribeAdvicesPageResponse</p>
 */
public class DescribeAdvicesPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAdvicesPageResponseBody body;

    private DescribeAdvicesPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAdvicesPageResponse create() {
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
    public DescribeAdvicesPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAdvicesPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAdvicesPageResponseBody body);

        @Override
        DescribeAdvicesPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAdvicesPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAdvicesPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAdvicesPageResponse response) {
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
        public Builder body(DescribeAdvicesPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAdvicesPageResponse build() {
            return new DescribeAdvicesPageResponse(this);
        } 

    } 

}
