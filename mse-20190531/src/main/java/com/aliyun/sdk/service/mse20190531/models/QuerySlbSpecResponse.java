// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySlbSpecResponse} extends {@link TeaModel}
 *
 * <p>QuerySlbSpecResponse</p>
 */
public class QuerySlbSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySlbSpecResponseBody body;

    private QuerySlbSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySlbSpecResponse create() {
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
    public QuerySlbSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySlbSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySlbSpecResponseBody body);

        @Override
        QuerySlbSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySlbSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySlbSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySlbSpecResponse response) {
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
        public Builder body(QuerySlbSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySlbSpecResponse build() {
            return new QuerySlbSpecResponse(this);
        } 

    } 

}
