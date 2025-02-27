// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBTablesRecoveryStateResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBTablesRecoveryStateResponse</p>
 */
public class DescribeDBTablesRecoveryStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBTablesRecoveryStateResponseBody body;

    private DescribeDBTablesRecoveryStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBTablesRecoveryStateResponse create() {
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
    public DescribeDBTablesRecoveryStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBTablesRecoveryStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBTablesRecoveryStateResponseBody body);

        @Override
        DescribeDBTablesRecoveryStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBTablesRecoveryStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBTablesRecoveryStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBTablesRecoveryStateResponse response) {
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
        public Builder body(DescribeDBTablesRecoveryStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBTablesRecoveryStateResponse build() {
            return new DescribeDBTablesRecoveryStateResponse(this);
        } 

    } 

}
