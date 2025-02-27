// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLifecycleResponse} extends {@link TeaModel}
 *
 * <p>GetLifecycleResponse</p>
 */
public class GetLifecycleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLifecycleResponseBody body;

    private GetLifecycleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLifecycleResponse create() {
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
    public GetLifecycleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLifecycleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLifecycleResponseBody body);

        @Override
        GetLifecycleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLifecycleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLifecycleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLifecycleResponse response) {
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
        public Builder body(GetLifecycleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLifecycleResponse build() {
            return new GetLifecycleResponse(this);
        } 

    } 

}
