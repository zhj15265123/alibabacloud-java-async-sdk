// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileResponse} extends {@link TeaModel}
 *
 * <p>GetFileResponse</p>
 */
public class GetFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFileResponseBody body;

    private GetFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFileResponse create() {
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
    public GetFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFileResponseBody body);

        @Override
        GetFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFileResponse response) {
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
        public Builder body(GetFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFileResponse build() {
            return new GetFileResponse(this);
        } 

    } 

}
