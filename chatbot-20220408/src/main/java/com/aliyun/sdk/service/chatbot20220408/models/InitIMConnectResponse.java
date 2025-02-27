// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitIMConnectResponse} extends {@link TeaModel}
 *
 * <p>InitIMConnectResponse</p>
 */
public class InitIMConnectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitIMConnectResponseBody body;

    private InitIMConnectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitIMConnectResponse create() {
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
    public InitIMConnectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitIMConnectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitIMConnectResponseBody body);

        @Override
        InitIMConnectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitIMConnectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitIMConnectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitIMConnectResponse response) {
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
        public Builder body(InitIMConnectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitIMConnectResponse build() {
            return new InitIMConnectResponse(this);
        } 

    } 

}
