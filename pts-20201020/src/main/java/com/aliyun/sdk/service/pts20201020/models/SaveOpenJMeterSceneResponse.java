// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveOpenJMeterSceneResponse} extends {@link TeaModel}
 *
 * <p>SaveOpenJMeterSceneResponse</p>
 */
public class SaveOpenJMeterSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveOpenJMeterSceneResponseBody body;

    private SaveOpenJMeterSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveOpenJMeterSceneResponse create() {
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
    public SaveOpenJMeterSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveOpenJMeterSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveOpenJMeterSceneResponseBody body);

        @Override
        SaveOpenJMeterSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveOpenJMeterSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveOpenJMeterSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveOpenJMeterSceneResponse response) {
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
        public Builder body(SaveOpenJMeterSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveOpenJMeterSceneResponse build() {
            return new SaveOpenJMeterSceneResponse(this);
        } 

    } 

}
