// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableApplicationSsoResponse} extends {@link TeaModel}
 *
 * <p>EnableApplicationSsoResponse</p>
 */
public class EnableApplicationSsoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableApplicationSsoResponseBody body;

    private EnableApplicationSsoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableApplicationSsoResponse create() {
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
    public EnableApplicationSsoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableApplicationSsoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableApplicationSsoResponseBody body);

        @Override
        EnableApplicationSsoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableApplicationSsoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableApplicationSsoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableApplicationSsoResponse response) {
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
        public Builder body(EnableApplicationSsoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableApplicationSsoResponse build() {
            return new EnableApplicationSsoResponse(this);
        } 

    } 

}
