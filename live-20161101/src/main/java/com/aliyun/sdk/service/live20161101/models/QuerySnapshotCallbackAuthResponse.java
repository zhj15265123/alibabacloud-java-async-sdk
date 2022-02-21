// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySnapshotCallbackAuthResponse} extends {@link TeaModel}
 *
 * <p>QuerySnapshotCallbackAuthResponse</p>
 */
public class QuerySnapshotCallbackAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySnapshotCallbackAuthResponseBody body;

    private QuerySnapshotCallbackAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySnapshotCallbackAuthResponse create() {
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
    public QuerySnapshotCallbackAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySnapshotCallbackAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySnapshotCallbackAuthResponseBody body);

        @Override
        QuerySnapshotCallbackAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySnapshotCallbackAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySnapshotCallbackAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySnapshotCallbackAuthResponse response) {
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
        public Builder body(QuerySnapshotCallbackAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySnapshotCallbackAuthResponse build() {
            return new QuerySnapshotCallbackAuthResponse(this);
        } 

    } 

}
