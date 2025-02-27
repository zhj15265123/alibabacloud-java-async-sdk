// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceShareResponse} extends {@link TeaModel}
 *
 * <p>UpdateResourceShareResponse</p>
 */
public class UpdateResourceShareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateResourceShareResponseBody body;

    private UpdateResourceShareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateResourceShareResponse create() {
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
    public UpdateResourceShareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateResourceShareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateResourceShareResponseBody body);

        @Override
        UpdateResourceShareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateResourceShareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateResourceShareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateResourceShareResponse response) {
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
        public Builder body(UpdateResourceShareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateResourceShareResponse build() {
            return new UpdateResourceShareResponse(this);
        } 

    } 

}
