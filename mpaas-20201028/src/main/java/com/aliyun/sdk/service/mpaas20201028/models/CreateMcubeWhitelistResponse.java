// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeWhitelistResponse} extends {@link TeaModel}
 *
 * <p>CreateMcubeWhitelistResponse</p>
 */
public class CreateMcubeWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcubeWhitelistResponseBody body;

    private CreateMcubeWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcubeWhitelistResponse create() {
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
    public CreateMcubeWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcubeWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcubeWhitelistResponseBody body);

        @Override
        CreateMcubeWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcubeWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcubeWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcubeWhitelistResponse response) {
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
        public Builder body(CreateMcubeWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcubeWhitelistResponse build() {
            return new CreateMcubeWhitelistResponse(this);
        } 

    } 

}
