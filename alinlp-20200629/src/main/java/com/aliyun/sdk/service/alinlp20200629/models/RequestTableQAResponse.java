// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestTableQAResponse} extends {@link TeaModel}
 *
 * <p>RequestTableQAResponse</p>
 */
public class RequestTableQAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RequestTableQAResponseBody body;

    private RequestTableQAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RequestTableQAResponse create() {
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
    public RequestTableQAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RequestTableQAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RequestTableQAResponseBody body);

        @Override
        RequestTableQAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RequestTableQAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RequestTableQAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RequestTableQAResponse response) {
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
        public Builder body(RequestTableQAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RequestTableQAResponse build() {
            return new RequestTableQAResponse(this);
        } 

    } 

}
