// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateRouteTableFromGatewayResponse} extends {@link TeaModel}
 *
 * <p>DissociateRouteTableFromGatewayResponse</p>
 */
public class DissociateRouteTableFromGatewayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DissociateRouteTableFromGatewayResponseBody body;

    private DissociateRouteTableFromGatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DissociateRouteTableFromGatewayResponse create() {
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
    public DissociateRouteTableFromGatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DissociateRouteTableFromGatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DissociateRouteTableFromGatewayResponseBody body);

        @Override
        DissociateRouteTableFromGatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DissociateRouteTableFromGatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DissociateRouteTableFromGatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DissociateRouteTableFromGatewayResponse response) {
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
        public Builder body(DissociateRouteTableFromGatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DissociateRouteTableFromGatewayResponse build() {
            return new DissociateRouteTableFromGatewayResponse(this);
        } 

    } 

}
