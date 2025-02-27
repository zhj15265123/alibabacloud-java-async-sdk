// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyCoordinatePrivilegeResponse} extends {@link TeaModel}
 *
 * <p>ApplyCoordinatePrivilegeResponse</p>
 */
public class ApplyCoordinatePrivilegeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyCoordinatePrivilegeResponseBody body;

    private ApplyCoordinatePrivilegeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyCoordinatePrivilegeResponse create() {
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
    public ApplyCoordinatePrivilegeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyCoordinatePrivilegeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyCoordinatePrivilegeResponseBody body);

        @Override
        ApplyCoordinatePrivilegeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyCoordinatePrivilegeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyCoordinatePrivilegeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyCoordinatePrivilegeResponse response) {
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
        public Builder body(ApplyCoordinatePrivilegeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyCoordinatePrivilegeResponse build() {
            return new ApplyCoordinatePrivilegeResponse(this);
        } 

    } 

}
