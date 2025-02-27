// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMcubeWhitelistResponse} extends {@link TeaModel}
 *
 * <p>DeleteMcubeWhitelistResponse</p>
 */
public class DeleteMcubeWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMcubeWhitelistResponseBody body;

    private DeleteMcubeWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMcubeWhitelistResponse create() {
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
    public DeleteMcubeWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMcubeWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMcubeWhitelistResponseBody body);

        @Override
        DeleteMcubeWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMcubeWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMcubeWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMcubeWhitelistResponse response) {
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
        public Builder body(DeleteMcubeWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMcubeWhitelistResponse build() {
            return new DeleteMcubeWhitelistResponse(this);
        } 

    } 

}
