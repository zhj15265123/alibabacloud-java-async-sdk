// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveStreamOptimizedFeatureConfigResponse} extends {@link TeaModel}
 *
 * <p>SetLiveStreamOptimizedFeatureConfigResponse</p>
 */
public class SetLiveStreamOptimizedFeatureConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLiveStreamOptimizedFeatureConfigResponseBody body;

    private SetLiveStreamOptimizedFeatureConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLiveStreamOptimizedFeatureConfigResponse create() {
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
    public SetLiveStreamOptimizedFeatureConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLiveStreamOptimizedFeatureConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLiveStreamOptimizedFeatureConfigResponseBody body);

        @Override
        SetLiveStreamOptimizedFeatureConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLiveStreamOptimizedFeatureConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLiveStreamOptimizedFeatureConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLiveStreamOptimizedFeatureConfigResponse response) {
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
        public Builder body(SetLiveStreamOptimizedFeatureConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLiveStreamOptimizedFeatureConfigResponse build() {
            return new SetLiveStreamOptimizedFeatureConfigResponse(this);
        } 

    } 

}
