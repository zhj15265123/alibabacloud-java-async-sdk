// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPtsSceneBaseLineResponse} extends {@link TeaModel}
 *
 * <p>GetPtsSceneBaseLineResponse</p>
 */
public class GetPtsSceneBaseLineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPtsSceneBaseLineResponseBody body;

    private GetPtsSceneBaseLineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPtsSceneBaseLineResponse create() {
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
    public GetPtsSceneBaseLineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPtsSceneBaseLineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPtsSceneBaseLineResponseBody body);

        @Override
        GetPtsSceneBaseLineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPtsSceneBaseLineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPtsSceneBaseLineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPtsSceneBaseLineResponse response) {
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
        public Builder body(GetPtsSceneBaseLineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPtsSceneBaseLineResponse build() {
            return new GetPtsSceneBaseLineResponse(this);
        } 

    } 

}
