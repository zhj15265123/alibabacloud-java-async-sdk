// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateVpnGatewayWithCertificateResponse} extends {@link TeaModel}
 *
 * <p>DissociateVpnGatewayWithCertificateResponse</p>
 */
public class DissociateVpnGatewayWithCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DissociateVpnGatewayWithCertificateResponseBody body;

    private DissociateVpnGatewayWithCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DissociateVpnGatewayWithCertificateResponse create() {
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
    public DissociateVpnGatewayWithCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DissociateVpnGatewayWithCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DissociateVpnGatewayWithCertificateResponseBody body);

        @Override
        DissociateVpnGatewayWithCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DissociateVpnGatewayWithCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DissociateVpnGatewayWithCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DissociateVpnGatewayWithCertificateResponse response) {
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
        public Builder body(DissociateVpnGatewayWithCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DissociateVpnGatewayWithCertificateResponse build() {
            return new DissociateVpnGatewayWithCertificateResponse(this);
        } 

    } 

}
