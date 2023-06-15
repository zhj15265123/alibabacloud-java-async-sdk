// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSlotResponse} extends {@link TeaModel}
 *
 * <p>DeleteSlotResponse</p>
 */
public class DeleteSlotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSlotResponseBody body;

    private DeleteSlotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSlotResponse create() {
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
    public DeleteSlotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSlotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSlotResponseBody body);

        @Override
        DeleteSlotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSlotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSlotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSlotResponse response) {
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
        public Builder body(DeleteSlotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSlotResponse build() {
            return new DeleteSlotResponse(this);
        } 

    } 

}
