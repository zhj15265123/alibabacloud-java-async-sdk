// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHybridClusterConfigResponse} extends {@link TeaModel}
 *
 * <p>GetHybridClusterConfigResponse</p>
 */
public class GetHybridClusterConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHybridClusterConfigResponseBody body;

    private GetHybridClusterConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHybridClusterConfigResponse create() {
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
    public GetHybridClusterConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHybridClusterConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHybridClusterConfigResponseBody body);

        @Override
        GetHybridClusterConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHybridClusterConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHybridClusterConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHybridClusterConfigResponse response) {
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
        public Builder body(GetHybridClusterConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHybridClusterConfigResponse build() {
            return new GetHybridClusterConfigResponse(this);
        } 

    } 

}
