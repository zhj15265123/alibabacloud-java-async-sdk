// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportMappCenterAppConfigResponse} extends {@link TeaModel}
 *
 * <p>ExportMappCenterAppConfigResponse</p>
 */
public class ExportMappCenterAppConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportMappCenterAppConfigResponseBody body;

    private ExportMappCenterAppConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportMappCenterAppConfigResponse create() {
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
    public ExportMappCenterAppConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportMappCenterAppConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportMappCenterAppConfigResponseBody body);

        @Override
        ExportMappCenterAppConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportMappCenterAppConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportMappCenterAppConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportMappCenterAppConfigResponse response) {
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
        public Builder body(ExportMappCenterAppConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportMappCenterAppConfigResponse build() {
            return new ExportMappCenterAppConfigResponse(this);
        } 

    } 

}
