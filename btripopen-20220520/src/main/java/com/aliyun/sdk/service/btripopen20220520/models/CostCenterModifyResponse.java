// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CostCenterModifyResponse} extends {@link TeaModel}
 *
 * <p>CostCenterModifyResponse</p>
 */
public class CostCenterModifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CostCenterModifyResponseBody body;

    private CostCenterModifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CostCenterModifyResponse create() {
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
    public CostCenterModifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CostCenterModifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CostCenterModifyResponseBody body);

        @Override
        CostCenterModifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CostCenterModifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CostCenterModifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CostCenterModifyResponse response) {
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
        public Builder body(CostCenterModifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CostCenterModifyResponse build() {
            return new CostCenterModifyResponse(this);
        } 

    } 

}
