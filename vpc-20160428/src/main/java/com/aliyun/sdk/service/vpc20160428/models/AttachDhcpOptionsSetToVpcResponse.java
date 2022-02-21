// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDhcpOptionsSetToVpcResponse} extends {@link TeaModel}
 *
 * <p>AttachDhcpOptionsSetToVpcResponse</p>
 */
public class AttachDhcpOptionsSetToVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachDhcpOptionsSetToVpcResponseBody body;

    private AttachDhcpOptionsSetToVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachDhcpOptionsSetToVpcResponse create() {
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
    public AttachDhcpOptionsSetToVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachDhcpOptionsSetToVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachDhcpOptionsSetToVpcResponseBody body);

        @Override
        AttachDhcpOptionsSetToVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachDhcpOptionsSetToVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachDhcpOptionsSetToVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachDhcpOptionsSetToVpcResponse response) {
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
        public Builder body(AttachDhcpOptionsSetToVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachDhcpOptionsSetToVpcResponse build() {
            return new AttachDhcpOptionsSetToVpcResponse(this);
        } 

    } 

}
