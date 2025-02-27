// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcubeNebulaAppResponse} extends {@link TeaModel}
 *
 * <p>CreateMcubeNebulaAppResponse</p>
 */
public class CreateMcubeNebulaAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcubeNebulaAppResponseBody body;

    private CreateMcubeNebulaAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcubeNebulaAppResponse create() {
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
    public CreateMcubeNebulaAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcubeNebulaAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcubeNebulaAppResponseBody body);

        @Override
        CreateMcubeNebulaAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcubeNebulaAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcubeNebulaAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcubeNebulaAppResponse response) {
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
        public Builder body(CreateMcubeNebulaAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcubeNebulaAppResponse build() {
            return new CreateMcubeNebulaAppResponse(this);
        } 

    } 

}
