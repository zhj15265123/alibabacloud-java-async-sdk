// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyForwardEntryResponse} extends {@link TeaModel}
 *
 * <p>ModifyForwardEntryResponse</p>
 */
public class ModifyForwardEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyForwardEntryResponseBody body;

    private ModifyForwardEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyForwardEntryResponse create() {
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
    public ModifyForwardEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyForwardEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyForwardEntryResponseBody body);

        @Override
        ModifyForwardEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyForwardEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyForwardEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyForwardEntryResponse response) {
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
        public Builder body(ModifyForwardEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyForwardEntryResponse build() {
            return new ModifyForwardEntryResponse(this);
        } 

    } 

}
