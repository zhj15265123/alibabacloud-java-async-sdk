// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeHistoryTasksResponse</p>
 */
public class DescribeHistoryTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHistoryTasksResponseBody body;

    private DescribeHistoryTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHistoryTasksResponse create() {
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
    public DescribeHistoryTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHistoryTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHistoryTasksResponseBody body);

        @Override
        DescribeHistoryTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHistoryTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHistoryTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHistoryTasksResponse response) {
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
        public Builder body(DescribeHistoryTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHistoryTasksResponse build() {
            return new DescribeHistoryTasksResponse(this);
        } 

    } 

}
