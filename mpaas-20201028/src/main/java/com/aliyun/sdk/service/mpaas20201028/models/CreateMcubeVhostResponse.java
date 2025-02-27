// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeVhostResponse} extends {@link TeaModel}
 *
 * <p>CreateMcubeVhostResponse</p>
 */
public class CreateMcubeVhostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcubeVhostResponseBody body;

    private CreateMcubeVhostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcubeVhostResponse create() {
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
    public CreateMcubeVhostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcubeVhostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcubeVhostResponseBody body);

        @Override
        CreateMcubeVhostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcubeVhostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcubeVhostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcubeVhostResponse response) {
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
        public Builder body(CreateMcubeVhostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcubeVhostResponse build() {
            return new CreateMcubeVhostResponse(this);
        } 

    } 

}
