// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartLoadBalancerListenerResponse} extends {@link TeaModel}
 *
 * <p>StartLoadBalancerListenerResponse</p>
 */
public class StartLoadBalancerListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartLoadBalancerListenerResponseBody body;

    private StartLoadBalancerListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartLoadBalancerListenerResponse create() {
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
    public StartLoadBalancerListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartLoadBalancerListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartLoadBalancerListenerResponseBody body);

        @Override
        StartLoadBalancerListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartLoadBalancerListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartLoadBalancerListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartLoadBalancerListenerResponse response) {
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
        public Builder body(StartLoadBalancerListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartLoadBalancerListenerResponse build() {
            return new StartLoadBalancerListenerResponse(this);
        } 

    } 

}
