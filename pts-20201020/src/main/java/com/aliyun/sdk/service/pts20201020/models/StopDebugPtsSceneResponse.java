// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDebugPtsSceneResponse} extends {@link TeaModel}
 *
 * <p>StopDebugPtsSceneResponse</p>
 */
public class StopDebugPtsSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDebugPtsSceneResponseBody body;

    private StopDebugPtsSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDebugPtsSceneResponse create() {
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
    public StopDebugPtsSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDebugPtsSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDebugPtsSceneResponseBody body);

        @Override
        StopDebugPtsSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDebugPtsSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDebugPtsSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDebugPtsSceneResponse response) {
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
        public Builder body(StopDebugPtsSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDebugPtsSceneResponse build() {
            return new StopDebugPtsSceneResponse(this);
        } 

    } 

}
