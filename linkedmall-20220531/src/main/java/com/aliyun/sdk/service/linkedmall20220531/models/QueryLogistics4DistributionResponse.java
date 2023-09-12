// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLogistics4DistributionResponse} extends {@link TeaModel}
 *
 * <p>QueryLogistics4DistributionResponse</p>
 */
public class QueryLogistics4DistributionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private QueryLogistics4DistributionResponseBody body;

    private QueryLogistics4DistributionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryLogistics4DistributionResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public QueryLogistics4DistributionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryLogistics4DistributionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryLogistics4DistributionResponseBody body);

        @Override
        QueryLogistics4DistributionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryLogistics4DistributionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryLogistics4DistributionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryLogistics4DistributionResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(QueryLogistics4DistributionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryLogistics4DistributionResponse build() {
            return new QueryLogistics4DistributionResponse(this);
        } 

    } 

}
