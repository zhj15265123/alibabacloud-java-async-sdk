// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMyBaseResponse} extends {@link TeaModel}
 *
 * <p>CreateMyBaseResponse</p>
 */
public class CreateMyBaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMyBaseResponseBody body;

    private CreateMyBaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMyBaseResponse create() {
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
    public CreateMyBaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMyBaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMyBaseResponseBody body);

        @Override
        CreateMyBaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMyBaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMyBaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMyBaseResponse response) {
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
        public Builder body(CreateMyBaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMyBaseResponse build() {
            return new CreateMyBaseResponse(this);
        } 

    } 

}
