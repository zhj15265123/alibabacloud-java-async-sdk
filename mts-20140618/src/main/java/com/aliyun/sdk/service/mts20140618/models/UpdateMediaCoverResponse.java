// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMediaCoverResponse} extends {@link TeaModel}
 *
 * <p>UpdateMediaCoverResponse</p>
 */
public class UpdateMediaCoverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMediaCoverResponseBody body;

    private UpdateMediaCoverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMediaCoverResponse create() {
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
    public UpdateMediaCoverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMediaCoverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMediaCoverResponseBody body);

        @Override
        UpdateMediaCoverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMediaCoverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMediaCoverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMediaCoverResponse response) {
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
        public Builder body(UpdateMediaCoverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMediaCoverResponse build() {
            return new UpdateMediaCoverResponse(this);
        } 

    } 

}
