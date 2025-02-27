// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddOrUpdateDisPlayModesResponse} extends {@link TeaModel}
 *
 * <p>AddOrUpdateDisPlayModesResponse</p>
 */
public class AddOrUpdateDisPlayModesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddOrUpdateDisPlayModesResponseBody body;

    private AddOrUpdateDisPlayModesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddOrUpdateDisPlayModesResponse create() {
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
    public AddOrUpdateDisPlayModesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddOrUpdateDisPlayModesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddOrUpdateDisPlayModesResponseBody body);

        @Override
        AddOrUpdateDisPlayModesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddOrUpdateDisPlayModesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddOrUpdateDisPlayModesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddOrUpdateDisPlayModesResponse response) {
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
        public Builder body(AddOrUpdateDisPlayModesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddOrUpdateDisPlayModesResponse build() {
            return new AddOrUpdateDisPlayModesResponse(this);
        } 

    } 

}
