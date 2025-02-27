// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySceneListResponse} extends {@link TeaModel}
 *
 * <p>QuerySceneListResponse</p>
 */
public class QuerySceneListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySceneListResponseBody body;

    private QuerySceneListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySceneListResponse create() {
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
    public QuerySceneListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySceneListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySceneListResponseBody body);

        @Override
        QuerySceneListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySceneListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySceneListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySceneListResponse response) {
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
        public Builder body(QuerySceneListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySceneListResponse build() {
            return new QuerySceneListResponse(this);
        } 

    } 

}
