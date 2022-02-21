// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomizationConfigListResponse} extends {@link TeaModel}
 *
 * <p>GetCustomizationConfigListResponse</p>
 */
public class GetCustomizationConfigListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCustomizationConfigListResponseBody body;

    private GetCustomizationConfigListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCustomizationConfigListResponse create() {
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
    public GetCustomizationConfigListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCustomizationConfigListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCustomizationConfigListResponseBody body);

        @Override
        GetCustomizationConfigListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCustomizationConfigListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCustomizationConfigListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCustomizationConfigListResponse response) {
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
        public Builder body(GetCustomizationConfigListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCustomizationConfigListResponse build() {
            return new GetCustomizationConfigListResponse(this);
        } 

    } 

}
