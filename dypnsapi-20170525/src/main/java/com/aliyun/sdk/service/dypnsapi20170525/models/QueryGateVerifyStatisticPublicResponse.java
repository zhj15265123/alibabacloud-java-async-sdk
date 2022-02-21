// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGateVerifyStatisticPublicResponse} extends {@link TeaModel}
 *
 * <p>QueryGateVerifyStatisticPublicResponse</p>
 */
public class QueryGateVerifyStatisticPublicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryGateVerifyStatisticPublicResponseBody body;

    private QueryGateVerifyStatisticPublicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryGateVerifyStatisticPublicResponse create() {
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
    public QueryGateVerifyStatisticPublicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryGateVerifyStatisticPublicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryGateVerifyStatisticPublicResponseBody body);

        @Override
        QueryGateVerifyStatisticPublicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryGateVerifyStatisticPublicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryGateVerifyStatisticPublicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryGateVerifyStatisticPublicResponse response) {
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
        public Builder body(QueryGateVerifyStatisticPublicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryGateVerifyStatisticPublicResponse build() {
            return new QueryGateVerifyStatisticPublicResponse(this);
        } 

    } 

}
