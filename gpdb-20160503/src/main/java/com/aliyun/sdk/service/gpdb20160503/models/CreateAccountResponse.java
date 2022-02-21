// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountResponse} extends {@link TeaModel}
 *
 * <p>CreateAccountResponse</p>
 */
public class CreateAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAccountResponseBody body;

    private CreateAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAccountResponse create() {
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
    public CreateAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAccountResponseBody body);

        @Override
        CreateAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAccountResponse response) {
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
        public Builder body(CreateAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAccountResponse build() {
            return new CreateAccountResponse(this);
        } 

    } 

}
