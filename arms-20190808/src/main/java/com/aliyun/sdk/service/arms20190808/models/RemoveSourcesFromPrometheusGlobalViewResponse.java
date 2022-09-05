// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSourcesFromPrometheusGlobalViewResponse} extends {@link TeaModel}
 *
 * <p>RemoveSourcesFromPrometheusGlobalViewResponse</p>
 */
public class RemoveSourcesFromPrometheusGlobalViewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveSourcesFromPrometheusGlobalViewResponseBody body;

    private RemoveSourcesFromPrometheusGlobalViewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveSourcesFromPrometheusGlobalViewResponse create() {
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
    public RemoveSourcesFromPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveSourcesFromPrometheusGlobalViewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveSourcesFromPrometheusGlobalViewResponseBody body);

        @Override
        RemoveSourcesFromPrometheusGlobalViewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveSourcesFromPrometheusGlobalViewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveSourcesFromPrometheusGlobalViewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveSourcesFromPrometheusGlobalViewResponse response) {
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
        public Builder body(RemoveSourcesFromPrometheusGlobalViewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveSourcesFromPrometheusGlobalViewResponse build() {
            return new RemoveSourcesFromPrometheusGlobalViewResponse(this);
        } 

    } 

}
