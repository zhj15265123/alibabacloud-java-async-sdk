// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDesktopGroupTimerResponse} extends {@link TeaModel}
 *
 * <p>SetDesktopGroupTimerResponse</p>
 */
public class SetDesktopGroupTimerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDesktopGroupTimerResponseBody body;

    private SetDesktopGroupTimerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDesktopGroupTimerResponse create() {
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
    public SetDesktopGroupTimerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDesktopGroupTimerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDesktopGroupTimerResponseBody body);

        @Override
        SetDesktopGroupTimerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDesktopGroupTimerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDesktopGroupTimerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDesktopGroupTimerResponse response) {
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
        public Builder body(SetDesktopGroupTimerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDesktopGroupTimerResponse build() {
            return new SetDesktopGroupTimerResponse(this);
        } 

    } 

}
