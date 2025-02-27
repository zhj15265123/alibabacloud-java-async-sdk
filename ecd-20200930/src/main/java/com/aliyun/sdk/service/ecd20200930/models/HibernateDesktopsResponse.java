// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HibernateDesktopsResponse} extends {@link TeaModel}
 *
 * <p>HibernateDesktopsResponse</p>
 */
public class HibernateDesktopsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HibernateDesktopsResponseBody body;

    private HibernateDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HibernateDesktopsResponse create() {
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
    public HibernateDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HibernateDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HibernateDesktopsResponseBody body);

        @Override
        HibernateDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HibernateDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HibernateDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HibernateDesktopsResponse response) {
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
        public Builder body(HibernateDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HibernateDesktopsResponse build() {
            return new HibernateDesktopsResponse(this);
        } 

    } 

}
