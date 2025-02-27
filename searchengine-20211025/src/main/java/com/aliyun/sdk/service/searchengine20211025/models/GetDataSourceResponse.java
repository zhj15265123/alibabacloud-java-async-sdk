// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceResponse} extends {@link TeaModel}
 *
 * <p>GetDataSourceResponse</p>
 */
public class GetDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataSourceResponseBody body;

    private GetDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataSourceResponse create() {
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
    public GetDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataSourceResponseBody body);

        @Override
        GetDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataSourceResponse response) {
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
        public Builder body(GetDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataSourceResponse build() {
            return new GetDataSourceResponse(this);
        } 

    } 

}
