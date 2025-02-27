// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableRightsSeparationResponse} extends {@link TeaModel}
 *
 * <p>DisableRightsSeparationResponse</p>
 */
public class DisableRightsSeparationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableRightsSeparationResponseBody body;

    private DisableRightsSeparationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableRightsSeparationResponse create() {
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
    public DisableRightsSeparationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableRightsSeparationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableRightsSeparationResponseBody body);

        @Override
        DisableRightsSeparationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableRightsSeparationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableRightsSeparationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableRightsSeparationResponse response) {
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
        public Builder body(DisableRightsSeparationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableRightsSeparationResponse build() {
            return new DisableRightsSeparationResponse(this);
        } 

    } 

}
