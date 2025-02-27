// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopTestingJMeterSceneResponse} extends {@link TeaModel}
 *
 * <p>StopTestingJMeterSceneResponse</p>
 */
public class StopTestingJMeterSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopTestingJMeterSceneResponseBody body;

    private StopTestingJMeterSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopTestingJMeterSceneResponse create() {
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
    public StopTestingJMeterSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopTestingJMeterSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopTestingJMeterSceneResponseBody body);

        @Override
        StopTestingJMeterSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopTestingJMeterSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopTestingJMeterSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopTestingJMeterSceneResponse response) {
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
        public Builder body(StopTestingJMeterSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopTestingJMeterSceneResponse build() {
            return new StopTestingJMeterSceneResponse(this);
        } 

    } 

}
