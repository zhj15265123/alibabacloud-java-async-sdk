// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHybridClusterResponse} extends {@link TeaModel}
 *
 * <p>CreateHybridClusterResponse</p>
 */
public class CreateHybridClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHybridClusterResponseBody body;

    private CreateHybridClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHybridClusterResponse create() {
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
    public CreateHybridClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHybridClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHybridClusterResponseBody body);

        @Override
        CreateHybridClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHybridClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHybridClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHybridClusterResponse response) {
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
        public Builder body(CreateHybridClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHybridClusterResponse build() {
            return new CreateHybridClusterResponse(this);
        } 

    } 

}
