// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAnalysisJobListResponse} extends {@link TeaModel}
 *
 * <p>QueryAnalysisJobListResponse</p>
 */
public class QueryAnalysisJobListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAnalysisJobListResponseBody body;

    private QueryAnalysisJobListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAnalysisJobListResponse create() {
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
    public QueryAnalysisJobListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAnalysisJobListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAnalysisJobListResponseBody body);

        @Override
        QueryAnalysisJobListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAnalysisJobListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAnalysisJobListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAnalysisJobListResponse response) {
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
        public Builder body(QueryAnalysisJobListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAnalysisJobListResponse build() {
            return new QueryAnalysisJobListResponse(this);
        } 

    } 

}
