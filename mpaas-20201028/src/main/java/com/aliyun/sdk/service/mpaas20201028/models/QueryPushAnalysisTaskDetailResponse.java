// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPushAnalysisTaskDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryPushAnalysisTaskDetailResponse</p>
 */
public class QueryPushAnalysisTaskDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPushAnalysisTaskDetailResponseBody body;

    private QueryPushAnalysisTaskDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPushAnalysisTaskDetailResponse create() {
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
    public QueryPushAnalysisTaskDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPushAnalysisTaskDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPushAnalysisTaskDetailResponseBody body);

        @Override
        QueryPushAnalysisTaskDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPushAnalysisTaskDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPushAnalysisTaskDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPushAnalysisTaskDetailResponse response) {
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
        public Builder body(QueryPushAnalysisTaskDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPushAnalysisTaskDetailResponse build() {
            return new QueryPushAnalysisTaskDetailResponse(this);
        } 

    } 

}
