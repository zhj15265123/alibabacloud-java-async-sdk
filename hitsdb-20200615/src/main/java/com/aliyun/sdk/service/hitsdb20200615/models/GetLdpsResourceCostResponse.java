// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLdpsResourceCostResponse} extends {@link TeaModel}
 *
 * <p>GetLdpsResourceCostResponse</p>
 */
public class GetLdpsResourceCostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLdpsResourceCostResponseBody body;

    private GetLdpsResourceCostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLdpsResourceCostResponse create() {
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
    public GetLdpsResourceCostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLdpsResourceCostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLdpsResourceCostResponseBody body);

        @Override
        GetLdpsResourceCostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLdpsResourceCostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLdpsResourceCostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLdpsResourceCostResponse response) {
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
        public Builder body(GetLdpsResourceCostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLdpsResourceCostResponse build() {
            return new GetLdpsResourceCostResponse(this);
        } 

    } 

}
