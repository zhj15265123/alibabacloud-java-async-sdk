// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseGPUInstanceResponse} extends {@link TeaModel}
 *
 * <p>ReleaseGPUInstanceResponse</p>
 */
public class ReleaseGPUInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private ReleaseGPUInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static ReleaseGPUInstanceResponse create() {
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

    public interface Builder extends Response.Builder<ReleaseGPUInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        ReleaseGPUInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseGPUInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseGPUInstanceResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public ReleaseGPUInstanceResponse build() {
            return new ReleaseGPUInstanceResponse(this);
        } 

    } 

}
