// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNatFirewallControlPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateNatFirewallControlPolicyResponse</p>
 */
public class CreateNatFirewallControlPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNatFirewallControlPolicyResponseBody body;

    private CreateNatFirewallControlPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNatFirewallControlPolicyResponse create() {
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
    public CreateNatFirewallControlPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNatFirewallControlPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNatFirewallControlPolicyResponseBody body);

        @Override
        CreateNatFirewallControlPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNatFirewallControlPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNatFirewallControlPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNatFirewallControlPolicyResponse response) {
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
        public Builder body(CreateNatFirewallControlPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNatFirewallControlPolicyResponse build() {
            return new CreateNatFirewallControlPolicyResponse(this);
        } 

    } 

}
