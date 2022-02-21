// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpareIpsResponse} extends {@link TeaModel}
 *
 * <p>CreateSpareIpsResponse</p>
 */
public class CreateSpareIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSpareIpsResponseBody body;

    private CreateSpareIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSpareIpsResponse create() {
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
    public CreateSpareIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSpareIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSpareIpsResponseBody body);

        @Override
        CreateSpareIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSpareIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSpareIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSpareIpsResponse response) {
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
        public Builder body(CreateSpareIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSpareIpsResponse build() {
            return new CreateSpareIpsResponse(this);
        } 

    } 

}
