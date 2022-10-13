// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FailCardsResponse} extends {@link TeaModel}
 *
 * <p>FailCardsResponse</p>
 */
public class FailCardsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FailCardsResponseBody body;

    private FailCardsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FailCardsResponse create() {
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
    public FailCardsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FailCardsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FailCardsResponseBody body);

        @Override
        FailCardsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FailCardsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FailCardsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FailCardsResponse response) {
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
        public Builder body(FailCardsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FailCardsResponse build() {
            return new FailCardsResponse(this);
        } 

    } 

}
