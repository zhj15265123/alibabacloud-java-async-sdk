// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SupportDBTableRecoveryResponse} extends {@link TeaModel}
 *
 * <p>SupportDBTableRecoveryResponse</p>
 */
public class SupportDBTableRecoveryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SupportDBTableRecoveryResponseBody body;

    private SupportDBTableRecoveryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SupportDBTableRecoveryResponse create() {
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
    public SupportDBTableRecoveryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SupportDBTableRecoveryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SupportDBTableRecoveryResponseBody body);

        @Override
        SupportDBTableRecoveryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SupportDBTableRecoveryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SupportDBTableRecoveryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SupportDBTableRecoveryResponse response) {
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
        public Builder body(SupportDBTableRecoveryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SupportDBTableRecoveryResponse build() {
            return new SupportDBTableRecoveryResponse(this);
        } 

    } 

}
