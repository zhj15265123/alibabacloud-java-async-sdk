// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertLogListResponse} extends {@link TeaModel}
 *
 * <p>DescribeAlertLogListResponse</p>
 */
public class DescribeAlertLogListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAlertLogListResponseBody body;

    private DescribeAlertLogListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAlertLogListResponse create() {
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
    public DescribeAlertLogListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAlertLogListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAlertLogListResponseBody body);

        @Override
        DescribeAlertLogListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAlertLogListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAlertLogListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAlertLogListResponse response) {
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
        public Builder body(DescribeAlertLogListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAlertLogListResponse build() {
            return new DescribeAlertLogListResponse(this);
        } 

    } 

}
