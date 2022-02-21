// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigurationResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigurationResponse</p>
 */
public class DescribeConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigurationResponseBody body;

    private DescribeConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigurationResponse create() {
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
    public DescribeConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigurationResponseBody body);

        @Override
        DescribeConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigurationResponse response) {
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
        public Builder body(DescribeConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigurationResponse build() {
            return new DescribeConfigurationResponse(this);
        } 

    } 

}
