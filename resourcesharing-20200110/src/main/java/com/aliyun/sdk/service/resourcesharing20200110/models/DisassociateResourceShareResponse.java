// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisassociateResourceShareResponse} extends {@link TeaModel}
 *
 * <p>DisassociateResourceShareResponse</p>
 */
public class DisassociateResourceShareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisassociateResourceShareResponseBody body;

    private DisassociateResourceShareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisassociateResourceShareResponse create() {
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
    public DisassociateResourceShareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisassociateResourceShareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisassociateResourceShareResponseBody body);

        @Override
        DisassociateResourceShareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisassociateResourceShareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisassociateResourceShareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisassociateResourceShareResponse response) {
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
        public Builder body(DisassociateResourceShareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisassociateResourceShareResponse build() {
            return new DisassociateResourceShareResponse(this);
        } 

    } 

}
