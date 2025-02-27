// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMcubeRsaKeyResponse} extends {@link TeaModel}
 *
 * <p>UploadMcubeRsaKeyResponse</p>
 */
public class UploadMcubeRsaKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadMcubeRsaKeyResponseBody body;

    private UploadMcubeRsaKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadMcubeRsaKeyResponse create() {
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
    public UploadMcubeRsaKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadMcubeRsaKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadMcubeRsaKeyResponseBody body);

        @Override
        UploadMcubeRsaKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadMcubeRsaKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadMcubeRsaKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadMcubeRsaKeyResponse response) {
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
        public Builder body(UploadMcubeRsaKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadMcubeRsaKeyResponse build() {
            return new UploadMcubeRsaKeyResponse(this);
        } 

    } 

}
