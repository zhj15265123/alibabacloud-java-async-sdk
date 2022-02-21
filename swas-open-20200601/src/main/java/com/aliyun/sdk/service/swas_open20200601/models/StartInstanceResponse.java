// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartInstanceResponse} extends {@link TeaModel}
 *
 * <p>StartInstanceResponse</p>
 */
public class StartInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartInstanceResponseBody body;

    private StartInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartInstanceResponse create() {
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
    public StartInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartInstanceResponseBody body);

        @Override
        StartInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartInstanceResponse response) {
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
        public Builder body(StartInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartInstanceResponse build() {
            return new StartInstanceResponse(this);
        } 

    } 

}
