// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMpaasAppInfoResponse} extends {@link TeaModel}
 *
 * <p>UpdateMpaasAppInfoResponse</p>
 */
public class UpdateMpaasAppInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMpaasAppInfoResponseBody body;

    private UpdateMpaasAppInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMpaasAppInfoResponse create() {
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
    public UpdateMpaasAppInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMpaasAppInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMpaasAppInfoResponseBody body);

        @Override
        UpdateMpaasAppInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMpaasAppInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMpaasAppInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMpaasAppInfoResponse response) {
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
        public Builder body(UpdateMpaasAppInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMpaasAppInfoResponse build() {
            return new UpdateMpaasAppInfoResponse(this);
        } 

    } 

}
