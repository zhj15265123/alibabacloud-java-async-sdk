// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPtsSceneResponse} extends {@link TeaModel}
 *
 * <p>GetPtsSceneResponse</p>
 */
public class GetPtsSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPtsSceneResponseBody body;

    private GetPtsSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPtsSceneResponse create() {
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
    public GetPtsSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPtsSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPtsSceneResponseBody body);

        @Override
        GetPtsSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPtsSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPtsSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPtsSceneResponse response) {
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
        public Builder body(GetPtsSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPtsSceneResponse build() {
            return new GetPtsSceneResponse(this);
        } 

    } 

}
