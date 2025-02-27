// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMpsSchedulerListResponse} extends {@link TeaModel}
 *
 * <p>QueryMpsSchedulerListResponse</p>
 */
public class QueryMpsSchedulerListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMpsSchedulerListResponseBody body;

    private QueryMpsSchedulerListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMpsSchedulerListResponse create() {
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
    public QueryMpsSchedulerListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMpsSchedulerListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMpsSchedulerListResponseBody body);

        @Override
        QueryMpsSchedulerListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMpsSchedulerListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMpsSchedulerListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMpsSchedulerListResponse response) {
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
        public Builder body(QueryMpsSchedulerListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMpsSchedulerListResponse build() {
            return new QueryMpsSchedulerListResponse(this);
        } 

    } 

}
