// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNacosServiceResponse} extends {@link TeaModel}
 *
 * <p>UpdateNacosServiceResponse</p>
 */
public class UpdateNacosServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNacosServiceResponseBody body;

    private UpdateNacosServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNacosServiceResponse create() {
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
    public UpdateNacosServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNacosServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNacosServiceResponseBody body);

        @Override
        UpdateNacosServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNacosServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNacosServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNacosServiceResponse response) {
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
        public Builder body(UpdateNacosServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNacosServiceResponse build() {
            return new UpdateNacosServiceResponse(this);
        } 

    } 

}
